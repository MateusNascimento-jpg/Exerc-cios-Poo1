package agregacaoecomposicao;

public class Principal2 {
	
	public static void main(String[] args) {
		//OBRIGATORIO TER UM OBJETO DENTRO DO OUTRO
		Endereco e2 = new Endereco();
		e2.setCep("23647364796"); 
		e2.setLogradouro("Quadra 105");
		e2.setNumero(3);
		
		String nome = "Mateus Bueno";  
		Aluno a2 = new Aluno(nome, e2); 
		
		System.out.println(a2.getNome()); 
		System.out.println(a2.getEndereco().getLogradouro());
		System.out.println(a2.getRa());
		
		
	}
}
