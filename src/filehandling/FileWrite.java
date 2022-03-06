package filehandling;


import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="407,  M Kalpana,  Anantapur, AP, India";
try
{
	FileWriter output= new FileWriter("data1.txt");
	output.write(data);
	System.out.println("Dta is Written Successfully");
	output.close();
}
catch(IOException ex)
{
	System.out.println("File write error..");
}
	}

}


