public class FinallyDemo {
public static void main(String[] args) {
try {
int a = 10 / 0; // Causes exception
}
catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
}
finally {
System.out.println("This will always run, no matter what.");
}
}
}
