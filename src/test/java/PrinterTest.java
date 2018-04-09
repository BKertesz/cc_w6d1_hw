import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void setup(){
        myPrinter= new Printer(1000,100);
    }

    @Test
    public void hasPages(){
        assertEquals(1000,myPrinter.pagesLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(100, myPrinter.tonerLeft());
    }

    @Test
    public void canPrint(){
        assertEquals(16,myPrinter.print(4,4));
    }

    @Test
    public void cantPrint(){
        assertEquals(0,myPrinter.print(200,8));
    }

    @Test
    public void canRefillPaper(){
        myPrinter.print(20,3);
        myPrinter.refillPaper();
        assertEquals(1000,myPrinter.pagesLeft());
    }

    @Test
    public void canRefillToner(){
        myPrinter.print(100,2);
        myPrinter.refillToner();
        assertEquals(100,myPrinter.tonerLeft());
    }

    @Test
    public void noTonerPrint(){
        myPrinter.tonerLeak();
        assertEquals(0,myPrinter.print(15,2));

    }





}
