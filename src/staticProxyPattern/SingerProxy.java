package staticProxyPattern;

public class SingerProxy implements Singer{
    private Singer singer;

    public SingerProxy(Singer singer){
        this.singer = singer;
    }
    @Override
    public void sing() {
        singer.sing();
    }

    @Override
    public void signContract() {
        System.out.println("SingerProxy sign a contract");
    }

    @Override
    public void discussBusiness() {
        System.out.println("SingerProxy discuss business");
    }
}
