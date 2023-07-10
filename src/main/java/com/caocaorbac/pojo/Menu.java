package com.caocaorbac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer id;
    private Integer tenant_id;
    private String menu_name;
    private String menu_code;
    private String url;
    private String parent_id;
    private boolean is_parent;
    private String parent_code;
    private Integer level;
    private String id_path;
    private String code_path;
    private String create_by;
    private LocalDateTime create_time;
    private String update_by;
    private LocalDateTime update_time;
    private boolean is_delete;
}
