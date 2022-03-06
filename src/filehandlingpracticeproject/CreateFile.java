package filehandlingpracticeproject;


import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File myfile=new File("data1.txt");
try
{
if(myfile.createNewFile())
{
	System.out.println("File Created Successfully");
}
else
{
	System.out.println("File creaed error");
}
}
catch (IOException ex)
{
System.out.println("file error");
}
	}

}




