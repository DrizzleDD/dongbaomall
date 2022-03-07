package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Auther: WZY
 * @Date: 2022/3/6 - 03 - 06 - 13:50
 * @Description: com.msb.dongbao.ums.mapper
 * @version: 1.0
 */
@SpringBootTest(classes = com.msb.dongbao.ums.MsbDongbaoUmsApplication.class)
public class UserMemberTest {

    @Autowired
    UmsMemberMapper umsMemberMapper;

   /* @Test
    void insert(){

        UmsMember t = new UmsMember();
        t.setUsername("cpf2");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");


        umsMemberMapper.insert(t);*/
}


