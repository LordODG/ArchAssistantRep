package Modelo;

import Modelo.Controlador;
import Modelo.Tactica;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Preocupacion.class)
public class Preocupacion_ { 

    public static volatile SingularAttribute<Preocupacion, Integer> preID;
    public static volatile SingularAttribute<Preocupacion, String> preDescripcion;
    public static volatile SingularAttribute<Preocupacion, String> preNombre;
    public static volatile ListAttribute<Preocupacion, Tactica> tacticaList;
    public static volatile SingularAttribute<Preocupacion, Controlador> tblControladorcontID;

}