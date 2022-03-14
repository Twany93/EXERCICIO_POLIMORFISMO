package EXERCICIOS_POLIMORFISMO_EX2;

public class Preguiça  extends Animal{
	public String getNome()
	{
	return("\nO nome da Preguiça é "+super.getNome()+ " e tem "+super.getIdade()+" anos de idade, e esse animal faz "+ super.getSom()+" e está "+super.getFazAlgo());
}
}
