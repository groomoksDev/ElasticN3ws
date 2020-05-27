package Api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parsing")
public class Parsing {

    @PostMapping("/article")
    public @ResponseBody ResponseEntity<Boolean>  postArticle() {
        return new ResponseEntity<>(Boolean.valueOf("true"), HttpStatus.OK);
    }

    @PutMapping("/article")
    public @ResponseBody ResponseEntity<Boolean>  putArticle(Long id) {
        return new ResponseEntity<>(Boolean.valueOf("true"), HttpStatus.OK);
    }
}
