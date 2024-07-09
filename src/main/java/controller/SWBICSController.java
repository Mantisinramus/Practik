package controller;


import dto.SWBICSDTO;
import org.springframework.web.bind.annotation.*;
import service.SWBICSService;

import java.util.List;

@RestController
@RequestMapping("/api/SWBICS")
public class SWBICSController 
{
    private final service.SWBICSService SWBICSService;
    public SWBICSController(SWBICSService SWBICSService) {
        this.SWBICSService = SWBICSService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public SWBICSDTO createSWBICS(@RequestBody SWBICSDTO SWBICSDTO) {
        return SWBICSService.createSWBICS(SWBICSDTO);
    }

    @GetMapping("/{edNo}")
    public SWBICSDTO getSWBICSByEdNo(@PathVariable Integer id) {
        return SWBICSService.getSWBICS(id);
    }

    @GetMapping
    public List<SWBICSDTO> getAllSWBICS() {
        return SWBICSService.getAllSWBICS();
    }

    @PutMapping("/{id}")
    public SWBICSDTO updateSWBICS(@PathVariable Integer id, @RequestBody SWBICSDTO SWBICSDTO) {
        return SWBICSService.updateSWBICS(id, SWBICSDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSWBICS(@PathVariable Integer id) {
        SWBICSService.deleteSWBICS(id);
    }
}
