import java.io.File;
import javax.xml.bind.*;
/* Note You must run the following command:
xjc -p sampleSchemaPackage SampleSchema.xsd .
Before compiling this class or else you will get an error
on the following import statement. */
import sampleSchemaPackage.*;

public class JaxbTestClass{

	public static void main(String args[]){
		try{
			Person p = new Person();
			p.setFirstName("John");
			p.setLastName("Smith");
			/*If you want a 10 digit phone number use 
			"integer" in your .xsd file to force this 
			datatype to be BigInt !*/
			p.setPhoneNumber(5551234); 

			JAXBContext context = JAXBContext.newInstance("sampleSchemaPackage");
			Marshaller marshaller = context.createMarshaller();	
			marshaller.marshal(p, new File("SamplePerson.xml"));
		}
		catch(JAXBException e){
			e.printStackTrace();
		}		
	}

}
