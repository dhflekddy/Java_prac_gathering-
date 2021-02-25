class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour))return ;
		this.hour=hour;
	}
	private boolean isNotValidHour(int hour) {
		return 0>hour||23<hour;
	}
	public int getHour() {
		return hour;
	}
}

public class AccessModifierTest {

	public static void main(String[] args) {

		Time t=new Time();
		t.setHour(10);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}
