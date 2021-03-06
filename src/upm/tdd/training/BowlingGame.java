package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private static int frameNumber;
	
	public BowlingGame(){
		frameNumber = 0;
	}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frameNumber > 10) throw new BowlingException();
		if(frameNumber == 10){
			if(frames.get(9).bonus() == 0){
				throw new BowlingException();
			}
			else setBonus(frame);
		}
		else frames.add(frame);	
		frameNumber++;
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
	
	public int score() throws BowlingException{
		//if(frames.size() < 10) throw new BowlingException();
		
		int totScore = 0;
		

		
		int bonusThrowsNum = 0;
		
		for(Frame f : frames){
			switch(bonusThrowsNum){
			case 1: totScore += f.getFirstThrow(); break;
			case 2: totScore += f.score(); break;
			}
			totScore += f.score();
			bonusThrowsNum = f.bonus();
		}
		
		
		if(bonusThrowsNum > 0) {
			if(bonus == null) throw new BowlingException();
			switch(bonusThrowsNum){
			case 1: totScore += bonus.getFirstThrow(); break;
			case 2: totScore += bonus.score(); break;
			}
		}
		
		return totScore;
	}
	
	public boolean isNextFrameBonus(){

		return false;
	}
}
