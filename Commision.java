import java.util.Scanner;

public class Commision {
		private double sale, copySale, percentage, rpc, profit;
		//private int percentage;
	
		Scanner input = new Scanner(System.in);
	
		public Commision (){
		System.out.println("COMMISION SYSTEM / SISTEMA DE COMISIONES");
		printSpace();
		System.out.println("This is a commission script to evaluate how much percentage you will be getting as a commission after selling the item, ");
		System.out.println("your exact commision in dollars and the difference between your commission and the total value of the sale");
		printLine();
		System.out.println("Este es un script de comisión para evaluar cuánto porcentaje obtendrá como comisión después de vender el artículo, ");
		System.out.println("tu comisión exacta en dólares y la diferencia entre tu comisión y el valor total de la venta");
		printLine();
		System.out.println("Please enter the ammount to sell / Por favor introducir la cantidad a vender");
		printSpace();
		sale = input.nextInt();
		copySale = getSale();
		printSpace();
		System.out.println("The percentage of the total sale is: % " +getPercentage() + " | El porcentaje de la venta total es: % " + getPercentage());
		System.out.println("The return per commission is : " +getRpc() + " | El retorno por comision es : " + getRpc());
		System.out.println("The profit of the total sale is: " +getProfit() + " | La ganancia total de la venta es : " + getProfit());
		//showSale();

		
		}
		
		/*public void showSale() {
			System.out.println(copySale);
			
			}*/
			
			
		
		public double getSale() {
			return sale;
			}
			
		public void calculatePercentage() {
			percentage = ((0.25 * copySale) - 10);
			//percentage = (int) percent;
			}
			
		public double getPercentage() {
			calculatePercentage();
			return percentage;
			}
			
		public void calculateRpc() {
			rpc = copySale * (getPercentage()/100.0);
			}
			
		public double getRpc() {
			calculateRpc();
			return rpc;
			}
			
		public void calculateProfit() {
			profit = copySale - getRpc();
			}
			
		public double getProfit() {
			calculateProfit();
			return profit;
			}
		
		
		public void printSpace(){
			for (int i = 0; i < 3; i++){
			System.out.println(" ");
			}
			}
		
		
		public void printLine(){
			for (int i = 0; i < 100; i++){
			System.out.print("-");
			}
			System.out.println("-");
			}
		
		
	

	public static void main (String [] args){
		
		new Commision(); 
		
		}
}
