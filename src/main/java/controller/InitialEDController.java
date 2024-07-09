package controller;

import dto.InitialEDDTO;
import org.springframework.web.bind.annotation.*;
import service.InitialEDService;

import java.util.List;

@RestController
@RequestMapping("/api/initialED")
public class InitialEDController 
{
    private final InitialEDService InitialEDService;
    public InitialEDController(InitialEDService InitialEDService) {
        this.InitialEDService = InitialEDService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public InitialEDDTO createInitialED(@RequestBody InitialEDDTO InitialEDDTO) {
        return InitialEDService.createInitialED(InitialEDDTO);
    }

    @GetMapping("/{edNo}")
    public InitialEDDTO getInitialEDByEdNo(@PathVariable Long id) {
        return InitialEDService.getInitialED(id);
    }

    @GetMapping
    public List<InitialEDDTO> getAllInitialED() {
        return InitialEDService.getAllInitialED();
    }

    @PutMapping("/{id}")
    public InitialEDDTO updateInitialED(@PathVariable Long id, @RequestBody InitialEDDTO InitialEDDTO) {
        return InitialEDService.updateInitialED(id, InitialEDDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteInitialED(@PathVariable Long id) {
        InitialEDService.deleteInitialED(id);
    }
}
