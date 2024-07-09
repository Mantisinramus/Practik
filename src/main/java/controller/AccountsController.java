package controller;


import dto.AccountsDTO;
import org.springframework.web.bind.annotation.*;
import service.AccountsService;

import java.util.List;

@RestController
@RequestMapping("/api/acounts")
public class AccountsController 
{
    private final AccountsService AccountsService;
    public AccountsController(AccountsService AccountsService) {
        this.AccountsService = AccountsService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public AccountsDTO createAccounts(@RequestBody AccountsDTO AccountsDTO) {
        return AccountsService.createAccounts(AccountsDTO);
    }

    @GetMapping("/{edNo}")
    public AccountsDTO getAccountsByEdNo(@PathVariable Integer id) {
        return AccountsService.getAccounts(id);
    }

    @GetMapping
    public List<AccountsDTO> getAllAccounts() {
        return AccountsService.getAllAccounts();
    }

    @PutMapping("/{id}")
    public AccountsDTO updateAccounts(@PathVariable Integer id, @RequestBody AccountsDTO AccountsDTO) {
        return AccountsService.updateAccounts(id, AccountsDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAccounts(@PathVariable Integer id) {
        AccountsService.deleteAccounts(id);
    }
}
