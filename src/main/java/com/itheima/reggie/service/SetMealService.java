package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetMealService extends IService<Setmeal> {
    //新增快餐
    public void saveWithDish(SetmealDto setmealDto);

    //删除快餐
    public void removeWithDish(List<Long> ids);

    public void updateSetmealStatusById(Integer status, List<Long> ids);

    public SetmealDto getDate(Long id);

}
