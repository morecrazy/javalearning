package com.mine.javalearning.pool;

import org.apache.commons.pool.BasePoolableObjectFactory;

public class BaseObjectFactory extends BasePoolableObjectFactory<BaseObject>{

    //创建一个实例到对象池  
    @Override  
    public BaseObject makeObject() throws Exception {  
        BaseObject bo = new BaseObject();  
        return bo;  
    }  
  
}
