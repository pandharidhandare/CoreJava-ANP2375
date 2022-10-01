
public abstract class WrittenItem extends Item {
	
	
	private String authorName;

	 public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	abstract void infoLibrary();
}
