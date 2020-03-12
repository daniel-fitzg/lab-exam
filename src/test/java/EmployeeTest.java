import com.Employee;
import org.junit.jupiter.api.*;

/*
* Daniel Fitzgerald
* Lab Exam 12/03/2020
* Group A
*
* Employee Test class designed to test the creation of instances of the Employee class. The series of tests contain a
* call to the Employee constructor and then test whether an Illegal Argument Exception has been thrown.
*
* Each test verifies that if an invalid argument is passed to the constructor, the relevant exception is thrown along with
* the correct exception message.
* */

public class EmployeeTest {

    @BeforeAll
    static void setup() {
        System.out.println("Running Employee Tests");
    }

    @AfterAll
    static void end() {
        System.out.println("Tests complete");
    }

    @DisplayName("Testing Employee Constructor with all valid arguments")
    @Test
    void testCreateEmployeeWithValidArgs() {
        Assertions.assertDoesNotThrow(() -> {
            new Employee(
                    "Miss",
                    "Samantha",
                    "12345A",
                    "0871234",
                    "Part-time",
                    18);
        });
    }

    @DisplayName("Testing Employee Constructor with invalid title")
    @Test
    void testCreateEmployeeWithInvalidTitle() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Sir",
                    "Daniel",
                    "12345A",
                    "0871234",
                    "Full-time",
                    18);
        });

        Assertions.assertEquals("Invalid title entered", exception.getMessage());
    }

    @DisplayName("Testing Employee Constructor with invalid name")
    @Test
    void testCreateEmployeeWithInvalidName() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "Dani", // 4 character length
                    "12345A",
                    "0871234",
                    "Full-time",
                    18);
        });

        Assertions.assertEquals("Invalid name entered", exception.getMessage());

        exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "DanielDanielDanielDanie", // 23 character length
                    "12345A",
                    "0871234",
                    "Full-time",
                    18);
        });

        Assertions.assertEquals("Invalid name entered", exception.getMessage());
    }

    @DisplayName("Testing Employee Constructor with invalid PPS")
    @Test
    void testCreateEmployeeWithInvalidPPS() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "Daniel",
                    "12345",
                    "0871234",
                    "Full-time",
                    18);
        });

        Assertions.assertEquals("Invalid PPS entered", exception.getMessage());
    }

    @DisplayName("Testing Employee Constructor with invalid phone")
    @Test
    void testCreateEmployeeWithInvalidPhone() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "Daniel",
                    "12345A",
                    "087123",   // Length of 6
                    "Full-time",
                    18);
        });

        Assertions.assertEquals("Invalid phone entered", exception.getMessage());
    }

    @DisplayName("Testing Employee Constructor with invalid employee type")
    @Test
    void testCreateEmployeeWithInvalidEmploymentType() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "Daniel",
                    "12345A",
                    "0871234",
                    "n/a",
                    18);
        });

        Assertions.assertEquals("Invalid employment type entered", exception.getMessage());
    }

    @DisplayName("Testing Employee Constructor with invalid age")
    @Test
    void testCreateEmployeeWithInvalidAge() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee(
                    "Mr",
                    "Daniel",
                    "12345A",
                    "0871234",
                    "Full-Time",
                    17);
        });

        Assertions.assertEquals("Invalid age entered", exception.getMessage());
    }
}
