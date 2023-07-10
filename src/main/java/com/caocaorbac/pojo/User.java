package com.caocaorbac.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private Integer tenant_id;
    private Integer department_id;
    private String user_name;
    private String pwd;
    private String user_code;
    private String user_email;
    private String create_by;
    private LocalDateTime create_time;
    private String update_by;
    private LocalDateTime update_time;
    private boolean is_delete;
}
