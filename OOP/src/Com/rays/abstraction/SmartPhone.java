package Com.rays.abstraction;
public class SmartPhone implements Camera , MusicPlayer , GPS {

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("show location");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("play music");
	}

	@Override
	public void stopmusic() {
		// TODO Auto-generated method stub
		System.out.println("stop music");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
	 System.out.println("take photo");
	}
	@Override
	public void recordvideo() {
		// TODO Auto-generated method stub
		System.out.println("record videos");
	}
}
