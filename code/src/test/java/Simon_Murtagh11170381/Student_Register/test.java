package Simon_Murtagh11170381.Student_Register;

import static org.junit.Assert.*;
import org.junit.Test;


public class test {

	@Test
	public void test() {
		
		
		student student1  =  new student ("Simon Murtagh",    11170381, "4BP",  "08-12-1987");
		String expected1 = "SimonMurtagh30";
		String result1=student1.getUsername();
        assertEquals(expected1,result1);
	}

}