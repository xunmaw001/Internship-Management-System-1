package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师评分
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 23:38:10
 */
@TableName("jiaoshipingfen")
public class JiaoshipingfenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshipingfenEntity() {
		
	}
	
	public JiaoshipingfenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 单位地址
	 */
					
	private String danweidizhi;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 学生学号
	 */
					
	private String xueshengxuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 实习评分
	 */
					
	private String shixipingfen;
	
	/**
	 * 批改时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pigaishijian;
	
	/**
	 * 实习评价
	 */
					
	private String shixipingjia;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：单位名称
	 */
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
	/**
	 * 设置：单位地址
	 */
	public void setDanweidizhi(String danweidizhi) {
		this.danweidizhi = danweidizhi;
	}
	/**
	 * 获取：单位地址
	 */
	public String getDanweidizhi() {
		return danweidizhi;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：学生学号
	 */
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	/**
	 * 获取：学生学号
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：实习评分
	 */
	public void setShixipingfen(String shixipingfen) {
		this.shixipingfen = shixipingfen;
	}
	/**
	 * 获取：实习评分
	 */
	public String getShixipingfen() {
		return shixipingfen;
	}
	/**
	 * 设置：批改时间
	 */
	public void setPigaishijian(Date pigaishijian) {
		this.pigaishijian = pigaishijian;
	}
	/**
	 * 获取：批改时间
	 */
	public Date getPigaishijian() {
		return pigaishijian;
	}
	/**
	 * 设置：实习评价
	 */
	public void setShixipingjia(String shixipingjia) {
		this.shixipingjia = shixipingjia;
	}
	/**
	 * 获取：实习评价
	 */
	public String getShixipingjia() {
		return shixipingjia;
	}

}
