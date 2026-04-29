package model;

import app.EventType;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Event implements Comparable {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private EventType eventType;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

}
