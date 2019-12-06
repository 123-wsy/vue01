package org.neuedu.vue.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.vue.mapper.ArtMapper;
import org.neuedu.vue.model.Art;
import org.neuedu.vue.model.PageBean;
import org.neuedu.vue.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {
    @Autowired
    ArtMapper artMapper;
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
}
