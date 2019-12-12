package org.neuedu.vue.controller.art;

import com.github.pagehelper.PageInfo;
import org.neuedu.vue.model.Art;
import org.neuedu.vue.model.PageBean;
import org.neuedu.vue.model.RespBean;
import org.neuedu.vue.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/art")
public class ArticleController {
    @Autowired
    ArtService artService;
    @GetMapping("/getArts")
    public PageInfo getArts(PageBean pageBean){
        return artService.getArts(pageBean);
    }

    @DeleteMapping("/delArts")
    public RespBean delArts(Integer[] ids){
        return artService.delArts(ids);
    }

    @PostMapping("/addArt")
    public RespBean addArt(@RequestBody Art art){
        return artService.addArt(art);
    }

    @GetMapping("/getArtByAid")
    public Art getArtByAid(Integer aid){
        return artService.getArtByAid(aid);
    }

    @PutMapping("/upArt")
    public RespBean upArt(@RequestBody Art art){
        return artService.upArt(art);
    }

    @DeleteMapping("/{aid}")
    public RespBean delArtByAid(@PathVariable("aid") Integer aid){
        return artService.delArtByAid(aid);
    }

    @PutMapping("/upArtStatus")
    public RespBean upArtStatus(Integer aid){
        return artService.upArtStatus(aid);
    }

    @PutMapping("/upArtView")
    public RespBean upArtView(Integer aid){
        return artService.upArtView(aid);
    }
}
