public abstract class HotPot {
    //火锅信息
    protected String name;
    protected String meat;          //肉
    protected String greens;        //菜
    protected String material;      //底料

    public abstract void prepare();

    //区分不同对象
    public void display() {
        System.out.println(this.meat + this.greens + this.material);
    }

    //获取火锅名字
    public void getName(){
        System.out.println("这是"+name);
    }
}


