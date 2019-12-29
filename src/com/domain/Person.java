package com.domain;

/**
 * All rights Reserved, Designed By www.info4z.club
 * title:com.ujiuye.pojo
 * ClassName:Person
 * Description:TODO(请用一句话描述这个类的作用)
 * Compony:Info4z
 * author:poker_heart
 * date:2019/9/17
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Person {

    private Integer id;
    private String name;
    private Integer sex;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", card=" + card +
                '}';
    }

    Card card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
