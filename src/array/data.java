package array;


public class data {
	public Integer id;
	public String nome;
	public Double salario;
	public Double porcentagem;
	public int n;
	
	public data (String nome, Integer id, Double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	
	}
	public void salarioau (Double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);

	}
}

