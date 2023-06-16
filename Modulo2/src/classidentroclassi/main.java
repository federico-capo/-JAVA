package classidentroclassi;

public class main {

	public static void main(String[] args) {
		//instaza univerista
		univeristà uni = new univeristà();
		
		uni.setNome("la Sapienza");
		
		Sede s = new Sede();
		s.setIndirizzo("Viale policlinico");
		s.setCap(00100);
		s.setCittà("Roma");
		
		uni.setSedePrincipale(s);

	}

}
