package com.caocaorbac.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String tenant_id;
    private Integer department_id;
    private String user_name;
    private String pwd;
    private String user_code;
    private String user_email;
    private String create_by;
    private LocalDateTime create_time;
    private String update_by;
    private LocalDateTime update_time;
    private boolean delete;

    private List<Role> roles;


}
