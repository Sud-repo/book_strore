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

import sud.projects.book_strore.model.Nonfiction;
import sud.projects.book_strore.service.NonFictionService;

@RestController
@RequestMapping("/categories")
public class NonFictionController {
    
    @Autowired
    NonFictionService service;

    @GetMapping("/nonfiction")
    @PreAuthorize("hasRole('USER')")
    public List<Nonfiction> getNonFicBooksReq() {
        return service.getNonFicBooks();
    }

    @GetMapping("/nonfiction/{id}")
    @PreAuthorize("hasRole('USER')")
    public Optional<Nonfiction> getNonFicBookReq(@PathVariable int id) {
        return service.getNonFicBook(id);
    }

    @PostMapping("/nonfiction")
    @PreAuthorize("hasRole('ADMIN')")
    public void addNonFicBookReq(@RequestBody Nonfiction nf) {
        service.addNonFicBook(nf);
    }

    @PutMapping("/nonfiction/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateNonFicBookReq(@RequestBody Nonfiction nf) {
        service.updateNonFicBook(nf);
    }

    @DeleteMapping("/nonfiction/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteNonFicBookReq(@PathVariable int id) {
        service.deleteNonFicBook(id);
    }
}
