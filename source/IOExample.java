// IOExample.java
import java.io.*;
public class IOExample {
public static void main(String[] args) {
try {
FileReader fr = new FileReader("data.txt");
fr.close();
} catch (IOException ex) {
System.out.println("I/O problem: " + ex.getMessage());
}
}
}
