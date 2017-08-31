package EntidadesDao;

import entidades.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class UsuarioDAO {
    SessionFactory sf =null;
    Session session = null;
    Transaction tx = null;
   
    public void agregar(Usuarios u) {
        try {
 sf = NewHibernateUtil.getSessionFactory();
  session = sf.openSession();
  tx = session.beginTransaction();
  session.save(u);
  session.getTransaction();
  tx.commit();
  session.close();
        } catch (Exception e) {
       
        throw new RuntimeException("no se pudo guardar");
        }

    }
}
