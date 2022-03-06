package innerclass;

public class AssitedInnerClass {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		AssitedInnerClass obj=new AssitedInnerClass();
		AssitedInnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}

