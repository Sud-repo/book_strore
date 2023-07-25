package sud.projects.book_strore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sud.projects.book_strore.model.Fiction;
import sud.projects.book_strore.service.FictionService;

@RestController
@RequestMapping("/categories")
public class FictionController {
    
    @Autowired
    FictionService service;

    @GetMapping("/fiction")
    @PreAuthorize("hasRole('USER')")
    public List<Fiction> getFicBooksReq() {
        return service.getFicBooks();
    }

    @GetMapping("/fiction/{id}")
    @PreAuthorize("hasRole('USER')")
    public Optional<Fiction> getFicBookReq(@PathVariable int id) {
        return service.getFicBook(id);
    }

    @PostMapping("/fiction")
    @PreAuthorize("hasRole('ADMIN')")
    public void addFicBookReq(@RequestBody Fiction f) {
        service.addFicBook(f);
    }

    @PutMapping("/fiction/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateFicBookReq(@RequestBody Fiction f) {
        service.updateFicBook(f);
    }

    @DeleteMapping("/fiction/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteFicBookReq(@PathVariable int id) {
        service.deleteFicBook(id);
    }
}
