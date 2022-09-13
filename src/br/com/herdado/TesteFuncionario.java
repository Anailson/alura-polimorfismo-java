package br.com.herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario anailson = new Funcionario();
		anailson.setNome("anailson ribeiro");
		anailson.setCpf("115454-2022");
		anailson.setSalario(2600.00);
		
		System.out.println(anailson.getNome());
		System.out.println(anailson.getBonificacao());
	}

}
