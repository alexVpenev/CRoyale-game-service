package CRoyale.game_service.repository;

import CRoyale.game_service.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGameRepository
        extends JpaRepository<Game, Integer > {
}
