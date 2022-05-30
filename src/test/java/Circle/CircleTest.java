package Circle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {
    private Circle circleUnderTest = new Circle();

    @Test
    @DisplayName("Test Circle Area successful ")
    public void testArea() {
        Assertions.assertEquals(12.56, circleUnderTest.area(2));
        Assertions.assertEquals(314, circleUnderTest.area(10));
        Assertions.assertNotEquals(12.56, circleUnderTest.area(5));
    }

    @Test
    @DisplayName("Test Circle Circumference successful ")
    public void testCircumference(){
        Assertions.assertEquals(25.12, circleUnderTest.circumference(4));
        Assertions.assertEquals( 62.800000000000004, circleUnderTest.circumference(10));
        Assertions.assertEquals(43.96, circleUnderTest.circumference(7));
    }

    @Test
    @DisplayName("Test Circle Volume successful ")
    public void testVolume(){
        Assertions.assertEquals(32, circleUnderTest.volume(4, 8));
        Assertions.assertEquals(110, circleUnderTest.volume(10, 11));
        Assertions.assertNotEquals(5, circleUnderTest.volume(1, 7));

    }
}
