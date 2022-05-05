import org.junit.Test;

public class HotPotTest {
    @Test
    public void test() {
        //创建一个成都火锅店对象
        HotPotStore cdstore=new CDHotPotStore();
        //订购羊肉火锅
        HotPot cdhotpot=cdstore.orderHotPot("mutton");
        cdhotpot.getName();
        cdhotpot.display();

        //创建一个重庆火锅店对象
        HotPotStore cqstore=new CQHotPotStore();
        //订购毛肚火锅
        HotPot cqhotpot=cqstore.orderHotPot("maodu");
        cqhotpot.getName();
        cqhotpot.display();
    }
}