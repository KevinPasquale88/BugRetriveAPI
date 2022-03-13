package it.software.engineer.bugs.apirestbug.pojo;

import lombok.*;

import java.time.DateTimeException;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bug {

    private LocalDateTime creation_time;

    private LocalDateTime resolved_time;
}
