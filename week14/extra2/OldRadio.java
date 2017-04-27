class OldRadio implements Radio {
	
	@Override
	public void increaseVolume() {
		System.out.println("Max volume is " + MAX_VOLUME);
		MAX_VOLUME = 200;
		System.out.println("Increasing volume using buttons");
	}
	
	@Override
	public void changeStation() {
		System.out.println("Changing station using buttons");
	}
	
	@Override
	public void changeFrequency() {
		System.out.println("Chaging frequency using buttons");
	}
	
} 
