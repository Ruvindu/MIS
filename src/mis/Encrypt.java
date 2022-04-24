
package mis;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;


/**
 *
 * @author Ruvindu
 */
public class Encrypt {
  
    public String MD5(byte[] inputData, String algorithm)
    {
        String enc_pwd= ""; //encrypted password
        try{
            MessageDigest msgDig = MessageDigest.getInstance(algorithm);
            msgDig.update(inputData);
            byte[] msgDigByte = msgDig.digest();
            enc_pwd = DatatypeConverter.printHexBinary(msgDigByte);
        }
        catch(Exception e){
        
        }
    return enc_pwd;
    }
    
  
    
}
