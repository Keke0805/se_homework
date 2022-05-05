public class CDHotPotStore extends HotPotStore {
    @Override
    protected HotPot createHotPot(String type) {
        if (type.equals("maodu")){
            return new CDMaoduHotpot();
        }
        if (type.equals("mutton")){
            return new CDMuttonHotPot();
        }
        if (type.equals("yuanyang")){
            return new CDYuanyangHotPot();
        }
        else
            return null;
    }
}
