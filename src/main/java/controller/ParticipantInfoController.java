package controller;


import dto.ParticipantInfoDTO;
import org.springframework.web.bind.annotation.*;
import service.ParticipantInfoService;

import java.util.List;

@RestController
@RequestMapping("/api/participantInfo")
public class ParticipantInfoController 
{
    private final ParticipantInfoService ParticipantInfoService;
    public ParticipantInfoController(ParticipantInfoService ParticipantInfoService) {
        this.ParticipantInfoService = ParticipantInfoService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public ParticipantInfoDTO createParticipantInfo(@RequestBody ParticipantInfoDTO ParticipantInfoDTO) {
        return ParticipantInfoService.createParticipantInfo(ParticipantInfoDTO);
    }

    @GetMapping("/{edNo}")
    public ParticipantInfoDTO getParticipantInfoByEdNo(@PathVariable Integer id) {
        return ParticipantInfoService.getParticipantInfo(id);
    }

    @GetMapping
    public List<ParticipantInfoDTO> getAllParticipantInfo() {
        return ParticipantInfoService.getAllParticipantInfo();
    }

    @PutMapping("/{id}")
    public ParticipantInfoDTO updateParticipantInfo(@PathVariable Integer id, @RequestBody ParticipantInfoDTO ParticipantInfoDTO) {
        return ParticipantInfoService.updateParticipantInfo(id, ParticipantInfoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipantInfo(@PathVariable Integer id) {
        ParticipantInfoService.deleteParticipantInfo(id);
    }
}
