package com.briup.cms.service;

import com.briup.cms.bean.Customer;

//第四步写这个
public interface ICustomerService {
    //根据id查询数据
    Customer findById(int id);

}
