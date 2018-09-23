package staticProxy;

/**
 * 代理角色
 */
public class WeddingProxy implements Marry {

    private Marrier marrier;

    /**
     * 无参构造函数
     */
    public WeddingProxy(){

    }

    /**
     * 带参构造函数
     * @param marrier
     */
    public WeddingProxy(Marrier marrier){
        this.marrier=marrier;
    }

    @Override
    public void marry() {
        System.out.println("布置现场");
        marrier.marry();
        System.out.println("清理现场");
    }
}
