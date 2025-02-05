package binarysearch_test.rotationpointsearch;

import binarysearch.rotationpointsearch.RotationPoint;
import org.junit.Assert;
import org.junit.Test;

public class rotationpoint_test {
    @Test
    public void tester(){
        int [] arr = {50,60,70,10,20,30};
        Assert.assertEquals(3, RotationPoint.findRotationPoint(arr));
//        Assert.assertEquals(3,RotationPoint.findRotationPoint(new int[]{50,60,70,10,20,30}));
    }
}
