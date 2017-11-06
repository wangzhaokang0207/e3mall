package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
/**
 * 商品管理service实现
 * @author wzk
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper ibItemMapper;
	@Override
	public TbItem getItemById(Long itemId) {
		TbItem selectByPrimaryKey = ibItemMapper.selectByPrimaryKey(itemId);
		return selectByPrimaryKey;
	}

}
