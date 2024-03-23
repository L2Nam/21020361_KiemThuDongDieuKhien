import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

     @Test
     public void testDoPhuC2_1() {
         assertEquals("Invalid error", Main.tinhHocPhi(1, -2));
     }

     @Test
     public void testDoPhuC2_2() {
         assertEquals("750k", Main.tinhHocPhi(1, 3));

     }

     @Test
     public void testDoPhuC2_3() {
         assertEquals("1940k", Main.tinhHocPhi(1, 8));
     }

     @Test
     public void testDoPhuC2_4() {
         assertEquals("3280k", Main.tinhHocPhi(1, 14));
     }

     @Test
     public void testDoPhuC2_5() {
         assertEquals("4100k", Main.tinhHocPhi(1, 18));
     }

     @Test
     public void testDoPhuC2_6() {
         assertEquals("2400k", Main.tinhHocPhi(2, 12));
     }

     @Test
     public void testDoPhuC2_7() {
         assertEquals("3300k", Main.tinhHocPhi(2, 17));
     }

     @Test
     public void testDoPhuC2_8() {
         assertEquals("1050k", Main.tinhHocPhi(3, 7));
     }

     @Test
     public void testDoPhuC2_9() {
         assertEquals("Invalid error", Main.tinhHocPhi(4, 9));
     }
}
