package filehandlingpracticeproject;



import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] data = new char[100];
try
{
FileReader input= new FileReader("data1.txt");
input.read(data);
System.out.println(data);
input.close();

	}
catch (IOException ex)
{
	System.out.println("File read Error");
}

}
}



