import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bkmiecik on 02.06.17.
 */
public class UserTest {


    @Test
    public void testCheckPassword() throws Exception {
        User user = new User("name");

        assertEquals("01",true,user.checkPassword("k[8mDV8zG5"));
        assertEquals("02",true,user.checkPassword("r4zXNC>,EY"));
        assertEquals("03",true,user.checkPassword("S&MlJK1K,}"));
        assertEquals("04",true,user.checkPassword("SLzhhod.n0"));
        assertEquals("05",true,user.checkPassword("p*m>@4cBV!"));
        assertEquals("06",true,user.checkPassword("(OKjdEhS6x"));
        assertEquals("07",true,user.checkPassword("yQT.)v4W"));
        assertEquals("08",true,user.checkPassword("90DE1me^"));
        assertEquals("09",true,user.checkPassword("24M=o>D3"));
        assertEquals("10",true,user.checkPassword("*6$kfWohZr"));
        assertEquals("11",true,user.checkPassword("k{uN5E;Gd"));
        assertEquals("12",true,user.checkPassword(")ShEBXy!FX4"));
        assertEquals("13",true,user.checkPassword("90DE1me^"));
        assertEquals("14",true,user.checkPassword("oa6+Q_^c6"));
        assertEquals("15",true,user.checkPassword("7qD2x3;?f#"));
        assertEquals("16",true,user.checkPassword("w69v[)KFa"));
        assertEquals("17",true,user.checkPassword("#_JvVa;5M"));

        assertEquals("18",false,user.checkPassword("#_JvVa;5M"));
        assertEquals("20",false,user.checkPassword("ącbdnsdf1*D"));
        assertEquals("21",false,user.checkPassword("šZw')0.rUS"));
        assertEquals("22",false,user.checkPassword("ki&8g9D"));
        assertEquals("23",false,user.checkPassword("YPęl/U`x8~"));
        assertEquals("24",false,user.checkPassword("a6(6K2~#!ć"));
        assertEquals("25",false,user.checkPassword("~NrjF/Z7~<"));
        assertEquals("26",false,user.checkPassword("Pwa+;Me!,ó"));
        assertEquals("27",false,user.checkPassword("LUNUGzVW3N"));
        assertEquals("28",false,user.checkPassword("8mK){:$=)R"));
        assertEquals("29",false,user.checkPassword("AóKaótxX$O"));
        assertEquals("30",false,user.checkPassword("!LPIaAghwj"));
        assertEquals("31",false,user.checkPassword(";DESeWĘ5"));
        assertEquals("32",false,user.checkPassword("ZYz/9w7>"));
        assertEquals("33",false,user.checkPassword("aXSoib,("));
        assertEquals("34",false,user.checkPassword("Ó5f?`|w&"));
        assertEquals("35",false,user.checkPassword("(kmI'`GĆ"));
        assertEquals("36",false,user.checkPassword("V6Ľqan]D"));
        assertEquals("37",false,user.checkPassword("d*Q<A.V?"));
        assertEquals("38",false,user.checkPassword("Ć6^~aWqr"));
        assertEquals("39",false,user.checkPassword("w69v[)KFa"));
        assertEquals("40",false,user.checkPassword("<DP.dMYb"));
        assertEquals("41",false,user.checkPassword("ŃoŻ:F`Kv"));
        assertEquals("42",false,user.checkPassword("4o$FĆ)@u"));
    }

}