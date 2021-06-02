package ruslan.simakov.springintegration.messagehandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TerminatorController {

    private final TerminatorGateway gateway;

    @Autowired
    public TerminatorController(TerminatorGateway gateway) {
        this.gateway = gateway;
    }

    @GetMapping("/api/terminator/{model}")
    public Terminator createTerminator(@PathVariable String model) {
        log.info("new Terminator STARTING");
        Terminator terminator = new Terminator(model);
        gateway.createTerminator(terminator);
        log.info("new Terminator FINISHING");
        return terminator;
    }
}
