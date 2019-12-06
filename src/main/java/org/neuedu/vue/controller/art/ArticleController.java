package org.neuedu.vue.controller.art;

import com.github.pagehelper.PageInfo;
import org.neuedu.vue.model.PageBean;
import org.neuedu.vue.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/art")
public class ArticleController {
    @Autowired
    ArtService artService;
    @GetMapping("/getArts")
    public PageInfo getArts(PageBean pageBean){
        return artService.getArts(pageBean);
    }
}
