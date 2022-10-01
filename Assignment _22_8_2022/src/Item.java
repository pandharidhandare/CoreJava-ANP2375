
public class Item {
	private long uid ;
	private String title;
    private	int noOfCopis;
	
	Item(){
		}
	Item(long uid, String title,int noOfCopis){
		this.uid =uid;
		this.title = title;
		this.noOfCopis = noOfCopis;
	}
	void itemInfo(long uid,String title,int  noOfCopis ) {
		System.out.println("Uid of Book "+uid);
		System.out.println("Name of book "+title);
		System.out.println("copies avaible in library "+noOfCopis);
	}
public String toString() {
	return "Item [uid=" + uid + ", title=" + title + ", noOfCopis=" + noOfCopis + "]";
}
	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopis() {
		return noOfCopis;
	}

	public void setNoOfCopis(int noOfCopis) {
		this.noOfCopis = noOfCopis;
	}


}
