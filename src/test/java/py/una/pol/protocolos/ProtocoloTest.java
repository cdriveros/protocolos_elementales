package py.una.pol.protocolos;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ProtocoloTest {


	@Test
	public void testRepeat() {
		Host1 host1 = new Host1();
		Packet packet = new Packet();
		
		char[] data = { 
	    	    '1','0','1','1'
	    	};
		
		packet.setData(data);
	    
	    
	    Assert.assertEquals("hola",host1.networkLayer(packet));
		
		
	}
}
