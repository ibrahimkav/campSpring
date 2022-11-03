package kodlama.io.Kodlama.io.Ders.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Ders.entities.concretes.Category;

public interface CategoryRepository {
	List<Category> getAll();
	Category getId(int id);
	Category getLanguageName(String language);
	void update(Category category);
	void delete(int id);
	void add(Category category);
	
}
