package com.cun.provider.pattern.Factory.SimpleFactory;

import com.cun.provider.pattern.Factory.CF;
import com.cun.provider.pattern.Factory.Game;
import com.cun.provider.pattern.Factory.LOL;
import org.apache.commons.lang.StringUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Scanner;

/**简单工厂模式
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class GameFactory {
    private static String CF = "CF";
    private static String LOL = "LOL";
    public static Game getGame(String gamename){
        if (StringUtils.equals(CF,gamename)){
            return new CF();
        }else if(StringUtils.equals(LOL,gamename)){
            return new LOL();
        }
        return null;
    }

    public static void main(String[] args) {
        Game game = getGame("CF");
        game.play();

        Scanner sc = new Scanner(System.in);

    }

}
