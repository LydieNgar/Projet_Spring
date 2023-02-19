package sn.esmt.admin.ws;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "roles")
@AllArgsConstructor

public class AppRoleController {

    private AppRoleRepository appRoleRepository;
    @PostMapping(path = "/save") //POst request

    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save((appRoleEntity));
    }
    @GetMapping(path = "/all")  //GET request
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }

    @GetMapping(path = "/login") //GET request

    public AppRoleEntity login(@RequestParam int id, @RequestParam String name){
        return appRoleRepository.findById(id);
    }
}
