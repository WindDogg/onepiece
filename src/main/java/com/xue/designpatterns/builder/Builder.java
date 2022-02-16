package com.xue.designpatterns.builder;

import com.xue.designpatterns.builder.ceilling.LevelOneCeiling;
import com.xue.designpatterns.builder.ceilling.LevelTwoCeiling;
import com.xue.designpatterns.builder.coat.DuluxCoat;
import com.xue.designpatterns.builder.coat.LiBangCoat;
import com.xue.designpatterns.builder.floor.ShengXiangFloor;
import com.xue.designpatterns.builder.tile.DongPengTile;

import java.math.BigDecimal;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/16 9:29
 */
public class Builder {

    public IMenu levelOne(Double area){
        return new DpMenu(area,"豪华").appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat()).appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DpMenu(area,"轻奢").appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat()).appendFloor(new ShengXiangFloor());
    }

    public IMenu levelThree(Double area){
        return new DpMenu(area,"简约").appendCeiling(new LevelOneCeiling())
                .appendCoat(new DuluxCoat()).appendTile(new DongPengTile());
    }
}
