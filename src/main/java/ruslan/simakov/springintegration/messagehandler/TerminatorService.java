package ruslan.simakov.springintegration.messagehandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TerminatorService {

    @ServiceActivator(inputChannel = "terminator", outputChannel = "uppercased")
    public Terminator upperCaseModel(Terminator terminator) {
        log.info("UPPERCASE STARTING");
        terminator.setModel(terminator.getModel().toUpperCase());
        log.info("UPPERCASE FINISHING");
        return terminator;
    }

    @ServiceActivator(inputChannel = "uppercased", outputChannel = "charged")
    public Terminator chargingBattery(Terminator terminator) {
        log.info("CHARGING STARTING");
        terminator.setBatteryPower(100);
        log.info("CHARGING FINISHING");
        return terminator;
    }

    @ServiceActivator(inputChannel = "charged")
    public void notificationReady(Terminator terminator) {
        log.info("Terminator ready");
    }
}
