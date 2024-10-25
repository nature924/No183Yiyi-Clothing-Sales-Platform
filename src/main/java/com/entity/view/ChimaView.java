package com.entity.view;

import com.entity.ChimaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 尺码
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 12:28:04
 */
@TableName("chima")
public class ChimaView  extends ChimaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChimaView(){
	}
 
 	public ChimaView(ChimaEntity chimaEntity){
 	try {
			BeanUtils.copyProperties(this, chimaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
