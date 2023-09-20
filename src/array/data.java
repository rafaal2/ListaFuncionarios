package array;


public class data {
	public Integer id;
	public String nome;
	public Double salario;
	public Double porcentagem;
	public String cpf;
	public int n;
	
	public data (String nome, Integer id, Double salario, String cpf) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
		this.cpf = cpf;
	
	}
	public void salarioau (Double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	public String toString() {
		return "id: " + id + ", " +" nome: " + nome + ", "+ " CPF: " + cpf + ", " + "salario: " + String.format("%.2f", salario);

	}
}

