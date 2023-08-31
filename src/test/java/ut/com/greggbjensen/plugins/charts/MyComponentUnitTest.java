package ut.com.greggbjensen.plugins.charts;

import org.junit.Test;
import com.greggbjensen.plugins.charts.api.MyPluginComponent;
import com.greggbjensen.plugins.charts.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}