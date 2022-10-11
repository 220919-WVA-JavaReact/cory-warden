import com.revature.testing.Calculator;
import com.revature.testing.DivideByZeroException;
import org.junit.*;

public class CalculatorTest {

    //below here we'll introduce methods to begin testing our object

    //To test our calc we'll need a testing object
    static Calculator calc;

    //value above is null. Could instantiate it but we will use dependency injection to handle it.
    //To create a new calc object, use a before class annotation before test methods are ran.

    //Run before class
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("This runs before the entire class, but only once.");
        calc = new Calculator();
    }

    @AfterClass
    public static void setUpAfterClass() {
        System.out.println("This runs after the entire class, but only once.");
    }

    @Before
    public void beforeEach() {
        System.out.println("This runs before each test.");
    }

    @After
    public void afterEach() {
        System.out.println("This runs after each test.");
    }

    //Checking that two numbers added together equal proper sum.
    @Test
    public void positiveAddTest() {
        //assertEquals(expected, actual output)
        System.out.println("Testing positive addition test");
        Assert.assertEquals(4, calc.addNumbers(2,2));
    }

    @Test
    public void negativeAddTest() {
        System.out.println("Testing negative addition test");
        Assert.assertNotEquals(0, calc.subNumbers(2, 3));
    }

    @Test(expected = DivideByZeroException.class)
    public void testDivideByZero() {
        System.out.println("Test diving number by zero.");
        System.out.println(calc.divideNumbers(2, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testIntDivideByZero() {
        calc.division(2, 0);
    }


}
