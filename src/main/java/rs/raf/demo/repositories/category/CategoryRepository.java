package rs.raf.demo.repositories.category;

import rs.raf.demo.entities.Category;

import java.util.List;

public interface CategoryRepository {
  public Category addCategory(Category category);
  public List<Category> allCategories();
  //  public News findNews(Integer id);
  public void deleteCategory(Integer id);
}