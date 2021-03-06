package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
		

	public int getFirstThrow() {
		return firstThrow;
	}


	public int getSecondThrow() {
		return secondThrow;
	}


	//constructor
	public Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	
	//the score of a single frame
	public int score(){
		return (isStrike())? 20 : firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return firstThrow == 10;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return (firstThrow + secondThrow) == 10;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws
	public int bonus() {
		if(isSpare()) return 1;
		else if(isStrike()) return 2;
		else return 0;
	}


}
