package com.domain;

/**
 * All rights Reserved, Designed By www.info4z.club
 * title:com.ujiuye.pojo
 * ClassName:Card
 * Description:TODO(请用一句话描述这个类的作用)
 * Compony:Info4z
 * author:poker_heart
 * date:2019/9/17
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Card {

    private Integer id;
    private String num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", num='" + num + '\'' +
                '}';
    }
}
