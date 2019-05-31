package libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class AccountSession {
    
    private HashMap<String,String> mapInFile;
    public static File File = new File("data");
  
    public AccountSession(){}
    
    public AccountSession(String user, String password) {
    
        try{

           HashMap<String,String> map = new HashMap<>();

           map.put(user,password);

           File fileOne =  new File("data");
            try (FileOutputStream fos = new FileOutputStream(fileOne); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(map);
                oos.flush();
            }
            
       }catch(IOException e){}     
    }

    @SuppressWarnings("unchecked")
    public HashMap <String,String> data(){
            
        try{
        File toRead= new File("data");
            try (FileInputStream fis = new FileInputStream(toRead); ObjectInputStream ois = new ObjectInputStream(fis)) {
                
                mapInFile = (HashMap<String,String>)ois.readObject();         
            }

        } catch(IOException | ClassNotFoundException e){}
   
    return mapInFile;
           
    }   
}