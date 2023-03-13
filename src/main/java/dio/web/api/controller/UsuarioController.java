package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario>getUsers(){
        return usuarioRepository.listAll();
    }

    @GetMapping("{id}")
    public Usuario get1(@PathVariable("id") int id){
        return usuarioRepository.finById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id){
        usuarioRepository.remove(id);
    }

    @PostMapping
    public void postUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);

    }

    @PatchMapping
    public void updateUser(@RequestBody Usuario usuario){
        usuarioRepository.update(usuario);
    }
}
