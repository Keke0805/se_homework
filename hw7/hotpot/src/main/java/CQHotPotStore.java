public class CQHotPotStore extends HotPotStore {
    @Override
    protected HotPot createHotPot(String type) {

        if (type.equals("maodu")){
            return new CQMaoduHotpot();
        }
        if (type.equals("mutton")){
            return new CQMuttonHotPot();
        }
        if (type.equals("yuanyang")){
            return new CQYuanyangHotPot();
        }
        else
            return null;
    }
}
