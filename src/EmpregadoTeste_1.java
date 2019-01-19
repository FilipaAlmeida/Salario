import java.util.Scanner;

public class EmpregadoTeste_1 {
	public void what () {
		double salario;
		Scanner input = new Scanner (System.in);
		System.out.println("salário: ");
		salario = input.nextDouble();
	  double x = calculo (salario);
	  System.out.println(x);
	}
	
	public double calculo (double salario){
		salario *= 12;
		return salario;
		
				
		
		
	}
}
