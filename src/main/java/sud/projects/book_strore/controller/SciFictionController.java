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

import sud.projects.book_strore.model.Scifiction;
import sud.projects.book_strore.service.SciFictionService;

@RestController
@RequestMapping("/categories")
public class SciFictionController {
    
    @Autowired
    SciFictionService service;

    @GetMapping("/scifiction")
    public List<Scifiction> getSciFicBooksReq() {
        return service.getSciFicBooks();
    }

    @GetMapping("/scifiction/{id}")
    public Optional<Scifiction> getSciFicBookReq(@PathVariable int id) {
        return service.getSciFicBook(id);
    }

    @PostMapping("/scifiction")
    public void addSciFicBookReq(@RequestBody Scifiction sf) {
        service.addSciFicBook(sf);
    }

    @PutMapping("/scifiction/{id}")
    public void updateSciFicBookReq(@RequestBody Scifiction sf) {
        service.updateSciFicBook(sf);
    }

    @DeleteMapping("/scifiction/{id}")
    public void deleteSciFicBookReq(@PathVariable int id) {
        service.deleteSciFicBook(id);
    }
}
