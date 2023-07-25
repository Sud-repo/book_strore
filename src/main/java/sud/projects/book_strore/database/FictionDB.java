package sud.projects.book_strore.database;

import org.springframework.data.jpa.repository.JpaRepository;

import sud.projects.book_strore.model.Fiction;

public interface FictionDB extends JpaRepository<Fiction, Integer> {

}
