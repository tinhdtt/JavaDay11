import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Example")
class Demo {
    Calculator cal = new Calculator();

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @Test
    @DisplayName("Test multiplication")
    void testMultiplication() {
        assertEquals(6, cal.multiplication(2, 3));
        assertNotEquals(12, cal.multiplication(2, 4));
    }


    @Test
    @DisplayName("Test division")
    void testDivision() {
        assertEquals(6, cal.division(12, 2));
        assertNotEquals(12, cal.division(12, 34));
    }

    @Test
    @DisplayName("Test assert")
    void assertTest() {
        String str1 = null;
        String str2 = "Tôi học java";
        String str3 = "Tôi học java";
        assertTrue(true);
        assertFalse(false);
        assertTrue(5>3, "5 is greater than 3");
        assertTrue(null == null, "null == null");
        assertNull(str1);
        assertNotNull(str2);
        assertSame(str2, str3);
        assertNotSame(str1, str2);

    }


    @Test
    @DisplayName("Test Array")
    void assertArray() {
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        
    }



}