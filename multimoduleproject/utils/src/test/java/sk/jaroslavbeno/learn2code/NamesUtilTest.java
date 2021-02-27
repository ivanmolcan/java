package sk.jaroslavbeno.learn2code;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamesUtilTest {

    @Test
    public void creatorJeJaroslavBeno(){
        assertEquals("Jaroslav Beno", NamesUtil.CREATOR);
    }
}