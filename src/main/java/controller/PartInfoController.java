package controller;

import dto.PartInfoDTO;
import org.springframework.web.bind.annotation.*;
import service.PartInfoService;

import java.util.List;

@RestController
@RequestMapping("/api/partInfoController")
public class PartInfoController 
{
    private final PartInfoService PartInfoService;
    public PartInfoController(PartInfoService PartInfoService) {
        this.PartInfoService = PartInfoService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public PartInfoDTO createPartInfo(@RequestBody PartInfoDTO PartInfoDTO) {
        return PartInfoService.createPartInfo(PartInfoDTO);
    }

    @GetMapping("/{edNo}")
    public PartInfoDTO getPartInfoByEdNo(@PathVariable Long id) {
        return PartInfoService.getPartInfo(id);
    }

    @GetMapping
    public List<PartInfoDTO> getAllPartInfo() {
        return PartInfoService.getAllPartInfo();
    }

    @PutMapping("/{id}")
    public PartInfoDTO updatePartInfo(@PathVariable Long id, @RequestBody PartInfoDTO PartInfoDTO) {
        return PartInfoService.updatePartInfo(id, PartInfoDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePartInfo(@PathVariable Long id) {
        PartInfoService.deletePartInfo(id);
    }
}
