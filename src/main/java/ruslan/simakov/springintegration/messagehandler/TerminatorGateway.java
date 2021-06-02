package ruslan.simakov.springintegration.messagehandler;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface TerminatorGateway {

    @Gateway(requestChannel = "terminator")
    void createTerminator(Terminator terminator);
}
