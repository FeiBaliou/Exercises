//        9. substring()
//    Create a method that accepts a url and returns only the domain name.
//    For example: URL=http://peoplecert.com. The returned name will be "peoplecert.com"  
         





public class SubstringMethod {

    
    public static void main(String[] args) {
        
      System.out.println(SubString("http://peoplecert.com"));

}


public static String SubString(String url){
          String domain = url.substring(7);
          return domain;
          }
          

 
}
      