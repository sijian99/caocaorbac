package com.caocaorbac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer role_id;
    private String tenant_id;
    private String role_name;
    private String role_code;
//    private String create_by;
//    private LocalDateTime create_time;
//    private String update_by;
//    private LocalDateTime update_time;
    private boolean delete;

   // private List<Menu> menus;
}
