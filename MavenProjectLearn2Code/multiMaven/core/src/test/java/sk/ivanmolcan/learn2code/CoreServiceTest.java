package sk.ivanmolcan.learn2code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoreServiceTest {

    @Test
    public void creatorJeIvam(){
        assertEquals(NamesUtil.CREATOR, "Ivan");
    }

}