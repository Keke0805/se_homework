public class CDMaoduHotpot extends HotPot {

    public CDMaoduHotpot(){
        name="成都毛肚火锅";
        meat="毛肚";
        greens="菜";
        material="底料";
    }

    @Override
    public void prepare() {
        System.out.println("成都毛肚火锅准备中...");
    }
}
