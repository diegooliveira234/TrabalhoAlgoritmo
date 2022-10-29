package trabalhoAlgoritmos;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		int change,valueCar;
		valueCar=0;
		double IPI;
		IPI=valueCar*0.08;
		IPI=0;
		double valueFinal1,valueFinal2,valueFinal3;
		valueFinal1=0;
		valueFinal2=0;
		valueFinal3=0;
		try(Scanner input = new Scanner (System.in) ){
		do { 
			System.out.println("");
			System.out.println(" ------------------------- Concessionária Braço Forte ------------------------- " );
			System.out.println(" ");
			System.out.println("Olá qual o valor do veículo escolhido ?");
			valueCar=input.nextInt();
			System.out.println("");
			System.out.println(" Personalize seu veiculo como desejar, temos 4 opções ");
			System.out.println(" 1 - Trio Elétrico (Alarme, Vidro Elétrico e Tranca Elétrica) ");
			System.out.println(" 2 - Ar Condicionado " );
			System.out.println(" 3 - Direção Hidráulica ");
			System.out.println(" 4 - Completo (Trio Elétrico, Ar Condicionado e Direção Hidráulica ) ");
			System.out.println(" 0 - Nenhum Opcional ");
			System.out.println(" 5 - Para encerrar sua personalização");
			change = input.nextInt();
			System.out.println("");
			String zero = change ==0 ? (" O valor do seu automóvel sem opcionais é de R$ "+valueCar ): " ";
			String verify = change >=6 ? "Por favor digite uma opção válida": " ";
			System.err.println(zero);
			System.out.println(verify);
			switch (change) {
			case 1: valueFinal1=(valueCar+IPI)*1.02;
				System.out.println("O valor final do seu veículo com a adção de Trio Elétrico é de R$ : "+valueFinal1);
				break;
			case 2: valueFinal2=(valueCar)*1.02;
				System.out.println("O valor final do seu veículo com a adção de Ar Condicionado é de R$ : "+valueFinal2);
				break;
			case 3:  valueFinal3=(valueCar)*1.02;
				System.out.println("O valor final do seu veículo com a adção de Direção Elétrica é de R$ : "+valueFinal3);
				break;
			case 4: 
				double valueTax1=(((valueCar+(valueCar*0.08))*1.02));
				double valueTax2=(valueCar*1.02)-valueCar;
				double valueTax3=(valueCar*1.02)-valueCar;
				double valueFinal4=valueTax1+valueTax2+valueTax3;
				double descount = valueFinal4*0.965;
				System.out.println("O valor final do seu veículo com a adção de Trio Elétrico, Ar Condicionado e Direção Hidráulica é de R$ : "+valueFinal4);
				System.out.println("Esse mês estamos com uma super promoção aqui na Braço Forte, veículos completos estão com um super desconto, "
					+ "por você ter escolhido essa forma de personalização o novo valor do seu veículo é de R$ : "+descount);
				break;
		
			}
	}while(change !=5);
		}
}
}