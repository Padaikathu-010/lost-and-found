package kutty.example.lastfound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    private ItemRepository repo;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return repo.save(item);
    }

    @GetMapping
    public List<Item> getAll() {
        return repo.findAll();
    }
}
