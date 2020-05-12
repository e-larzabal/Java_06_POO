
public class Classroom {

	public static void main(String[] args) {
		Wilder[] promo = new Wilder[8];
		
		promo[0] = new Wilder("Joan",true);
		promo[1] = new Wilder("Maitane",true);
		promo[2] = new Wilder("Antton",true);
		promo[3] = new Wilder("Bixente",false);
		promo[4] = new Wilder("Patxi",false);
		promo[5] = new Wilder("Edurne",false);
		promo[6] = new Wilder("Pantxoa",false);
		promo[7] = new Wilder("Imanol",true);
		
		for(int i=0;i<=7;i++) {
			System.out.println(promo[i].whoAmI());
		}
	}

}
