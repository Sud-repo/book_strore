package sud.projects.book_strore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sud.projects.book_strore.database.CategoryDB;
import sud.projects.book_strore.model.Category;

@Service
public class CategoryService {
    
    @Autowired
    CategoryDB db;

    public void addCategory(Category c) {
        db.save(c);
    }

    public List<Category> getCategories() {
        return db.findAll();
    }

    public Optional<Category> getCategory(int id) {
        return db.findById(id);
    }

    public void updateCategory(Category c) {
        db.save(c);
    }

    public void deleteCategory(int id) {
        db.deleteById(id);
    }

}
