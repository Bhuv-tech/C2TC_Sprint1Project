package placement;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("placements")
public class placement_controllers {

    @Autowired
    private placement_Services placementServices;

    // Retrieve all placements
    @GetMapping
    public List<placement_01> listAll() {
        return placementServices.listAll();
    }

    // Retrieve placement by ID
    @GetMapping("/{id}")
    public ResponseEntity<placement_01> get(@PathVariable Long id) {
        try {
            placement_01 placement = placementServices.get(id);
            return new ResponseEntity<>(placement, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new placement
    @PostMapping
    public ResponseEntity<?> add(@RequestBody placement_01 placement) {
        placementServices.save(placement);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Update a placement
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody placement_01 placement, @PathVariable Long id) {
        try {
            placement_01 existingPlacement = placementServices.get(id);
            existingPlacement.setStudentName(placement.getStudentName());
            existingPlacement.setcollege(placement.getcollege());
            existingPlacement.setCompanyName(placement.getCompanyName());
            existingPlacement.setJobRole(placement.getJobRole());
            existingPlacement.setpackageOffered(placement.getpackageOffered());
            existingPlacement.setStatus(placement.getStatus());
            placementServices.save(existingPlacement);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a placement
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            placementServices.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
