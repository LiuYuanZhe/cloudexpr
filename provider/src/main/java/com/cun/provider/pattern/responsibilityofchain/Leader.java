package com.cun.provider.pattern.responsibilityofchain;

import lombok.Getter;
import lombok.Setter;

/**责任链模式，处理，传递
 * Created by LiuYuanZhe on 2018/12/4.
 */
@Getter
@Setter
public abstract class Leader {
    protected Leader leader;
    public abstract void handler(int level);
}
