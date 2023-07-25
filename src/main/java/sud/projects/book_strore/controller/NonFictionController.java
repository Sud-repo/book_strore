package sud.projects.book_strore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Nonfiction> getNonFicBooksReq() {
        return service.getNonFicBooks();
    }

    @GetMapping("/nonfiction/{id}")
    public Optional<Nonfiction> getNonFicBookReq(@PathVariable int id) {
        return service.getNonFicBook(id);
    }

    @PostMapping("/nonfiction")
    public void addNonFicBookReq(@RequestBody Nonfiction nf) {
        service.addNonFicBook(nf);
    }

    @PutMapping("/nonfiction/{id}")
    public void updateNonFicBookReq(@RequestBody Nonfiction nf) {
        service.updateNonFicBook(nf);
    }

    @DeleteMapping("/nonfiction/{id}")
    public void deleteNonFicBookReq(@PathVariable int id) {
        service.deleteNonFicBook(id);
    }
}
