import com.sun.org.apache.xpath.internal.operations.Equals;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import java.io.OutputStream;

public class InHotelTest {
    private Mockery mockery=new Mockery();
    private IData iData=null;
    private InHotel ih=null;

    @Before
    public void setUp() throws Exception{
        //用mockery实例来构造虚拟的iData
        iData=mockery.mock(IData.class);
        ih=new InHotel(iData);
        mockery.checking(new Expectations(){{
            oneOf(iData).in_Out_Room(666,"Lebron");
            will(returnValue("666房入住成功"));
        }});
    }

    @Test
    public void testIn(){
        System.out.println("666房入住成功".equals(ih.in(666,"Lebron")));
    }












}

