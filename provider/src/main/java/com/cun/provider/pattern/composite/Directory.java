package com.cun.provider.pattern.composite;

import org.apache.commons.lang.UnhandledException;

import java.util.ArrayList;
import java.util.List;

/**
 组合模式的优点:
 高层模块调用较为简单，增加某个节点方便。
 组合模式的缺点:
 因为其子节点的声明都是实现类，而不是接口，违反了依赖倒置原则。
 使用场景: 可以表示为 ‘部分-整体’的层级结构。
 * Created by LiuYuanZhe on 2018/11/28.
 */
public class Directory {
    private String name;
    private String description;
    private List<Directory> directories;
    public Directory(){
        directories = new ArrayList<>();
    }
    public void addDirectory(Directory e){
        directories.add(e);
    }
    public void removeDirectory(Directory e) throws Exception {
        if (directories.size()>0) {
            directories.remove(e);
        }else {
            throw new Exception();
        }
    }
    public List<Directory> get(){
        return directories;
    }
}
