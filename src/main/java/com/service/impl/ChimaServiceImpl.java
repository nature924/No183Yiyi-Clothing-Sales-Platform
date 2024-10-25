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


import com.dao.ChimaDao;
import com.entity.ChimaEntity;
import com.service.ChimaService;
import com.entity.vo.ChimaVO;
import com.entity.view.ChimaView;

@Service("chimaService")
public class ChimaServiceImpl extends ServiceImpl<ChimaDao, ChimaEntity> implements ChimaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChimaEntity> page = this.selectPage(
                new Query<ChimaEntity>(params).getPage(),
                new EntityWrapper<ChimaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChimaEntity> wrapper) {
		  Page<ChimaView> page =new Query<ChimaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChimaVO> selectListVO(Wrapper<ChimaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChimaVO selectVO(Wrapper<ChimaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChimaView> selectListView(Wrapper<ChimaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChimaView selectView(Wrapper<ChimaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
