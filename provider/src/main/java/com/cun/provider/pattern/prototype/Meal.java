package com.cun.provider.pattern.prototype;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**原型模式
 * Created by LiuYuanZhe on 2018/11/25.
 */
@Getter
@Setter
@ToString
public class Meal {
    private String drink;
    private String food;

    @Override
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return object;
    }
}
