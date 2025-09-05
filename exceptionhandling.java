// 1: Exception
public class Main
{
	public static void main(String[] args) {

		try{
		    int d = 25/0;
		    System.out.println(d);
		}
  		catch(ArithmeticException e) // Built in exception
		{
		    System.out.println(e);
		}
		catch(Exception e) // catch any exception
		{
		    System.out.println(e);
		}
		finally
		{
		    System.out.println("Finally Always executed");
		}
		System.out.println("Rest code");
	}
}


// Custom Exception
class AgeException extends RuntimeException {
    AgeException(String msg) {
        super(msg);
    }
}

public class exceptionhandling {
    public static void main(String[] args) {
        int age = 21;

        try {
            if (age < 18) {
                throw new AgeException("Can't vote"); // user-defined exception
            } else {
                System.out.println("Congrats, you can vote");
            }
        } catch (AgeException e) {
            System.out.println("Age less than 18 not allowed: " + e);
        }

        System.out.println("Rest of the code");
    }
}



// 3: Exception Using Method
public class exceptionhandling {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Can't vote");
        } else {
            System.out.println("Congrats, you can vote");
        }
    }

    public static void main(String[] args) {
        int age = 14;

        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Age less than 18 not allowed: " + e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}

