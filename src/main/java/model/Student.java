package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Table: student
 */
@Data
@AllArgsConstructor
public class Student {
    /**
     * Column: ID
     * Type: INT
     */
    private Integer id;

    /**
     * Column: NAME
     * Type: VARCHAR(100)
     */
    private String name;

    /**
     * Column: BRANCH
     * Type: VARCHAR(255)
     */
    private String branch;

    /**
     * Column: PERCENTAGE
     * Type: INT
     */
    private Integer percentage;

    /**
     * Column: PHONE
     * Type: INT
     */
    private Integer phone;

    /**
     * Column: EMAIL
     * Type: VARCHAR(255)
     */
    private String email;
}