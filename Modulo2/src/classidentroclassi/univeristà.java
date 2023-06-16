package classidentroclassi;

public class univeristà {
	private String  nome;
	//sede
	private Sede sedePrincipale;
	
	//array sediDistaccate /array di classi dentro altre classi
	Sede[] sediDistaccate= new Sede[10];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sede getSedePrincipale() {
		return sedePrincipale;
	}
	public void setSedePrincipale(Sede sedePrincipale) {
		this.sedePrincipale = sedePrincipale;
	}
	
	
}
