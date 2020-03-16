package heritage;

public class apple extends fruit {

	//--- POLY -------------
	@Override
	public void taste() {
		System.out.println("La pomme est sucré");

	}

	@Override
	public int getsiez() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasend() {
		// TODO Auto-generated method stub
		return true;
	}

}
