import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		double nota1, nota2, nota3,notafinal;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1=sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2=sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3=sc.nextDouble();

		notafinal = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("nota final: "+notafinal);
		
	}
}
