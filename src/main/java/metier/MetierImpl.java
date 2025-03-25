package metier;

import dao.DaoImp;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public double calcul() {
        double d = dao.getData();
        double res = d*5;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
