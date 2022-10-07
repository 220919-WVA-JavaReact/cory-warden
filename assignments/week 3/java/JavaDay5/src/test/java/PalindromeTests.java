
import com.revature.testing.Palindrome;
import org.junit.*;

public class PalindromeTests {

    static Palindrome p;
    static String s;

    @Before
    public void setUp() {
        s = null;
        p = new Palindrome();
    }


    //test if non palindrome will result in false
    @Test
    public void isNotPalindromeCheck(){
        String s = "bugs";

        System.out.println("Test checking if the palindrome gives false when not matching.");
        Assert.assertFalse(p.isPalindrome(s));
    }

    //test if palindrome will result in true
    @Test
    public void isPalindromeCheck() {
        String s = "racecar";

        System.out.println("Test checking if the palindrome gives true when matching.");
        Assert.assertTrue(p.isPalindrome(s));
    }

    //test if null will properly point to null
    @Test(expected = NullPointerException.class)
    public void nullPalindromeCheck() {
        p.isPalindrome(null);
    }

    //Test to remove white space
    @Test
    public void whiteSpaceCheck() {
        String s = " ra c e   ca r";

        Assert.assertTrue(p.isPalindrome(s));
    }

    //test to ensure caps will go lowercase
    @Test
    public void lowerCaseCheck() {
        String s = "RACECAr";

        Assert.assertTrue(p.isPalindrome(s));
    }

}


