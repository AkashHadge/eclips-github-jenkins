import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest123 {
  @Test
  public void f() {
	  System.out.println("Hello akashTest1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hello akashTest2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Hello akashTest3");
  }

}
