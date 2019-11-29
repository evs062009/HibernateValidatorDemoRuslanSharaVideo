package com.domains;

import javafx.beans.DefaultProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
//    @Size(min = 1, message = "is required")
//    @Pattern(regexp = "\\d", message = "only 5 chars/digits")
    @Min(value = 0, message = "must be greater than or equals to zero")
    @Max(value = 10, message = "must be less than or equals to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
}
