package Taskk22.Tasssss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		gifts w=new chocolates("kitkat","5star",30,70);
    		gifts p=new sweets("gulabjamun","laddu",100,20);
    		w.weight();
    		p.weight();
    		w.display();
    		p.display();
    		}
    		}
    		abstract class gifts {
    		int c1;
    		int c2;
    		abstract void weight();
    		public gifts(int cost1,int cost2) {
    		c1=cost1;
    		c2=cost2;
    		}
    		public void display() {
    		System.out.println("all the gifts are received");
    		}
    		}
    		class chocolates extends gifts{
    		String choco1;
    		String choco2;
    		public chocolates(String choco1,String choco2,int cost1,int cost2) {
    		super(cost1,cost2);
    		this.choco1=choco1;
    		this.choco2=choco2;
    		}
    		public void display() {
    		super.display();
    		System.out.println("chocolates:"+choco1+" ,"+choco2);
    		}
    		public void weight() {
    		System.out.println( c1+c2);
    		}
    		}
    		class sweets extends gifts{
    		String s1;
    		String s2;
    		public sweets(String s1,String s2,int cost1,int cost2) {
    		super(cost1,cost2);
    		this.s1=s1;
    		this.s2=s2;
    		}
    		public void display() {
    		System.out.println("sweets:"+s1+", "+s2);
    		}
    		public void weight() {
    		System.out.println( c1+c2);
    		}
    		}
    		