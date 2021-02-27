package sk.ivanmolcan.learn2code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NamesUtilTest {

    @Test
    public void creatorJeIvan(){
//        assertTrue("Ivan".equals("NamesUtil.CREATOR"));
        //Simplify version
        assertEquals(NamesUtil.CREATOR, "Ivan");
    }

}