package EXERCICIOS_POLIMORFISMO_EX2;

public class Pregui�a  extends Animal{
	public String getNome()
	{
	return("\nO nome da Pregui�a � "+super.getNome()+ " e tem "+super.getIdade()+" anos de idade, e esse animal faz "+ super.getSom()+" e est� "+super.getFazAlgo());
}
}
