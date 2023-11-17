package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class menu {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		boolean continuar = true;
		
		while(continuar == true) {
		
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_BLUE 
					+"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("Escolha uma opção:                                   ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				continuar = false;
				System.out.println(Cores.TEXT_BLUE + "Consulta finalizada!");
				sobre();
			}
			
			switch(opcao) {
			case 1 -> System.out.println(Cores.TEXT_BLUE + "Criar Conta\n");
			
			case 2 -> System.out.println(Cores.TEXT_BLUE + "Listar Todas as Contas\n");
			
			case 3 -> System.out.println(Cores.TEXT_BLUE + "Buscar Conta por Número\n");
			
			case 4 -> System.out.println(Cores.TEXT_BLUE + "Atualizador Dados da Conta\n");
			
			case 5 -> System.out.println(Cores.TEXT_BLUE + "Apagar Conta\n");
			
			case 6 -> System.out.println(Cores.TEXT_BLUE + "Sacar\n");
			
			case 7 -> System.out.println(Cores.TEXT_BLUE + "Depositar\n");
			
			case 8 -> System.out.println(Cores.TEXT_BLUE + "Transferir Valores entre Contras\n");
			}
		
		
		}
		
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Matheus Pedrosa");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/Otheus26");
		System.out.println("*********************************************************");
	}

}
