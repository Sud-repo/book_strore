package sud.projects.book_strore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sud.projects.book_strore.model.Category;
import sud.projects.book_strore.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CategoryController {
    
    @Autowired
    CategoryService service;
    
    @GetMapping(value="/categories")
    @PreAuthorize("hasRole('USER')")
    public List<Category> getCategoriesReq() {
        return service.getCategories();
    }

    @GetMapping(value = "/categories/{id}")
    @PreAuthorize("hasRole('USER')")
    public Optional<Category> getCategoryReq(@PathVariable int id) {
        return service.getCategory(id);
    }

    
    @PostMapping(value="/categories")
    @PreAuthorize("hasRole('ADMIN')")
    public void addCategoriesReq(@RequestBody Category c) {
        service.addCategory(c);;
    }

    @PutMapping(value = "/categories/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateCategoryReq(@RequestBody Category c) {
        service.updateCategory(c);
    }
    
    @DeleteMapping(value = "/categories/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteCategoryReq(@PathVariable int id) {
        service.deleteCategory(id);
    }

}
