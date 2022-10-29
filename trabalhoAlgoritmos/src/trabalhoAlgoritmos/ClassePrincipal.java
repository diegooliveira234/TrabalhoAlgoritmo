package trabalhoAlgoritmos;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int change,valueCar;
		try(Scanner input = new Scanner (System.in) ){
			
		
		do { 
			System.out.println(" ------------------------- Concessionária Braço Forte ------------------------- " );
			System.out.println("");
			System.out.println("Qual o valor do veículo escolhido ?");
			valueCar=input.nextInt();
			System.out.println("");
			System.out.println(" Personalize seu veiculo como desejar, temos 4 opções ");
			System.out.println(" 1 - Trio Elétrico (Alarme, Vidro Elétrico e Tranca Elétrica) ");
			System.out.println(" 2 - Ar Condicionado " );
			System.out.println(" 3 - Direção Hidráulica ");
			System.out.println(" 4 - Completo (Trio Elétrico, Ar Condicionado e Direção Hidráulica ) ");
			System.out.println(" 0 - Para encerrar sua personalização");
			change = input.nextInt();
			String verify = change >4 ? "Por favor digite uma opção válida": " ";
			System.out.println(verify);
	}while(change !=0);
		}
}
}