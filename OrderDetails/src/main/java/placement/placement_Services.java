package placement;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class placement_Services {

    @Autowired
    private placement_repo repo;

    // List all placements
    public List<placement_01> listAll() {
        return repo.findAll();
    }

    // Add or update placement
    public placement_01 save(placement_01 placement) {
        return repo.save(placement);
    }

    // Get placement by ID
    public placement_01 get(Long id) {
        Optional<placement_01> placement = repo.findById(id);
        return placement.orElse(null);
    }

    // Delete placement by ID
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
