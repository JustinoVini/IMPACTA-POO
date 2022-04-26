package aula7lab1;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func.nome = "Joao";
		func.sobrenome = "Pedro";
		func.cargo = "Programador";
		func.salario = 4000.00;
		
		func2.nome = "Gabriel";
		func2.sobrenome = "Silva";
		func2.cargo = "Auxiliar administrativo";
		func2.salario = 2500.00;
		
		
		System.out.println("Nome: " + func.nome);
		System.out.println("Sobrenome: " + func.sobrenome);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salário: " + func.salario);
		System.out.println();
		System.out.println("Nome: " + func2.nome);
		System.out.println("Sobrenome: " + func2.sobrenome);
		System.out.println("Cargo: " + func2.cargo);
		System.out.println("Salário: " + func2.salario);
	}
}
