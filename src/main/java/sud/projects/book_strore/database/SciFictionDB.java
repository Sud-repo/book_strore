package sud.projects.book_strore.database;

import org.springframework.data.jpa.repository.JpaRepository;

import sud.projects.book_strore.model.Scifiction;

public interface SciFictionDB extends JpaRepository<Scifiction, Integer>{

}
