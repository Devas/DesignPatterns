package decorator.ex1.demo;

import decorator.ex1.core.SimpleWindow;
import decorator.ex1.core.Window;
import decorator.ex1.decorators.HorizontalScrollBarDecorator;
import decorator.ex1.decorators.VerticalScrollBarDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowDecoratorTest {

    @Test
    public void testWindowDecoratorTest1() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void testWindowDecoratorTest2() {
        Window decoratedWindow = new SimpleWindow();
        decoratedWindow = new HorizontalScrollBarDecorator(decoratedWindow);
        decoratedWindow = new VerticalScrollBarDecorator(decoratedWindow);
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including horizontal scrollbars, including vertical scrollbars", decoratedWindow.getDescription());
    }

}