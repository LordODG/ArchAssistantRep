package Modelo;

import Modelo.Tactica;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Patron.class)
public class Patron_ { 

    public static volatile SingularAttribute<Patron, String> patNombre;
    public static volatile SingularAttribute<Patron, Integer> patID;
    public static volatile ListAttribute<Patron, Tactica> tacticaList;
    public static volatile SingularAttribute<Patron, String> patDescripcion;

}