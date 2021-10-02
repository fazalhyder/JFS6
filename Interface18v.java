interface Calc{
		default void mul(int a, int b){
        System.out.println(" The mul of "+a+" and "+b+" is : " +(a*b));
    }
	default void add(int a, int b){
    System.out.println(" The add of "+a+" and "+b+" is : " +(a+b));
     }
	 default void sub(int a, int b){
    System.out.println(" The sub of "+a+" and "+b+" is : " +(a-b));
     }
	 default void div(int a, int b){
    System.out.println(" The div of "+a+" and "+b+" is : " +(a%b));
     }
}
class MyCalc implements Calc{
}
class Interface18v {
    public static void main(String[] args) {
     MyCalc c = new MyCalc();
		c.mul(3,3);
		c.add(3,6);
		c.div(20,11);
		c.sub(9,0);
    }
}