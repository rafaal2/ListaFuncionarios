package codigo;
import  java.util.*;
import array.data;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos empregados serão registrados");
		int n = sc.nextInt();
		List<data> lista = new ArrayList<>();
		for (int i = 0; i< n;i++) {
			System.out.println("digite o nome do funcionario");
			String nome = sc.next();
			System.out.println("digite o id do funcionario");
			Integer id = sc.nextInt();
			System.out.println("digite o salario do funcionario");
			Double salario = sc.nextDouble();
			System.out.println("digite o cpf do funcionario");
			String cpf = sc.next();
			
			data dados = new data(nome,id,salario,cpf);
			lista.add(dados);	
		}
		System.out.println("insira o id do funcionario que terá o salário aumentado");
		int idsalario = sc.nextInt();
		data empregado = lista.stream().filter(x -> x.id == idsalario).findFirst().orElse(null);
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			empregado.salarioau(porcentagem);
			System.out.println("List of employees:");
			for (data e : lista) {
				System.out.println(e);
			}	
			sc.close();
			
	}
}

