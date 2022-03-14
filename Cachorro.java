package EXERCICIOS_POLIMORFISMO_EX2;

public class Cachorro extends Animal{

		public String getNome()
		{
		return("O nome do cachorro é "+super.getNome()+ " e tem "+super.getIdade()+" anos de idade, e esse animal faz "+ super.getSom()+" e está "+super.getFazAlgo());
		}
}
