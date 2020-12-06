package basics;

import org.junit.jupiter.api.*;

public class Example1 {

    @BeforeAll
    public static void setUp() {
        System.out.println("This message will be displayed once before executing all testing methods");
    }

    @BeforeEach
    public void init() {
        System.out.println("This message will be displayed before execution of each testing method");

    }

    @AfterEach
    public void tear() {
        System.out.println("This message will be displayed after execution of each testing method");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This message will be displayed once after executing all testing methods");

    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    public void  secondTest() {
        System.out.println("Executing second test...");
    }

    @Test
    @DisplayName("Third test")
    public void thirdTest() {
        System.out.println("Executing third test...");
    }

    @Test
    @Disabled
    public void fourthTest() {
        System.out.println("Executing fourth test...");
    }
}
