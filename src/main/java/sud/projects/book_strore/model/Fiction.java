package sud.projects.book_strore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Fiction {
    
    @Id
    private int f_id;
    private String name;
    private String author;
    private String description;
    private int price;
    private String availability;
}
