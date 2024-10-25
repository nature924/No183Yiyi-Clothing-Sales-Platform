package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChimaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChimaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChimaView;


/**
 * 尺码
 *
 * @author 
 * @email 
 * @date 2021-04-10 12:28:04
 */
public interface ChimaService extends IService<ChimaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChimaVO> selectListVO(Wrapper<ChimaEntity> wrapper);
   	
   	ChimaVO selectVO(@Param("ew") Wrapper<ChimaEntity> wrapper);
   	
   	List<ChimaView> selectListView(Wrapper<ChimaEntity> wrapper);
   	
   	ChimaView selectView(@Param("ew") Wrapper<ChimaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChimaEntity> wrapper);
   	
}

