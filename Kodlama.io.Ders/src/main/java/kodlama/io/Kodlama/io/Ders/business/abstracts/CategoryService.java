package kodlama.io.Kodlama.io.Ders.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Ders.entities.concretes.Category;

public interface CategoryService {
	List<Category> getAll();
	void update(Category category) throws Exception;
	void delete(int id);
	void add(Category category) throws Exception;
}
