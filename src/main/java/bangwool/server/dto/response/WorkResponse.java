package bangwool.server.dto.response;

import bangwool.server.domain.Work;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkResponse {
    private Long id;

    public static WorkResponse from(Work work) {
        return new WorkResponse(work.getId());
    }
}
