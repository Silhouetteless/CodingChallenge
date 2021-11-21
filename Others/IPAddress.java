import java.net.InetAddress;

class IPAddress {
   public static void main(String args[]) throws Exception {
      
      InetAddress ip = InetAddress.getLocalHost();
 
      // getHostAddress(): - Returns the IP address string in textual presentation
      System.out.println("Your IP Address is: " + ip.getHostAddress());
  }
}