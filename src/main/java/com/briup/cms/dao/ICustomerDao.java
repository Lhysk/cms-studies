package com.briup.cms.dao;
//第三步写这个
import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//<类名，主键类型>
public interface ICustomerDao extends JpaRepository<Customer,Integer> {
    //第六步加这个
    Customer queryById(int id);
}
