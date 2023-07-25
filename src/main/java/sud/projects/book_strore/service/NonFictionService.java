package sud.projects.book_strore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sud.projects.book_strore.database.NonFictionDB;
import sud.projects.book_strore.model.Nonfiction;

@Service
public class NonFictionService {

    @Autowired
    NonFictionDB db;

    public List<Nonfiction> getNonFicBooks() {
        return db.findAll();
    }

    public Optional<Nonfiction> getNonFicBook(int id) {
        return db.findById(id);
    }

    public void addNonFicBook(Nonfiction nf) {
        db.save(nf);
    }

    public void updateNonFicBook(Nonfiction nf) {
        db.save(nf);
    }

    public void deleteNonFicBook(int id) {
        db.deleteById(id);
    }

}
