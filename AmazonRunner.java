class AmazonRunner
{
 public static void main(String args[])
 {
   Amazon ref =new Amazon();
   ref.id=1;
   ref.yourname="baba";
   ref.phonenumber=78787878l;
   ref.password="baba@123";
   
   System.out.println("  ");
   System.out.println("the account id is"+ref.id);
   System.out.println("the account name is"+ref.yourname);
   System.out.println("the account phonenumber is"+ref.phonenumber);
   System.out.println("the account password is"+ref.password);
   
   System.out.println("  ");
   
   
   Amazon anotherref= new Amazon();
   anotherref.id=3;
   anotherref.yourname="gopi";
   anotherref.phonenumber=98989898l;
   anotherref.password="gopi@1234";
   
   System.out.println("  ");
   System.out.println("the account id is"+anotherref.id);
   System.out.println("the account name is"+anotherref.yourname);
   System.out.println("the account phonenumber is"+anotherref.phonenumber);
   System.out.println("the account password is"+anotherref.password);
   
   
 
  }
 
 }