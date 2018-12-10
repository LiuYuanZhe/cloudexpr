package com.cun.provider.pattern.proxy;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by LiuYuanZhe on 2018/12/3.
 */
@Setter
@Getter
public class ProxyPerson implements Shopping {
    private ExecutePerson ep;
    public ProxyPerson(ExecutePerson person){
        this.ep = person;
    }
    @Override
    public void buySomething() {
        ep.buySomething();
    }

    public static void main(String[] args) {
        String personname = "牛大";
        Shopping shop = new ProxyPerson(new ExecutePerson(personname));
        shop.buySomething();
    }
}
