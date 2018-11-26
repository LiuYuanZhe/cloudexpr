package com.cun.provider.pattern.Factory.abstactfactory;

import com.cun.provider.pattern.Factory.Game;

/**
 * 在抽象工厂模式中，可以在不需要知道产品是怎么样的，只需知道是哪个工厂类就行了。
 * 我们也可以根据子类的共同的特性而将它们设计在一起，组成一个相同类型组，可以很方便的直接调用。
 * 但是相对的，产品族比较难以扩展，增加一个产品，需要增加相应的接口和实现类。例如某个品牌的手机，
 * 有不同系列，每个系列有不同的型号，如果只是增加型号的话，比较容易，但是相对的，增加某个系列就比较麻烦了。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public interface GameFactory {
    Game getLOL();
    Game getCF();
}
