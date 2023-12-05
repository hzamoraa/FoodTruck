package foodtruck.entity;

import foodtruck.entity.Rellenos;
import foodtruck.entity.Salsas;
import foodtruck.entity.TacoStorage;
import foodtruck.entity.Tortillas;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-05T19:42:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Tacos.class)
public class Tacos_ { 

    public static volatile SingularAttribute<Tacos, Date> fecha;
    public static volatile SingularAttribute<Tacos, TacoStorage> estado;
    public static volatile SingularAttribute<Tacos, Rellenos> relleno1;
    public static volatile SingularAttribute<Tacos, Rellenos> relleno2;
    public static volatile SingularAttribute<Tacos, Rellenos> relleno3;
    public static volatile SingularAttribute<Tacos, Long> id;
    public static volatile SingularAttribute<Tacos, Tortillas> tortilla;
    public static volatile SingularAttribute<Tacos, Salsas> salsa;

}