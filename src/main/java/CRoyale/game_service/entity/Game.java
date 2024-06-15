package CRoyale.game_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Game {

    public Game() {}

    @Id
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String title;

}
