package innerclass;


abstract class AnonymousInnerClass2 {
	   public abstract void display();
	}


	public class AnonymousInnerClass {

	public static void main(String[] args) {
	AnonymousInnerClass2 i = new AnonymousInnerClass2() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}





