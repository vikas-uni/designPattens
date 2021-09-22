package designPatternsJava.creational.prototype;

public class PrototypeFactory {
	

	private static java.util.Map<String, PrototypeCapable> prototypes = new java.util.HashMap<String, PrototypeCapable>();

	static {
		prototypes.put(ModelType.MOVIE.toString(), new Movie());
		prototypes.put(ModelType.ALBUM.toString(), new Album());
		prototypes.put(ModelType.SHOW.toString(), new Show());
	}

	public static PrototypeCapable getInstance(final ModelType album) throws CloneNotSupportedException {
		return (PrototypeCapable) ((PrototypeCapable) prototypes.get(album.toString())).clone();
	}
}