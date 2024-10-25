package com.dao;

import com.entity.ChimaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChimaVO;
import com.entity.view.ChimaView;


/**
 * 尺码
 * 
 * @author 
 * @email 
 * @date 2021-04-10 12:28:04
 */
public interface ChimaDao extends BaseMapper<ChimaEntity> {
	
	List<ChimaVO> selectListVO(@Param("ew") Wrapper<ChimaEntity> wrapper);
	
	ChimaVO selectVO(@Param("ew") Wrapper<ChimaEntity> wrapper);
	
	List<ChimaView> selectListView(@Param("ew") Wrapper<ChimaEntity> wrapper);

	List<ChimaView> selectListView(Pagination page,@Param("ew") Wrapper<ChimaEntity> wrapper);
	
	ChimaView selectView(@Param("ew") Wrapper<ChimaEntity> wrapper);
	
}
