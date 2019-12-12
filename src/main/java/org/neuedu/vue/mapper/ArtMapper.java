package org.neuedu.vue.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.vue.model.Art;
import org.neuedu.vue.model.PageBean;

import java.util.List;

public interface ArtMapper {
    List<Art> getArts(PageBean pageBean);

    Integer delArts(@Param("ids") Integer[] ids);

    Integer addArt(Art art);

    Art getArtByAid(Integer aid);

    Integer upArt(Art art);

    Integer delArtByAid(Integer aid);

    Integer upArtStatus(Integer aid);

    Integer upArtView(Integer aid);
}
