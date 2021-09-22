package designPatternsJava.creational.prototype;

public enum ModelType {

	MOVIE("movie"), ALBUM("album"), SHOW("show");

	private String value;

	private ModelType(String value) {
		this.value = value;
	}
}
