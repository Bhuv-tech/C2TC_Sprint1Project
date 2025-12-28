package placement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface placement_repo extends JpaRepository<placement_01, Long> {
}
