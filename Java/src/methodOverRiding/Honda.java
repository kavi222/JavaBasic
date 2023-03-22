package methodOverRiding;

public class Honda extends Bike {
	
    @Override
	public void start() {
		System.out.println("honda ------ start");
	}
	
	public void stop() {
		System.out.println("honda ------ stop");
	}

}
