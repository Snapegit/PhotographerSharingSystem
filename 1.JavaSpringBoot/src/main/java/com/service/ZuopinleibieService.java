package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinleibieView;


/**
 * 作品类别
 *
 * @author 
 * @email 
 * @date 2024-05-25 07:14:54
 */
public interface ZuopinleibieService extends IService<ZuopinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopinleibieVO> selectListVO(Wrapper<ZuopinleibieEntity> wrapper);
   	
   	ZuopinleibieVO selectVO(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);
   	
   	List<ZuopinleibieView> selectListView(Wrapper<ZuopinleibieEntity> wrapper);
   	
   	ZuopinleibieView selectView(@Param("ew") Wrapper<ZuopinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopinleibieEntity> wrapper);

   	

}

