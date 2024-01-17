package counter;

public class Ch_count {
	private String ch;
	private Long count;
	
	public Ch_count(String ch) {
		this.ch = ch;
		this.count = 1L;
	}
	
	public void inc() {
		this.count = this.count +1;
	}

	public Long getCount() {
		return this.count;
	}
	
	public String getCh() {
		return this.ch;
	}
	
	public String toString() {
		return "["+this.ch+"="+this.count+"]";
	}
}
