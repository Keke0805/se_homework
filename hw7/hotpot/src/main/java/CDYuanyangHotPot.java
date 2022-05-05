public class CDYuanyangHotPot extends HotPot {
    public CDYuanyangHotPot(){
        name="成都鸳鸯火锅";
        meat="肉";
        greens="菜";
        material="底料";
    }
    @Override
    public void prepare() {
        System.out.println("成都鸳鸯火锅准备中...");
    }
}
