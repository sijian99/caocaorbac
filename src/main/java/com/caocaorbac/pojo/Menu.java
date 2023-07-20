package com.caocaorbac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer menu_id;
    private String tenant_id;
    private String menu_name;
    private String menu_code;
    private String url;
    private Integer parent_id;
    private boolean is_parent;
    private String parent_code;
    private Integer level;
    private String id_path;
    private String code_path;
//    private String create_by;
//    private LocalDateTime create_time;
//    private String update_by;
//    private LocalDateTime update_time;
    private boolean delete;

    private List<Menu> childMenus;


//    public List<Menu> constructTreeResult(List<Menu> pMenus, List<Menu> allMenus){
//        List<Menu> treeMenu = new ArrayList<Menu>();
//        for (Menu menu: pMenus){
//            menu.setChildMenus(this.getChildMenuByParentId(menu.getMenu_id(), allMenus));
//
//            if (menu.getChildMenus().isEmpty()){
//                continue;
//            }
//            constructTreeResult(menu.getChildMenus(), allMenus);
//        }
//        return treeMenu;
//    }
//
//    public List<Menu> getChildMenuByParentId(int parentId, List<Menu> menulist){
//        List<Menu> children = new ArrayList<>();
//        for(Menu menu: menulist) {
//            if(parentId == menu.getParent_id()){
//                children.add(menu);
//            }
//        }
//        return children;
//    }
}
