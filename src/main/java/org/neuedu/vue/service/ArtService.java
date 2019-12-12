package org.neuedu.vue.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.vue.mapper.ArtMapper;
import org.neuedu.vue.model.Art;
import org.neuedu.vue.model.PageBean;
import org.neuedu.vue.model.RespBean;
import org.neuedu.vue.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {
    @Autowired
    ArtMapper artMapper;
    @Cacheable(value = {"arts"},key = "#pageBean.status")
    public PageInfo getArts(PageBean pageBean){
        if(pageBean.getStatus() != -1){
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            pageBean.setUid(user.getId());
        }
        PageHelper.startPage(pageBean.getPageNum(),pageBean.getPageSize());
        List<Art> arts = artMapper.getArts(pageBean);
        PageInfo pageInfo = new PageInfo(arts);
        return pageInfo;
    }

    public RespBean delArts(Integer[] ids) {
        Integer i = artMapper.delArts(ids);
        if(i == 0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }

    public RespBean addArt(Art art) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        art.setUid(user.getId());
        Integer i = artMapper.addArt(art);
        if(i == 0){
            return RespBean.error("发布失败");
        }else{
            return RespBean.ok("发布成功");
        }
    }

    @Cacheable(value = {"art"},key = "#aid")
    public Art getArtByAid(Integer aid) {
        return artMapper.getArtByAid(aid);
    }

    public RespBean upArt(Art art) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        art.setUid(user.getId());
        Integer i = artMapper.upArt(art);
        if(i == 0){
            return RespBean.error("修改失败");
        }else{
            return RespBean.ok("修改成功");
        }
    }

    public RespBean delArtByAid(Integer aid) {
        Integer i = artMapper.delArtByAid(aid);
        if(i == 0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }

    public RespBean upArtStatus(Integer aid) {
        Integer i = artMapper.upArtStatus(aid);
        if(i == 0){
            return RespBean.error("修改失败");
        }else{
            return RespBean.ok("修改成功");
        }
    }

    public RespBean upArtView(Integer aid) {
        Integer i = artMapper.upArtView(aid);
        if(i == 0){
            return RespBean.error("修改失败");
        }else{
            return RespBean.ok("修改成功");
        }
    }
}
