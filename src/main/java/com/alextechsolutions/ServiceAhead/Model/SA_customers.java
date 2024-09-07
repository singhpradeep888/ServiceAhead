package com.alextechsolutions.ServiceAhead.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SA_customers {
    private Long id;
    private String name;
    private String phone;
    private String email;
}
