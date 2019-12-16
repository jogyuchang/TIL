package day06;

public class TVTest {

	public static void main(String[] args) {
		TV t1 = new TV();
		t1.model="S-tv";
		t1.size = 25;
		t1.powerOn();
		t1.setChannel(11);
		t1.channelDown();
		t1.channelDown();
		t1.print();
		
		
		TV t2 = new TV();
		t2.model="L-tv";
		t2.size = 32;
		t2.powerOn();
		t2.setChannel(21);
		t2.print();
		
//		t2 = t1;
//		t2.print();
		
//		t2 = null;
//		t1 = null;
		System.out.println("==========================");
		 new TV().print();
		 System.out.println("==========================");
		 TV[] tvs = new TV[3];
		 tvs[0] = t1;
		 tvs[1] = t2;
		 
		 t2 = null;
		 t1 = null;
		 
		 for(int i = 0;i<tvs.length ;i++) {
			 //System.out.println(tvs[i]);
			 if(tvs[i] == null) {
				 tvs[i].powerOn();
				 tvs[i].print();
			 }
			 if(tvs[i] == null) break;
		 
		 }
		 
	}

}

class TV{
	int size;
	String model;
	int channel;
	boolean power;
	
	public void print() {
		System.out.printf("TV(%s,%d 인치,%b channed:%d) %n", 
				model,size,power,channel);
	}
	public void powerOn() {
		power = true;
		
	}
		public void powerOff() {
		power = false;
}
		public void setChannel(int c) {
			channel = c;
		}
		public void channelUp(){
			channel++;
	}
		public void channelDown(){
			channel--;
}
		
}