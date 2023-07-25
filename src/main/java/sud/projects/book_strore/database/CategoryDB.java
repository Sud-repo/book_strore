package sud.projects.book_strore.database;

import org.springframework.data.jpa.repository.JpaRepository;

import sud.projects.book_strore.model.Category;


public interface CategoryDB extends JpaRepository<Category, Integer> {
    
}
