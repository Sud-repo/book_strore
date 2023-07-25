package sud.projects.book_strore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category {
    
    @Id
    private int cate_id;
    private String categories;
}
