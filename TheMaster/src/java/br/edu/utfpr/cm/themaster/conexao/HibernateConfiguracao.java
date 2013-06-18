/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.conexao;


//import br.com.ortus.beans.*;
import br.edu.utfpr.cm.themaster.beans.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Paulo
 */
public abstract class HibernateConfiguracao {

    private static AnnotationConfiguration cfg;
    private static SessionFactory sessionFactory;
    
    private static String usuarioBase = "root";// seu nome de usuario da base de dados aqui
    private static String senhaBase = "aluno";// sua seha de usuario da base de dados aqui
    private static String baseDados = "themaster147";// o nome da sua base de dados aqui

    public static Session openConect() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.username", usuarioBase);
            cfg.setProperty("hibernate.connection.password", senhaBase);
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://192.168.1.250:3306/"+baseDados);
            //cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/"+baseDados);
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.connection.autocommit", "true");

            cfg.addAnnotatedClass(Configuracao.class);
            cfg.addAnnotatedClass(GPU.class);
            cfg.addAnnotatedClass(HardDisc.class);
            cfg.addAnnotatedClass(Maquina.class);
            cfg.addAnnotatedClass(Memoria.class);
            cfg.addAnnotatedClass(Processador.class);
            cfg.addAnnotatedClass(Programas.class);
            cfg.addAnnotatedClass(Tipo.class);
            cfg.addAnnotatedClass(Usuario.class);
            
            
            
            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static void criarSchema() {
        openConect().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }
    
    public static List<Object> runHQLQuery(String hql){
        Session session = TransactionManager.getCurrentSession();
        return session.createQuery(hql).list();
    }

    public static String getSenhaBase() {
        return senhaBase;
    }

    public static void setSenhaBase(String senhaBase) {
        HibernateConfiguracao.senhaBase = senhaBase;
    }

    public static String getUsuarioBase() {
        return usuarioBase;
    }

    public static void setUsuarioBase(String usuarioBase) {
        HibernateConfiguracao.usuarioBase = usuarioBase;
    }

    public static String getBaseDados() {
        return baseDados;
    }

    public static void setBaseDados(String baseDados) {
        HibernateConfiguracao.baseDados = baseDados;
    }
    
    
    public static ArrayList<Class> getEntityClasses() {
        ArrayList<Class> classes = new ArrayList<Class>();

        if (cfg == null) {
            openConect();
        }
        
        Iterator i = cfg.getClassMappings();
        while(i.hasNext()) {
            classes.add(((PersistentClass)i.next()).getMappedClass());
        }
        return classes;
    }
    
    
    
}
