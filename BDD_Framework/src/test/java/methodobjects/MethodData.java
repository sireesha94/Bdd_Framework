package methodobjects;

public class MethodData extends Basepage {


	public MethodData(Integer x, Integer y, Integer facing) {
		super(x, y, facing);
		
	}
	
	public String printPosition() {
		char dir = 'N';
		if (facing == 1) {
		dir = 'N';
		} else if (facing == 2) {
		dir = 'E';
		} else if (facing == 3) {
		dir = 'S';
		} else if (facing == 4) {
		dir = 'W';
		}
		System.out.println(x+ " " +y +" " +dir);
		return (x+ " " +y +" " +dir);
		}
		public void process(String commands) {
		for (int idx = 0; idx<commands.length(); idx++ ) {
		process(commands.charAt(idx));
		}
		}
		private void process(Character command) {
		if (command.equals('L')) {
		turnLeft();
		} else if (command.equals('R')) {
		turnRight();
		} else if (command.equals('M')) {
		move();
		} else {
		throw new IllegalArgumentException(

		"Speak in Mars language, please!");
		}
		}
		
		private void move() {
		if (facing == N) {
		this.y++ ;
		} else if (facing == E) {
		this.x++ ;
		} else if (facing == S) {
		this.y--;
		} else if (facing == W) {
		this.x--;
		}
		}
		private void turnLeft() {
		facing = (facing-1) < N ? W : facing -1;
		}
		private void turnRight() {
		facing = (facing + 1) > W ? N : facing  + 1;
		}
		

}
