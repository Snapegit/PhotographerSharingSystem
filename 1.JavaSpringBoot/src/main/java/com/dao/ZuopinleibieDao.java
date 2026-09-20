package com.dao;

import com.entity.ZuopinleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuopinleibieVO;
import com.entity.view.ZuopinleibieView;


/**
 * 作品类别
 * 
 * @author 
 * @email 
 * @date 2024-05-25 07:14:54
 */
public interface ZuopinleibieDao extends BaseMapper<ZuopinleibieEntity> {
	
	List<ZuopinleibieVO> selectListVO(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);
	
	ZuopinleibieVO selectVO(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);
	
	List<ZuopinleibieView> selectListView(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);

	List<ZuopinleibieView> selectListView(Pagination page,@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);

	
	ZuopinleibieView selectView(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);
	

}
