package controller;

import dto.BICDirectoryEntryDTO;
import org.springframework.web.bind.annotation.*;
import service.BICDirectoryService;

import java.util.List;

@RestController
@RequestMapping("/api/BICDirectoryController")
public class BICDirectoryController 
{
    private final BICDirectoryService BICDirectoryService;
    public BICDirectoryController(BICDirectoryService BICDirectoryService) {
        this.BICDirectoryService = BICDirectoryService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public BICDirectoryEntryDTO createBICDirectory(@RequestBody BICDirectoryEntryDTO BICDirectoryEntryDTO) {
        return BICDirectoryService.createBICDirectoryEntry(BICDirectoryEntryDTO);
    }

    @GetMapping("/{edNo}")
    public BICDirectoryEntryDTO getBICDirectoryByEdNo(@PathVariable Long id) {
        return BICDirectoryService.getBICDirectoryEntry(id);
    }

    @GetMapping
    public List<BICDirectoryEntryDTO> getAllBICDirectory() {
        return BICDirectoryService.getAllBICDirectoryEntry();
    }

    @PutMapping("/{id}")
    public BICDirectoryEntryDTO updateBICDirectory(@PathVariable Long id, @RequestBody BICDirectoryEntryDTO BICDirectoryEntryDTO) {
        return BICDirectoryService.updateBICDirectoryEntry(id, BICDirectoryEntryDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteElectronicDocument(@PathVariable Long id) {
        BICDirectoryService.deleteBICDirectoryEntry(id);
    }
}
