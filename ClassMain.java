package fr.alk;

public class ClassMain {
	
	public static void main(String... arg){
		System.out.println("test de methode");
		creation();
	}
	
	public static void creation(){
		System.out.println("C'est partie !");
		//creation de mon joueur
		
		Player p = new Player();
		p.setName("Alfredo");
		p.setVie(100);
		
		System.out.println("Votre joueur se nom: " + p.getName() + " avec une vie de " + p.getVie()+"%");
		System.out.println("vous allé spawné au coordonée suivant: ");
		Spawn();
		
		
	}
	
	public static void Spawn(){
		//creation de coordonnée
		Location l = new Location();
		l.setX(80);
		l.setY(48);
		l.setZ(61);
		System.out.println(l.getX()+ ", " + l.getY()+ ", " + l.getZ());
	}

}
