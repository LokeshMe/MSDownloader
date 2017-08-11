package abstractions;

public class Source {

	public final String url;
	public final String protocol;//Enum/class
	public final String dlFilename;
	
	public Source(String url) {
		this.url=url;
		protocol=getProtocol(url);
		dlFilename=decideFilename(url);
	}

	/**
	 * unique - hash or just the string replacing the chars invalid in filename with
	 * somthing else?
	 */
	private String decideFilename(String url2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getProtocol(String url2) {
		// TODO Auto-generated method stub
		return null;
	}
}
