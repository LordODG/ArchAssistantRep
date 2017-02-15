package Modelo;

import Modelo.Atributocalidad;
import Modelo.Preocupacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Controlador.class)
public class Controlador_ { 

    public static volatile SingularAttribute<Controlador, Integer> contID;
    public static volatile SingularAttribute<Controlador, Atributocalidad> tblAtributoCalidadacID;
    public static volatile SingularAttribute<Controlador, String> contNombre;
    public static volatile SingularAttribute<Controlador, String> contDescripcion;
    public static volatile ListAttribute<Controlador, Preocupacion> preocupacionList;

}