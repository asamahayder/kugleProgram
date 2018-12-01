import static org.junit.Assert.*;

public class KugleTest {

    @org.junit.Test
    public void beregnVolumen() {
        Kugle kugle = new Kugle(3);
        double volumen = kugle.beregnVolumen();

        assertEquals(113.097,volumen,0.001);
        System.out.println("Heeeeeeeeeeeeeej med dig");
    }
}