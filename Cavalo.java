package EXERCICIOS_POLIMORFISMO_EX2;

public class Cavalo extends Animal {
	public String getNome()
	{
	return("\nO nome do Cavalo � "+super.getNome()+ " e tem "+super.getIdade()+" anos de idade, e esse animal faz "+ super.getSom()+" e est� "+super.getFazAlgo());
	}

}
