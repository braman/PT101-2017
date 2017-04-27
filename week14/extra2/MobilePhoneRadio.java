class MobilePhoneRadio implements Radio {
	
	@Override
	public void increaseVolume() {
		System.out.println("Increasing volume using sensor");
	}
	
	@Override
	public void changeStation() {
		System.out.println("Changing station using sensor");
	}
	
	@Override
	public void changeFrequency() {
		System.out.println("Chaging frequency using sensor");
	}
	
} 
