package controller;


import dto.RestrictionsDTO;
import org.springframework.web.bind.annotation.*;
import service.RestrictionsService;

import java.util.List;

@RestController
@RequestMapping("/api/restrictions")
public class RestrictionsController 
{
    private final RestrictionsService RestrictionsService;
    public RestrictionsController(RestrictionsService RestrictionsService) {
        this.RestrictionsService = RestrictionsService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public RestrictionsDTO createRestrictions(@RequestBody RestrictionsDTO RestrictionsDTO) {
        return RestrictionsService.createRestrictions(RestrictionsDTO);
    }

    @GetMapping("/{edNo}")
    public RestrictionsDTO getRestrictionsByEdNo(@PathVariable Integer id) {
        return RestrictionsService.getRestrictions(id);
    }

    @GetMapping
    public List<RestrictionsDTO> getAllRestrictions() {
        return RestrictionsService.getAllRestrictions();
    }

    @PutMapping("/{id}")
    public RestrictionsDTO updateRestrictions(@PathVariable Integer id, @RequestBody RestrictionsDTO RestrictionsDTO) {
        return RestrictionsService.updateRestrictions(id, RestrictionsDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRestrictions(@PathVariable Integer id) {
        RestrictionsService.deleteRestrictions(id);
    }
}
