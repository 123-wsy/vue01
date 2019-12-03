package org.neuedu.vue.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.vue.model.Column;

import java.util.List;

public interface ColMapper {
    List<Column> getColumns();

    Integer addColumn(Column column);

    Integer delColumn(Integer id);

    Integer upColumn(Column column);

    Integer delManyColumn(@Param("ids") Integer[] ids);
}
