package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuopinleibieEntity;
import com.entity.view.ZuopinleibieView;

import com.service.ZuopinleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 作品类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-25 07:14:54
 */
@RestController
@RequestMapping("/zuopinleibie")
public class ZuopinleibieController {
    @Autowired
    private ZuopinleibieService zuopinleibieService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuopinleibieEntity zuopinleibie,
		HttpServletRequest request){
        EntityWrapper<ZuopinleibieEntity> ew = new EntityWrapper<ZuopinleibieEntity>();

		PageUtils page = zuopinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuopinleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuopinleibieEntity zuopinleibie, 
		HttpServletRequest request){
        EntityWrapper<ZuopinleibieEntity> ew = new EntityWrapper<ZuopinleibieEntity>();

		PageUtils page = zuopinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuopinleibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuopinleibieEntity zuopinleibie){
       	EntityWrapper<ZuopinleibieEntity> ew = new EntityWrapper<ZuopinleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuopinleibie, "zuopinleibie")); 
        return R.ok().put("data", zuopinleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuopinleibieEntity zuopinleibie){
        EntityWrapper< ZuopinleibieEntity> ew = new EntityWrapper< ZuopinleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuopinleibie, "zuopinleibie")); 
		ZuopinleibieView zuopinleibieView =  zuopinleibieService.selectView(ew);
		return R.ok("查询作品类别成功").put("data", zuopinleibieView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuopinleibieEntity zuopinleibie = zuopinleibieService.selectById(id);
        return R.ok().put("data", zuopinleibie);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuopinleibieEntity zuopinleibie = zuopinleibieService.selectById(id);
        return R.ok().put("data", zuopinleibie);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuopinleibieEntity zuopinleibie, HttpServletRequest request){
        if(zuopinleibieService.selectCount(new EntityWrapper<ZuopinleibieEntity>().eq("zuopinleibie", zuopinleibie.getZuopinleibie()))>0) {
            return R.error("作品类别已存在");
        }
    	//ValidatorUtils.validateEntity(zuopinleibie);
        zuopinleibieService.insert(zuopinleibie);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuopinleibieEntity zuopinleibie, HttpServletRequest request){
        if(zuopinleibieService.selectCount(new EntityWrapper<ZuopinleibieEntity>().eq("zuopinleibie", zuopinleibie.getZuopinleibie()))>0) {
            return R.error("作品类别已存在");
        }
    	//ValidatorUtils.validateEntity(zuopinleibie);
        zuopinleibieService.insert(zuopinleibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuopinleibieEntity zuopinleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuopinleibie);
        if(zuopinleibieService.selectCount(new EntityWrapper<ZuopinleibieEntity>().ne("id", zuopinleibie.getId()).eq("zuopinleibie", zuopinleibie.getZuopinleibie()))>0) {
            return R.error("作品类别已存在");
        }
        zuopinleibieService.updateById(zuopinleibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuopinleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
