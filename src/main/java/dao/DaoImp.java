package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao{

    @Override
    public double getData() {
        System.out.println("version 1");
        double data=88;
        return data;
    }
}
