package libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


public class Session {
    
    private HashMap<String,String> mapInFile;
    private Object data;
    private String user,password;
    private boolean exist = false;
    
    public Session(String user, String password) {
    
     try{
    
        HashMap<String,String> map = new HashMap<String,String>();
        
        map.put(user,password);
          
        File fileOne =  new File("data");
        FileOutputStream fos=new FileOutputStream(fileOne);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(map);
        oos.flush();
        oos.close();
        fos.close(); 
       // fileOne.deleteOnExit();
        
       // fileOne.delete();
        
    }catch(Exception e){}     
        
    }
    
    public Session(){}
    
    private void set(String user, String password){
    this.user = user;
    this.password = password;
    //System.out.println(user+" "+password);
    }
    
    public boolean exist(String user){
    
     try{
         
        File toRead= new File("data");
        FileInputStream fis = new FileInputStream(toRead);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        this.mapInFile = (HashMap<String,String>)ois.readObject();
        
        this.mapInFile.forEach((k,v) -> set(k,v));
        
        ois.close();
        fis.close();       

    }catch(Exception e){}

    try{ 
     
    if(!this.mapInFile.isEmpty() && this.user.equals(user)){
    this.exist = true;
    } else {
    this.exist = false;
    }
   
    } catch(Exception em) {}
        
    return this.exist;    
        
    }
    
    public HashMap <String,String> data(){
            
        try{
        File toRead= new File("data");
        FileInputStream fis = new FileInputStream(toRead);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        this.mapInFile = (HashMap<String,String>)ois.readObject();
        
        ois.close();
        fis.close();

    }catch(Exception e){} 
   
    return this.mapInFile;
           
    }
    
}