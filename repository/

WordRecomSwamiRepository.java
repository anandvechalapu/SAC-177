

@Repository
public class WordRecomSwamiRepository {
    
    @Autowired
    private SacralAiWebsite sacralAiWebsite;
    
    public void generateBusinessDocumentsWithRecommendations(String inputDocuments) {
        //Log into Sacral.ai website
        sacralAiWebsite.login();
        
        //Follow the required steps
        sacralAiWebsite.followSteps();
        
        //Generate new business documents with recommendations using Word Recom Swami
        sacralAiWebsite.generateBusinessDocumentsWithRecommendations(inputDocuments);
    }
}