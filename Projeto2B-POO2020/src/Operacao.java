import java.util.Scanner;

/*
		 * Essa classe apresenta como conte�do f�rmulas matem�ticas, sendo elas, o c�lculo do MMC, de opera��es fundamentais em fra��es, do IMC e de convers�es de temperatura
		 * @author Vitor Spricigo
		 * 
		*/

public class Operacao {
	
	
	/*
	 * M�todo para calcular o M�nimo M�ltiplo Comum (MMC)
	 * F�rmula: MMC = (den1 * den2) / mdc
	 * @param den1 e auxDen1 � o valor do denominador da primeira fra��o
	 * @param den2 e auxDen2 � o valor do denominador da segunda fra��o
	 * @return fun��o retorna o resultado do MMC
	 */

	public int mmc(int den1, int den2)	{
		Scanner scan = new Scanner(System.in);
		int res=0, auxDen1=0, auxDen2=0;
		
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		auxDen1 = den1;
		auxDen2 = den2;
		
		do {
			res = auxDen1 % auxDen2;
			auxDen1 = auxDen2;
			auxDen2 = res;
			
		} while (res != 0);
		
		return (den1 * den2) / auxDen1;
	}
	
	/*
	 * M�todo que efetua a soma de fra��es
	 * C�lculo: 
	 * auxRes1 = (mmc/den1)*num1
	 * auxRes2 = (mmc/den2)*num2
	 * res = (auxRes1 + auxRes2)/mmc
	 * @param num1 � o valor do numerador da primeira fracao
	 * @param num2 � o valor do numerador da segunda fracao
	 * @param den1 � o valor do denominador da primeira fracao
	 * @param den2 � o valor do denominador da segunda fracao
	 * @param res � o resultado da soma de duas fra��es
	 * @return fun��o retorna o valor resultado da soma
	 * 
	 */
	
	public String somaFracao(int num1, int den1, int num2, int den2) {
		int auxRes1=0, auxRes2=0;
		String res=null;
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		if (den1!=den2) {
			int mmc = mmc(den1, den2);
			auxRes1 = (mmc/den1)*num1;
			auxRes2 = (mmc/den2)*num2;
			res = (auxRes1 + auxRes2 + "/" + mmc);
		}
		if (den1==den2) {
			res = (num1 + num2 + "/" + den1);
		}
		return res;
	}
	
	/*
	 * M�todo que efetua a subtra��o de fra��es
	 * C�lculo: 
	 * auxRes1 = (mmc/den1)*num1
	 * auxRes2 = (mmc/den2)*num2
	 * res = (auxRes1 - auxRes2)/mmc
	 * @param num1 � o valor do numerador da primeira fracao
	 * @param num2 � o valor do numerador da segunda fracao
	 * @param den1 � o valor do denominador da primeira fracao
	 * @param den2 � o valor do denominador da segunda fracao
	 * @param res � o resultado da subtra��o de duas fra��es
	 * @return fun��o retorna o valor resultado da subtra��o
	 * 
	 */
	
	public String subtraiFracao(int num1, int den1, int num2, int den2) {
		int auxRes1=0, auxRes2=0;
		String res=null;
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		if (den1!=den2) {
			int mmc = mmc(den1, den2);
			auxRes1 = (mmc/den1)*num1;
			auxRes2 = (mmc/den2)*num2;
			res = (auxRes1 - auxRes2 + "/" + mmc);
		}
		if (den1==den2) {
			res = (num1 - num2 + "/" + den1);
		}
		return res;
	}
	
	/*
	 * M�todo que efetua a multipli��o de fra��es
	 * C�lculo:
	 * resultado = (num1*num2)/(den1*den2)
	 * @param num1 � o valor do numerador da primeira fracao
	 * @param num2 � o valor do numerador da segunda fracao
	 * @param den1 � o valor do denominador da primeira fracao
	 * @param den2 � o valor do denominador da segunda fracao
	 * @param res � o resultado da multiplica��o de duas fra��es
	 * @return fun��o retorna o valor resultado da multiplica��o
	 * 
	 */
	
	public String multiplicaFracao(int num1, int den1, int num2, int den2) {
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		return ((num1*num2) + "/" + (den1*den2));	
		}
	
	/*
	 * M�todo que efetua a divis�o de fra��es
	 * C�lculo:
	 * resultado = (num1*num2)/(den1*den2)
	 * @param num1 � o valor do numerador da primeira fracao
	 * @param num2 � o valor do numerador da segunda fracao
	 * @param den1 � o valor do denominador da primeira fracao
	 * @param den2 � o valor do denominador da segunda fracao
	 * @param res � o resultado da divis�o de duas fra��es
	 * @return fun��o retorna o valor resultado da divis�o
	 * 
	 */
	
	public String divideFracao(int num1, int den1, int num2, int den2) {
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		return ((num1*den2) + "/" + (den1*num2));
	}
	
	/*
	 * M�todo que efetua o c�lculo do �ndice de Massa Corporal (IMC)
	 * C�lculo:
	 * imc = peso/(altura*altura)
	 * @param peso � o valor do peso em Quilogramas
	 * @param altura � o valor da altura em Cent�metros
	 * @param imc � o resultado do c�lculo
	 * @return fun��o retorna o valor resultado do imc
	 * 
	 */
	
	public double imc(double altura, double peso) {
		double imc=0.00;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor da altura (em cent�metros)");
		altura = scan.nextDouble();
		System.out.println("Informe o valor do peso (em quilogramas)");
		peso = scan.nextDouble();
		
		imc = peso/(altura*altura);
		
		return imc;
	}
	
