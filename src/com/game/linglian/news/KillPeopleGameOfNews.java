/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.linglian.news;

import com.alibaba.fastjson.JSON;
import com.game.linglian.function.KillPeopleGame;
import com.news.linglian.entity.User;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lol
 */
public class KillPeopleGameOfNews {

    public static void init(User user) {
        String par = user.getParam();
        if (par == null) {
            par = JSON.toJSONString(new HashMap<String, Object>());
        }
        Map<String, Object> map = JSON.parseObject(par);
        KillPeopleGame.init(map);
        user.setParam(JSON.toJSONString(map));
    }

    public static Map<String, Object> check(User u) {
        String par = u.getParam();
        if (par == null) {
            init(u);
        }
        return JSON.parseObject(u.getParam());
    }

    public static void attack(User u, User o) {
        Map<String, Object> uM = check(u);
        Map<String, Object> oM = check(o);
        KillPeopleGame.attack(uM, oM);
        u.setParam(JSON.toJSONString(uM));
        o.setParam(JSON.toJSONString(oM));
    }

    public static void heal(User u, int heal) {
        Map<String, Object> uM = check(u);
        KillPeopleGame.heal(uM, heal);
        u.setParam(JSON.toJSONString(uM));
    }

    public static int getParam(User u, String key) {
        Map<String, Object> uM = check(u);
        return Integer.parseInt(uM.get(key).toString());
    }

    public static void main(String[] args) {
        IUserServiceImpl ius = new IUserServiceImpl();
        User u = ius.getUserOfUserId("1");
        User o = ius.getUserOfUserId("3");
        attack(u, o);
        heal(u, 1);
        ius.updateOfUserId(u, u.getUserId());
        ius.updateOfUserId(o, o.getUserId());
        System.out.println(u);
        System.out.println(o);
    }
}
