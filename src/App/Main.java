package App;

public class Main {
	public static void main (String[] args) {
		Veiculo fusca = new Veiculo(new MotorFusca());
		Veiculo corsa = new Veiculo (new MotorCorsa());
		Veiculo ferrari = new Veiculo (new MotorFerrari());
		Veiculo lamborghini = new Veiculo (new MotorLamborghini());
		
		System.out.println(fusca.acelerar());
		System.out.println(corsa.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(lamborghini.acelerar());
	}
}
