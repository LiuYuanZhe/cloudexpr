package com.cun.provider.pattern.responsibilityofchain;

import lombok.Getter;
import lombok.Setter;

/**责任链模式，处理，传递
 * Created by LiuYuanZhe on 2018/12/4.
 *
 * 责任链模式优点：

 耦合度低，请求者和执行者并没有必然的联系；
 灵活度高，可以通过内部成员来进行更改它们执行的次序；
 扩展性好，Handler的子类扩展非常方便。

 责任链模式缺点：

 会在某程度上降低程序的性能，设置不当的话可能会出现循环调用。
 在链过长时，会降低代码的阅读性以及增加代码的复杂度。

 使用场景：

 需要动态指定处理某一组请求时，在不确定接受者的的情况下，向多个对象发送请求时。

 注意事项：

 虽然责任链模式很灵活，但是牺牲的是一定的性能，因为责任链模式是层级处理，在处理数据的有一定的延迟，所所以需要低延迟的情况下，不推荐使用责任链模式。

 */
@Getter
@Setter
public abstract class Leader {
    protected Leader leader;
    public abstract void handler(int level);
}
