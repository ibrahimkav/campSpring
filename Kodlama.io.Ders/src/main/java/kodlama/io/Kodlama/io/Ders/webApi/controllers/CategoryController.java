package kodlama.io.Kodlama.io.Ders.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Ders.business.abstracts.CategoryService;
import kodlama.io.Kodlama.io.Ders.entities.concretes.Category;

@RestController
@RequestMapping("/api")
public class CategoryController {
	private CategoryService categoryService;
	@Autowired
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("/getall")
	public List<Category> getAll() {
		return categoryService.getAll();

	}

	@GetMapping("/add")
	public void add(Category category) throws Exception {
		categoryService.add(category);
	}

	@GetMapping("/delete")
	public void delete(int id) {
		categoryService.delete(id);
	}

	@GetMapping("/update")
	public void update(Category category) throws Exception {
		categoryService.update(category);
	}
}
