/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.linglian.function;

import com.alibaba.fastjson.JSON;
import com.news.linglian.entity.User;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import java.util.HashMap;
import java.util.Map;
import util.GC;
import util.OperationException;

/**
 *
 * @author lol
 */
public class KillPeopleGame {

    /**
     * 初始化游戏对象
     *
     * @param u
     */
    public static void init(Map<String, Object> u) {
        GC gc = new GC();
        gc.addMap("u", u);
        try {
            gc.readLine("u.hp = 100;"
                    + "u.maxHp = 100;"
                    + "u.mp = 100"
                    + "u.maxMp = 100;"
                    + "u.lvl = 1;"
                    + "u.gjl = 5;"
                    + "u.fyl = 3;"
                    + "u.money = 50;");
        } catch (OperationException ex) {
            ex.printStackTrace();
        }
    }

    public static void heal(Map<String, Object> u, int heal) {
        GC gc = new GC();
        gc.addMap("u", u);
        try {
            gc.readLine("u.hp = u.hp + " + heal + ";"
                    + "if ({u.hp} > {u.maxHp}) {"
                    + "u.hp = u.maxHp;"
                    + "}");
        } catch (OperationException ex) {
            ex.printStackTrace();
        }
    }

    public static void attack(Map<String, Object> u, Map<String, Object> o) {
        GC gc = new GC();
        gc.addMap("u", u);
        gc.addMap("o", o);
        try {
            gc.readLine("attack = {u.gjl} - {o.fyl};"
                    + "if (attack < 0) {"
                    + "attack = 0;"
                    + "}"
                    + "o.hp = o.hp - attack;"
                    + "o.hp = o.hp < 0 ? 0 : o.hp;");
        } catch (OperationException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Map<String, Object> u = new HashMap();
        Map<String, Object> o = new HashMap();
        init(u);
        init(o);
        attack(u, o);
        System.out.println(u);
        System.out.println(o);
    }
}
