package question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException{
       
    	String note = "Harshal Gajanan Khandalkar";
 
        Path location = Path.of("D:\\Study Material\\Anudip foundation\\JAVA\\Assignment Problems\\Assignment_10-10-22/Assignment.txt");
 
        Files.writeString(location, note);
 
        String str = Files.readString(location);
 
        System.out.println(str);
    }

}
