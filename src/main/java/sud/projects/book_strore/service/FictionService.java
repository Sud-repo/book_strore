package sud.projects.book_strore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sud.projects.book_strore.database.FictionDB;
import sud.projects.book_strore.model.Fiction;

@Service
public class FictionService {

    @Autowired
    FictionDB db;

    public void addFicBook(Fiction f) {
        db.save(f);
    }

    public List<Fiction> getFicBooks() {
        return db.findAll();
    }

    public Optional<Fiction> getFicBook(int id) {
        return db.findById(id);
    }

    public void updateFicBook(Fiction f) {
        db.save(f);
    }

    public void deleteFicBook(int id) {
        db.deleteById(id);
    }

}
