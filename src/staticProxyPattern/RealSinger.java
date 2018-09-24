package staticProxyPattern;

public class RealSinger implements Singer{
    @Override
    public void sing() {
        System.out.printf("Stefanie Sun sing a 《天黑黑》");
    }

    @Override
    public void signContract() {

    }

    @Override
    public void discussBusiness() {

    }
}
