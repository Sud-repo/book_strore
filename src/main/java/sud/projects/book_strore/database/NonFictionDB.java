package sud.projects.book_strore.database;

import org.springframework.data.jpa.repository.JpaRepository;

import sud.projects.book_strore.model.Nonfiction;

public interface NonFictionDB extends JpaRepository<Nonfiction, Integer>{

}
