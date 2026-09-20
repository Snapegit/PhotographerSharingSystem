package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuopinleibieDao;
import com.entity.ZuopinleibieEntity;
import com.service.ZuopinleibieService;
import com.entity.vo.ZuopinleibieVO;
import com.entity.view.ZuopinleibieView;

@Service("zuopinleibieService")
public class ZuopinleibieServiceImpl extends ServiceImpl<ZuopinleibieDao, ZuopinleibieEntity> implements ZuopinleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopinleibieEntity> page = this.selectPage(
                new Query<ZuopinleibieEntity>(params).getPage(),
                new EntityWrapper<ZuopinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopinleibieEntity> wrapper) {
		  Page<ZuopinleibieView> page =new Query<ZuopinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZuopinleibieVO> selectListVO(Wrapper<ZuopinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopinleibieVO selectVO(Wrapper<ZuopinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopinleibieView> selectListView(Wrapper<ZuopinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopinleibieView selectView(Wrapper<ZuopinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
