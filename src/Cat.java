
public class Cat {

	/**
	 * Copyright The League of Amazing Programmers 2013-2017 Level 1 Cat
	 * Duration=0.5 Platform=Eclipse Type=Recipe Objectives=Create your own
	 * object
	 */

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}
	public int getLives(){
	return lives;
	}
	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}
	public void printLives(){
	System.out.println("I have " + getLives()+" lives.");
	}
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat kitten=new Cat("Tom");
		// 2. Get the Cat to print it's name
		kitten.printName();
		kitten.printLives();
		// 3. Kill the Cat!
		for(int i=0;i<9;i++){
		kitten.kill();
		}
		kitten.printLives();
	}
}
