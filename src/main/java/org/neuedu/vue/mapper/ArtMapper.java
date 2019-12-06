package org.neuedu.vue.mapper;

import org.neuedu.vue.model.Art;
import org.neuedu.vue.model.PageBean;

import java.util.List;

public interface ArtMapper {
    List<Art> getArts(PageBean pageBean);
}
