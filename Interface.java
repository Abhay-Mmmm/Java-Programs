
public class Main {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
				
	}
}

public interface Prey {

	void flee();
}

public interface Predator {

	void hunt();
}

public class Rabbit implements Prey{


	@Override
	public void flee() {
		System.out.println("*The rabbit is fleeing*");
		
        }
}

public class Hawk implements Predator{


	@Override
	public void hunt() {
		System.out.println("*The hawk is hunting*");
		
        }
}

public class Fish implements Prey,Predator{


	@Override
	public void hunt() {
		System.out.println("*The fish is hunting*");
		
	}

	@Override
	public void flee() {
		System.out.println("*The fish is fleeing*");
		
	}
}