import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private int id;

    private String title;

    private String description;

    private LocalDate creation_time;

    private LocalDate expire_date;
}
