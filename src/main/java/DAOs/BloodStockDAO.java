package DAOs;

import Entities.BloodStock;
import Entities.Location;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BloodStockDAO {

    public boolean saveBlood(BloodStock blo){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            session.save(blo);
            // commit transaction
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;

    }
}
