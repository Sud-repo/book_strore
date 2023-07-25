package sud.projects.book_strore.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sud.projects.book_strore.database.SciFictionDB;
import sud.projects.book_strore.model.Scifiction;

@Service
public class SciFictionService {

    @Autowired
    SciFictionDB db;

    public List<Scifiction> getSciFicBooks() {
        return db.findAll();
    }

    public Optional<Scifiction> getSciFicBook(int id) {
        return db.findById(id);
    }

    public void addSciFicBook(Scifiction sf) {
        db.save(sf);
    }

    public void updateSciFicBook(Scifiction sf) {
        db.save(sf);
    }

    public void deleteSciFicBook(int id) {
        db.deleteById(id);
    }

}
