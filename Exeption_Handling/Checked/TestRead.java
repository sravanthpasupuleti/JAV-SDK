import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class TestRead {
    public static void main(String[] args)  {   //Filenot found exception
        try{
            PrintWriter pw = new PrintWriter("hlooo.txt");
        }
        catch(FileNotFoundException fe){
            fe.getMessage();
        }
    }
}
