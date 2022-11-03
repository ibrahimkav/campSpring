package kodlama.io.Kodlama.io.Ders.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Ders.dataAccess.abstracts.CategoryRepository;
import kodlama.io.Kodlama.io.Ders.entities.concretes.Category;

@Repository
public class inMemoryCategoryRepository implements CategoryRepository{
	List<Category> categorys = new ArrayList<>();
	Category Category;
	@Override
	public List<Category> getAll() {
		categorys.add(new Category(1, "C#"));
		categorys.add(new Category(2, "Java"));
		categorys.add(new Category(3, "Python"));
		return categorys;
	}

	@Override
	public Category getId(int id) {
		return categorys.get(id-1);
	}

	@Override
	public Category getLanguageName(String language) {
		
		for (Category c : categorys) {
			if(c.getLanguage().equalsIgnoreCase(language)) {
				Category = c;
				return Category;
			}
		}
		return Category;
	}

	@Override
	public void update(Category category) {
		categorys.set(Category.getId()-1, category);
		
	}

	@Override
	public void delete(int id) {
	categorys.remove(id-1);
		
	}

	@Override
	public void add(Category category) {
		categorys.add(category);
		
	}

}
