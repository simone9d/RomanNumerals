import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({TestRomanNumerals.class, TestRomanException.class, TestRoman.class})
public class AllTests {

}
