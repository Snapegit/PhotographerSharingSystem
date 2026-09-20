package com.entity.model;

import com.entity.ZuopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-05-25 07:14:54
 */
public class ZuopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品类别
	 */
	
	private String zuopinleibie;
		
	/**
	 * 摄影标签
	 */
	
	private String sheyingbiaoqian;
		
	/**
	 * 作品封面
	 */
	
	private String zuopinfengmian;
		
	/**
	 * 拍摄地点
	 */
	
	private String paishedidian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 光圈大小
	 */
	
	private String guangquandaxiao;
		
	/**
	 * 快门速度
	 */
	
	private String kuaimensudu;
		
	/**
	 * 感光度
	 */
	
	private String ganguangdu;
		
	/**
	 * 镜头焦距
	 */
	
	private String jingtoujiaoju;
		
	/**
	 * 作品推文
	 */
	
	private String zuopintuiwen;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：作品类别
	 */
	 
	public void setZuopinleibie(String zuopinleibie) {
		this.zuopinleibie = zuopinleibie;
	}
	
	/**
	 * 获取：作品类别
	 */
	public String getZuopinleibie() {
		return zuopinleibie;
	}
				
	
	/**
	 * 设置：摄影标签
	 */
	 
	public void setSheyingbiaoqian(String sheyingbiaoqian) {
		this.sheyingbiaoqian = sheyingbiaoqian;
	}
	
	/**
	 * 获取：摄影标签
	 */
	public String getSheyingbiaoqian() {
		return sheyingbiaoqian;
	}
				
	
	/**
	 * 设置：作品封面
	 */
	 
	public void setZuopinfengmian(String zuopinfengmian) {
		this.zuopinfengmian = zuopinfengmian;
	}
	
	/**
	 * 获取：作品封面
	 */
	public String getZuopinfengmian() {
		return zuopinfengmian;
	}
				
	
	/**
	 * 设置：拍摄地点
	 */
	 
	public void setPaishedidian(String paishedidian) {
		this.paishedidian = paishedidian;
	}
	
	/**
	 * 获取：拍摄地点
	 */
	public String getPaishedidian() {
		return paishedidian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：光圈大小
	 */
	 
	public void setGuangquandaxiao(String guangquandaxiao) {
		this.guangquandaxiao = guangquandaxiao;
	}
	
	/**
	 * 获取：光圈大小
	 */
	public String getGuangquandaxiao() {
		return guangquandaxiao;
	}
				
	
	/**
	 * 设置：快门速度
	 */
	 
	public void setKuaimensudu(String kuaimensudu) {
		this.kuaimensudu = kuaimensudu;
	}
	
	/**
	 * 获取：快门速度
	 */
	public String getKuaimensudu() {
		return kuaimensudu;
	}
				
	
	/**
	 * 设置：感光度
	 */
	 
	public void setGanguangdu(String ganguangdu) {
		this.ganguangdu = ganguangdu;
	}
	
	/**
	 * 获取：感光度
	 */
	public String getGanguangdu() {
		return ganguangdu;
	}
				
	
	/**
	 * 设置：镜头焦距
	 */
	 
	public void setJingtoujiaoju(String jingtoujiaoju) {
		this.jingtoujiaoju = jingtoujiaoju;
	}
	
	/**
	 * 获取：镜头焦距
	 */
	public String getJingtoujiaoju() {
		return jingtoujiaoju;
	}
				
	
	/**
	 * 设置：作品推文
	 */
	 
	public void setZuopintuiwen(String zuopintuiwen) {
		this.zuopintuiwen = zuopintuiwen;
	}
	
	/**
	 * 获取：作品推文
	 */
	public String getZuopintuiwen() {
		return zuopintuiwen;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
