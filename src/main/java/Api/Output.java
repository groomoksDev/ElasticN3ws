package Api;

import io.swagger.annotations.SwaggerDefinition;
import DAO.Article;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Service.Outputting;
import Service.OutputtingImpl;

@RestController
@SwaggerDefinition
@RequestMapping("/output/")
public class Output {

    @GetMapping("/article/{id}")
    public @ResponseBody
    ResponseEntity<Article> getArticleById(@PathVariable Long id) {
        Outputting outputting = new OutputtingImpl();
        return new ResponseEntity<>(outputting.getArticleById(id), HttpStatus.OK);
    }

}
