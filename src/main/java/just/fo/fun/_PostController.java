package just.fo.fun;

import just.fo.fun.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class _PostController {

    @Autowired
    private AuthService authService;



    @PostMapping
    public ResponseEntity insertDictionary(@RequestBody final Post post) {

        Post res = authService.create(post);

        return res == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Post>> getAll() {
        List<Post> result = authService.getAll();
        return result == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(result, HttpStatus.OK);
    }

}
