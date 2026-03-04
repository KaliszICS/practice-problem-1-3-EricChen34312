import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void readFileTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    assertEquals("Hello\nWorld\n", (String)method.invoke(null, "file2.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
@Test
@DisplayName("")
void backwardsReadFileTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
    assertEquals("\ndlroW olleH", (String)method.invoke(null, "file.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
@Test
@DisplayName("")
void backwardsReadFileTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
      assertEquals("\n654321", (String)method.invoke(null, "file1.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
@Test
@DisplayName("")
void backwardsReadFileTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
      assertEquals("\ndlroW\nolleH", (String)method.invoke(null, "file2.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
@Test
@DisplayName("")
void readFileTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    
    assertEquals("123456\n", (String)method.invoke(null, "file1.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
@Test
@DisplayName("")
void readFileTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    
    assertEquals("Hello World\n", (String)method.invoke(null, "file.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail(e.getMessage());
}
}
}
