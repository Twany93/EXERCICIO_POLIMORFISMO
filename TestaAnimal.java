package EXERCICIOS_POLIMORFISMO_EX2;

public class TestaAnimal {
	
	public static void main(String[]args) {
		Cachorro perro= new Cachorro();
		Cavalo c= new Cavalo();
		Pregui�a p= new Pregui�a();
		
		perro.setNome("Thor");
		perro.setIdade(3);
		perro.setSom("Au Au Au (Latindo) ");
		perro.setFazAlgo("Correndo...");
		
		c.setNome("P� de Pano");
		c.setIdade(14);
		c.setSom("Iihhhh");
		c.setFazAlgo("Correndo...");
		
		p.setNome("Pegui�inha");
		p.setIdade(25);
		p.setSom("Snif Snif");
		p.setFazAlgo("Subindo em Arvores");
		

		Animal[] cadaAnimal = new Animal[3];
		
		cadaAnimal[0]= perro;
		cadaAnimal[1]=c;
		cadaAnimal[2]=p;
		
		for(Animal animais:cadaAnimal) {
			System.out.println(animais.getNome());
}			
}
}