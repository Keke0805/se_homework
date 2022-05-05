public class CQMuttonHotPot extends HotPot {
    public CQMuttonHotPot(){
        name="重庆羊肉火锅";
        meat="羊肉";
        greens="菜";
        material="底料";
    }
    @Override
    public void prepare() {
        System.out.println("重庆羊肉火锅准备中...");
    }
}
