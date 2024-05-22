package schoolLibrary;

public class CD extends LibraryItem implements Comparable<CD>{
	
	private Name composer;
	private int trackNo;
	
	

	public CD(Name composer, int trackNo) {
		super();
		this.composer = composer;
		this.trackNo = trackNo;
	}

	
	public Name getComposer() {
		return composer;
	}


	public void setComposer(Name composer) {
		this.composer = composer;
	}


	public int getTrackNo() {
		return trackNo;
	}


	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}


	@Override
	public void printInfo() {
        System.out.println("CD: " + title + ", composer: " + composer + ", track No: " + trackNo);
        
	}
	
	@Override
	public int cmpauther(Name composer) {
		if (composer.equals(composer))
			return 1;
		else
			return 0;
	}

	@Override
    public int compareTo(CD otherCD) {
        return this.getTitle().compareTo(otherCD.getTitle());
    }

    public boolean compareComposer(Name otherComposer) {
        return this.composer.equals(otherComposer);
    }
	
}
