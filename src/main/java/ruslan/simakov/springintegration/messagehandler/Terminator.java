package ruslan.simakov.springintegration.messagehandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terminator {
    private String model;
    private Integer batteryPower = 0;

    public Terminator(String model){
        this.model = model;
    }
}
