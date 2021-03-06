package ai.fluid.util.realtimeimagetransfer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SenderRequestDto {
    String userName;
    Date requestedAt;
}
