package kodlama.io.Kodlama.io.Ders.entities.concretes;

public class Category {
	private int id;
	private String language;

	public Category() {
	}

	public Category(int id, String language) {
		this.id = id;
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
