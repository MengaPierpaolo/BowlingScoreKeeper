package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	private int frameIndex = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frameIndex,frame);	
		frameIndex++;
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus() throws BowlingException{
		if(frameIndex<10) throw new BowlingException();
		else{
			Frame tenthFrame = frames.get(9); 
			return tenthFrame.isSpare() || tenthFrame.isStrike();
		}
	}
}
