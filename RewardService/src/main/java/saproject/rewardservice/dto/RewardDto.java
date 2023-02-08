package saproject.rewardservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RewardDto {
    private String name;
    private int quantity;
    private Type type;
}
