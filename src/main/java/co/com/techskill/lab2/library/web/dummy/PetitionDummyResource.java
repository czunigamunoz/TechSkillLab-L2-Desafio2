package co.com.techskill.lab2.library.web.dummy;

import co.com.techskill.lab2.library.service.dummy.PetitionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/dummy/petitions")
public class PetitionDummyResource {

    private final PetitionService petitionService;

    public PetitionDummyResource(PetitionService petitionService) {
        this.petitionService = petitionService;
    }

    @GetMapping("/process")
    public Flux<String> processPetitions() {
        return petitionService.dummyProcessPetition();
    }
}
