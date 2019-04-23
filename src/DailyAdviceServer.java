/*import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    public static String [] advice = {"Совет 1", "Совет 2","Совет 3","Совет 4","Совет 5","Совет 6","Совет 7","Совет 8"};
    public static void goServer(){
        try{
            ServerSocket serverSock= new ServerSocket( 4242 );
            while(true){
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter( sock.getOutputStream() );
                String advice = getAdvice();
                writer.close();
                System.out.println(advice);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static String getAdvice() {
        int random = (int) (Math.random() * advice.length);
        return advice[random];
    }
}
*/