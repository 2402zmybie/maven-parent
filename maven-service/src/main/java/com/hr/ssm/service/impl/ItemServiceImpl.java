package com.hr.ssm.service.impl;

import com.hr.ssm.dao.ItemMapper;
import com.hr.ssm.pojo.Item;
import com.hr.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
