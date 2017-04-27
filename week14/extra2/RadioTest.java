class RadioTest {
	
	public static void main(String args[]) {
		
		OldRadio oldRadio = new OldRadio();
		MobilePhoneRadio mobileRadio = new MobilePhoneRadio();
		
		Radio radio = oldRadio;
		
		testRadio(radio);
		testRadio(mobileRadio);
	}
	
	private static void testRadio(Radio testingRadio) {
		testingRadio.increaseVolume();
		testingRadio.changeStation();
		testingRadio.changeFrequency();
	}
	
} 
