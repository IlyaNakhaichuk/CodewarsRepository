import org.junit.Test;

//import java.io.*;
import java.net.Socket;

//public class test implements Serializable {
/*    private int width;
    private transient int hight;
    
    public void setWidth(int w){
        width=w;
    }
    public void setHight(int h){
        hight=h;
    }

    public static void main(String[] args) {
        test ob = new test();
        ob.setHight(12);
        ob.setWidth(32);
        try {
            FileOutputStream fileStream = new FileOutputStream("obTest.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(ob);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        ob=null;
        try {
            ObjectInputStream osIn = new ObjectInputStream(new FileInputStream("obTest.ser"));
            Object rest = osIn.readObject();
            test obrest = (test) rest;
            osIn.close();
            System.out.println(obrest.hight + " "+ obrest.width);
        }catch (Exception es){
            es.printStackTrace();
        }
    }
    public void socket(){
        Socket socket = new Socket( "192.168.0.2", 5000 );
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader reader = new BufferedReader( input );
        String messenger = reader.readLine();
    }*/
//}
