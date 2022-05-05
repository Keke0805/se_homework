public abstract class HotPotStore {
    public HotPot orderHotPot(String type) {
        HotPot hotpot;
        //调用工厂方法
        hotpot = createHotPot(type);
        hotpot.prepare();
        return hotpot;
    }

    //抽象工厂方法
    protected abstract HotPot createHotPot(String type);


}