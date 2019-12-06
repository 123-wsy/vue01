package org.neuedu.vue.controller.column;

import org.neuedu.vue.model.Column;
import org.neuedu.vue.model.RespBean;
import org.neuedu.vue.service.ColService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/columns")
public class ColController {
    @Autowired
    ColService colService;
    @GetMapping("/getColumns")
    public List<Column> getColumns(){
        return colService.getColumns();
    }

    @PostMapping("/")
    public RespBean addColumn(@RequestBody Column column){
        return colService.addColumn(column);
    }

    @DeleteMapping("/{id}")
    public RespBean delColumn(@PathVariable("id") Integer id){
        return colService.delColumn(id);
    }

    @PutMapping("/")
    public RespBean upColumn(@RequestBody Column column){
        return colService.upColumn(column);
    }

    @DeleteMapping("/delManyColumn")
    public RespBean delManyColumn(Integer[] ids){
        return colService.delManyColumn(ids);
    }

    @GetMapping("/getDatas")
    public List<Column> getDatas(){
        return colService.getDates();
    }
}
