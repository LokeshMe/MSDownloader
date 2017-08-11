package downloaders;

public interface Downloader {

	/**
	 * Retry Logic Inside
	 */
	boolean downloadToDisk(String url,String fileName);
}
