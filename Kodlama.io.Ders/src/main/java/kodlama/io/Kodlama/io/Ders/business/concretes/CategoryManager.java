package kodlama.io.Kodlama.io.Ders.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Ders.business.abstracts.CategoryService;
import kodlama.io.Kodlama.io.Ders.dataAccess.abstracts.CategoryRepository;
import kodlama.io.Kodlama.io.Ders.entities.concretes.Category;
@Service
public class CategoryManager implements CategoryService {
	private CategoryRepository categoryRepository;

	
	public CategoryManager(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAll() {
		
		return categoryRepository.getAll();
	}

	@Override
	public void update(Category category) throws Exception {
		for (Category cate : categoryRepository.getAll()) {
			if(cate.getLanguage().equalsIgnoreCase(category.getLanguage())) {
				throw new Exception("aynı kategoride dil giremezsiniz.");
			}
		}
		categoryRepository.update(category);
	}

	@Override
	public void delete(int id) {
		categoryRepository.delete(id-1);
		
	}

	@Override
	public void add(Category category) throws Exception {
		if(category.getLanguage()!= null) {
			for (Category cate : categoryRepository.getAll()) {
				if(cate.getLanguage().equalsIgnoreCase(category.getLanguage())) {
					throw new Exception("aynı kategoride dil giremezsiniz.");
				}
				categoryRepository.add(category);
			}
		}
		else {
			throw new Exception("Boş bir kategori girmeye çalıştınız.");
		}
		
	}

}
