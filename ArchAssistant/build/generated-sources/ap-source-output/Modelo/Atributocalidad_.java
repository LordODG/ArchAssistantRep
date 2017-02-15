package Modelo;

import Modelo.Controlador;
import Modelo.Escenario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Atributocalidad.class)
public class Atributocalidad_ { 

    public static volatile SingularAttribute<Atributocalidad, Integer> acID;
    public static volatile SingularAttribute<Atributocalidad, String> acDescripcion;
    public static volatile ListAttribute<Atributocalidad, Escenario> escenarioList;
    public static volatile ListAttribute<Atributocalidad, Controlador> controladorList;
    public static volatile SingularAttribute<Atributocalidad, String> acNombre;

}