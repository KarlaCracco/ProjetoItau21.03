import java.util.Scanner;




public class MenuCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String nome=" ", email=" ";
		int agencia=0, conta=0, telefone=0;
		double saldo=0;
		
		int opcao;
		do {
		
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Gravar em Arquivo Texto");
		System.out.println("4 - Consultar Arquivo Texto");
		System.out.println("5 - Sair");
		
		
		
		System.out.println("Entre com o op��o desejada");
		opcao=teclado.nextInt();
		
		switch(opcao) {
		case 1:
			teclado.nextLine();
			System.out.println("Digite seu o nome completo");
			nome=teclado.nextLine();
			
			System.out.println("Digite o seu email");
			email=teclado.nextLine();
			
			System.out.println("Entre com a Agencia");		
			agencia=teclado.nextInt();
			
			System.out.println("Entre com a Conta");
			conta=teclado.nextInt();
			
			System.out.println("Digite o seu telefone");
			telefone=teclado.nextInt();
			
			System.out.println("Digite o seu saldo");
			saldo=teclado.nextDouble();
			
			System.out.println("Dados cadastrado com sucesso!");
			break;
			
		case 2:	
			System.out.println("Segue abaixo os dados do cliente: "+nome);
			System.out.println("Agencia: "+agencia+"Conta: "+conta+"Saldo: "+saldo);
			System.out.println("Email: "+email);
			System.out.println("Telefone: "+telefone);
			break;
			
			}
		
			}  while (opcao<5 || opcao==0 || opcao>5);
		
		teclado.close();
		
	} 
	
}
