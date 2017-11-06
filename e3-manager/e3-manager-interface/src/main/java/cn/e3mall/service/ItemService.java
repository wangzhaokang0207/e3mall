package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;
/**
 * 商品管理service接口
 * @author wzk
 *
 */
public interface ItemService {

	TbItem getItemById(Long itemId);
}
