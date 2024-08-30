package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Task {
    private String task;

    public void setText(String task) {
        this.task = task;
    }

    public String getText() {
        return task;
    }
}
