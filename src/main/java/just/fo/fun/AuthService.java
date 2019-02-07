package just.fo.fun;

import just.fo.fun.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;
    public List<Post> getAll() {
        return authRepository.findAll();
    }

    public Post create(Post post) {
        return  authRepository.save(post);
    }
}