	/*
	 * M�todo que efetua a convers�o de Graus Celsius para Kelvin
	 * C�lculo:
	 * k = c+273
	 * @param c = temperatura em graus Celcius
	 * @param k = temperatura convertida em graus Kelvin
	 * @return fun��o retorna o valor resultado da convers�o Celsius-Kelvin
	 * 
	 */
	
	public double celsiusToKelvin(double c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em �C");
		c = scan.nextDouble();
		
		return (c+273.15);
	}
	
	/*
	 * M�todo que efetua a convers�o de Graus Celsius para Farenheit
	 * C�lculo:
	 * f = (1,8*c)+32
	 * @param c = temperatura em graus Celcius
	 * @param f = temperatura convertida em graus Farenheit
	 * @return fun��o retorna o valor resultado da convers�o Celsius-Farenheit
	 * 
	 */
	
	public double celsiusToFarenheit(double c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em �C");
		c = scan.nextDouble();
		
		return ((c*1.8)+32);
	}
	
	/*
	 * M�todo que efetua a convers�o de Graus Kelvin para Celsius
	 * C�lculo:
	 * c = k-273.15
	 * @param k = temperatura em graus Kelvin
	 * @param c = temperatura convertida em graus Celsius
	 * @return fun��o retorna o valor resultado da convers�o Kelvin-Celcius
	 * 
	 */
	
	public double kelvinToCelsius(double k) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em K");
		k = scan.nextDouble();
		
		return (k-273.15);
	}	
	
	/*
	 * M�todo que efetua a convers�o de Graus Kelvin para Farenheit
	 * C�lculo:
	 * f = ((k-273.15)*1.8)+32
	 * @param k = temperatura em graus Kelvin
	 * @param f = temperatura convertida em graus Farenheit
	 * @return fun��o retorna o valor resultado da convers�o Kelvin-Farenheit
	 */
	
	public double kelvinToFarenheit(double k) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em K");
		k = scan.nextDouble();
		
		return ((k-273.15)*1.8)+32;
	}	
	
	/*
	 * M�todo que efetua a convers�o de Graus Farenheit para Celsius
	 * C�lculo:
	 * c = (f-32)/1.8
	 * @param f = temperatura em graus Farenheit
	 * @param c = temperatura convertida em graus Celsius
	 * @return fun��o retorna o valor resultado da convers�o Farenheit-Celcius
	 */
	
	public double farenheitToCelsius(double f) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em �F");
		f = scan.nextDouble();
		
		return (f-32)/1.8;
	}	
	
	/*
	 * M�todo que efetua a convers�o de Graus Farenheit para Kelvin
	 * C�lculo:
	 * k = ((f-32)/1.8)+273.15
	 * @param f = temperatura em graus Farenheit
	 * @param k = temperatura convertida em graus Kelvin
	 * @return fun��o retorna o valor resultado da convers�o Farenheit-Kelvin
	 */
	
	public double farenheitToKelvin(double f) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em �F");
		f = scan.nextDouble();
		
		return ((f-32)/1.8)+273.15;
	}	
	
	public static void main(String[] args) {
		Operacao op = new Operacao();
		Scanner scan = new Scanner(System.in);
		boolean saida=false;
		
	do {	
		int num1=0, num2=0, den1=0, den2=0;
		double k=0.00, f=0.00, c=0.00, altura=0.00, peso=0.00;
				
		System.out.println("Escolha uma opcao: \n");
		System.out.println("1 - Calcular MMC");
		System.out.println("2 - Calcular Soma de Fracoes");
		System.out.println("3 - Calcular Subtracao de Fracoes");
		System.out.println("4 - Calcular Multiplicacao de Fracoes");
		System.out.println("5 - Calcular Divisao de Fracoes");
		System.out.println("6 - Calcular o IMC");
		System.out.println("7 - Converter �C para K");
		System.out.println("8 - Converter �C para F");
		System.out.println("9 - Converter K para �C");
		System.out.println("10 - Converter K para �F");
		System.out.println("11 - Converter �F para �C");
		System.out.println("12 - Converter �F para K");
		System.out.println("0 - Sair");
		int opcao = scan.nextInt();
				
		switch(opcao) {
		case 1: System.out.println("O valor do MMC e: " + op.mmc(den1, den2) + "\n"); break;
		case 2: System.out.println("O valor da Soma e: " + op.somaFracao(num1, den1, num2, den2) + "\n"); break;
		case 3: System.out.println("O valor da subtracao e: " + op.subtraiFracao(num1, den1, num2, den2) + "\n"); break;
		case 4: System.out.println("O valor da multiplicacao e: " + op.multiplicaFracao(num1, den1, num2, den2) + "\n"); break;
		case 5: System.out.println("O valor da divisao e: " + op.divideFracao(num1, den1, num2, den2) + "\n"); break;
		case 6: System.out.println("O valor do IMC e " + op.imc(altura, peso) + "\n");
		case 7: System.out.println("A temperatura e de: " + op.celsiusToKelvin(c) + " K\n"); break;
		case 8: System.out.println("A temperatura e de: " + op.celsiusToFarenheit(c) + " �F\n"); break;
		case 9: System.out.println("A temperatura e de: " + op.kelvinToCelsius(k) + " �C\n"); break;
		case 10: System.out.println("A temperatura e de: " + op.kelvinToFarenheit(k) + " �F\n"); break;
		case 11: System.out.println("A temperatura e de: " + op.farenheitToCelsius(f) + " �C\n"); break;
		case 12: System.out.println("A temperatura e de: " + op.farenheitToKelvin(f) + " K\n"); break;
		case 0: saida = true; System.out.println("Voce saiu! Ate breve!"); break;
		default: System.out.println("Opcao Invalida");
			
		}
	} while (saida==false);

	}

}
