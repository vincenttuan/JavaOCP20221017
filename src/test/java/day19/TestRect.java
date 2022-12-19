package day19;

import com.ocp.day19_assertion.Rect;
import org.junit.Assert;
import org.junit.Test;

public class TestRect {
    @Test
    public void test1() {
        // 利用 3A SOP步驟進行測試
        // Arrange 安排要測試的物件
        Rect rect = new Rect(10, 20);
        // Act 設定實際上會得到的值
        int actArea = rect.getArea();
        // Assert
        // 設定期望(expected)要得到的值
        int expectedArea = 200;
        
        // 將 expected 與 act 進行比對
        Assert.assertEquals(expectedArea, actArea);
        
    }
    
}
