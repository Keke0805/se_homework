public class CDMuttonHotPot extends HotPot {
    public CDMuttonHotPot(){
        name="成都羊肉火锅";
        meat="羊肉";
        greens="菜";
        material="底料";
    }
    @Override
    public void prepare() {
        System.out.println("成都羊肉火锅准备中...");
    }
}
