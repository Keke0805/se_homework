public class CQMaoduHotpot extends HotPot {

    public CQMaoduHotpot(){
        name="重庆毛肚火锅";
        meat="毛肚";
        greens="菜";
        material="底料";
    }

    @Override
    public void prepare() {
        System.out.println("重庆毛肚火锅准备中...");
    }
}
