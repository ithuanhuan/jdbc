package com.imooc.test;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

import java.util.*;

/**
 * Created by huan on 2015/5/12.
 */
public class TestAction {
    public static  void  main(String[] agrs) throws Exception {

        GoddessAction action = new GoddessAction();
        //查询

        Goddess g = new Goddess();
        g.setUser_name("小青3");
        g.setAge(25);
        g.setSex(1);
        g.setBirthday(new Date());
        g.setEmail("xiaoqing@163.com");
        g.setMobile("156888888");
        g.setIsdel(0);
        g.setId(14);

        //action.add(g);
        //action.del(8);
        // action.del(13);
        // action.edit(g);

        /*List<Map<String,Object>> params = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("name","user_name");
        map.put("rela","=");
        map.put("value","'小美'");

        params.add(map);

        List<Goddess> result = action.query(params);
        for (int i = 0;i< result.size();i++)
        {
            System.out.println(result.get(i).getId()+":"+result.get(i).getUser_name());
        }*/


    }
}
