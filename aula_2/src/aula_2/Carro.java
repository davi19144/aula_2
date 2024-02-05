package aula_2;

public class Carro {
	public String marca;
	public String nome;
	public String ano;
	public String motor;


	public void Acelerar() {
		System.out.println("O carro: " + nome + "Acelerou");
	}
	
	public void GetCarro() {
		System.out.println(
				"Marca: " + marca +
				"\nNome: " + nome +
				"\nAno: " + ano +
				"\nMotor: " + motor 
				);
	}
}
