public class CQYuanyangHotPot extends HotPot {
    public CQYuanyangHotPot(){
        name="重庆鸳鸯火锅";
        meat="肉";
        greens="菜";
        material="底料";
    }
    @Override
    public void prepare() {
        System.out.println("重庆鸳鸯火锅准备中...");
    }
}
