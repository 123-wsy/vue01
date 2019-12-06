package org.neuedu.vue.service;

import org.neuedu.vue.mapper.ColMapper;
import org.neuedu.vue.model.Column;
import org.neuedu.vue.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColService {
    @Autowired
    ColMapper colMapper;
    public List<Column> getColumns() {
        return colMapper.getColumns();
    }

    public RespBean addColumn(Column column) {
        Integer i = colMapper.addColumn(column);
        if(i == 0){
            return RespBean.error("添加失败");
        }else{
            return RespBean.ok("添加成功");
        }
    }

    public RespBean delColumn(Integer id) {
        Integer i = colMapper.delColumn(id);
        if(i == 0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }

    public RespBean upColumn(Column column) {
        Integer i = colMapper.upColumn(column);
        if(i == 0){
            return RespBean.error("修改失败");
        }else{
            return RespBean.ok("修改成功");
        }
    }

    public RespBean delManyColumn(Integer[] ids) {
        Integer i = colMapper.delManyColumn(ids);
        if(i == 0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }

    public List<Column> getDates(){
        return colMapper.getDates();
    }
}
