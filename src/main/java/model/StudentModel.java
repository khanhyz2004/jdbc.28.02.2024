package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentModel {
    private int id;
    private String nameStudent;
    private int ageStudent;
    private String classStudent;
}
