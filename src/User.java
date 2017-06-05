import java.util.ArrayList;
import java.util.List;

/**
 * Created by bkmiecik on 02.06.17.
 */
public class User {

    String username;
    List<String> passwords; //current password - highest index

    public User(String username) {
        this.username = username;
        this.passwords = new ArrayList<>();
    }
		
		
    public void updatePassordsList(String newPassword){
        if(passwords.size()==3)
            passwords.remove(0);
        passwords.add(newPassword);
    }
		
    public boolean checkPassword(String pass){
        int num=0;
        int big=0;
        int spe=0;

        if(pass.length()<8){
            System.out.println("za krótkie hasło ("+pass.length()+"<8)");
            return false;
        }

        for(String p: passwords){
            if(p.equals(pass)){
                System.out.println("hasło już istnieje")
                ;return false;
            }
        }

        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)>='0' && pass.charAt(i)<='9') num++;
            else if((pass.charAt(i)>=33 && pass.charAt(i)<=46) ||
                    (pass.charAt(i)>=59 && pass.charAt(i)<=64) ||
                    (pass.charAt(i)>=91 && pass.charAt(i)<=96) ||
                    (pass.charAt(i)>=123 && pass.charAt(i)<=126))
                spe++;
            else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
                big++;
            else if(pass.charAt(i)>'z' || pass.charAt(i)<'a'){
                System.out.println("niedozwolony znak "+pass.charAt(i));
                return false;
            }
        }

        if(num>0 && big>0 && spe>0){
            updatePassordsList(pass);
            return true;
        }
        else{
            System.out.println("liczb: "+num+" dużych liter: "+big+" znaków specjalnych: "+spe);
            return false;
        }
    }

}
