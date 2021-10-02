interface Calculator{
	public abstract  void mul(int a, int b);
	public abstract   void add(int a, int b);
	public abstract   void sub(int a, int b);
	public abstract   void div(int a, int b);
}
 class MyCalculator implements Calculator{
	public void mul(int a, int b){
        System.out.println(" The mul of "+a+" and "+b+" is : " +(a*b));
    }
	public void add(int a, int b){
    System.out.println(" The add of "+a+" and "+b+" is : " +(a+b));
     }
	 public void sub(int a, int b){
    System.out.println(" The sub of "+a+" and "+b+" is : " +(a-b));
     }
	 public void div(int a, int b){
    System.out.println(" The div of "+a+" and "+b+" is : " +(a%b));
     }
}
public class INTERFACE{
	public static void main(String [] args){
		MyCalculator mc = new MyCalculator();
		mc.mul(3,3);
		mc.add(3,6);
		mc.div(20,11);
		mc.sub(9,0);
	}
}