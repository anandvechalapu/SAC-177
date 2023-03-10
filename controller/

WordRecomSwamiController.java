

@RestController
@RequestMapping("/wordRecomSwami")
public class WordRecomSwamiController {
    
    @GetMapping("/login")
    public void loginToSacralAiWebsite() {
        //logic to login to sacral.ai website
    }

    @PostMapping("/generateDoc")
    public void generateBusinessDocWithRecom(@RequestBody InputDoc inputDoc) {
        //logic to generate new business documents with recommendations using Word Recom Swami
    }
}