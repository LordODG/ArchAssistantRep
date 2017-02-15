package Modelo;

import Modelo.Atributocalidad;
import Modelo.Modulo;
import Modelo.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Escenario.class)
public class Escenario_ { 

    public static volatile SingularAttribute<Escenario, String> escEstado;
    public static volatile SingularAttribute<Escenario, Integer> escPrioridad;
    public static volatile SingularAttribute<Escenario, Atributocalidad> tblAtributoCalidadacID;
    public static volatile SingularAttribute<Escenario, Proyecto> tblProyectoProID;
    public static volatile SingularAttribute<Escenario, String> escNombre;
    public static volatile SingularAttribute<Escenario, String> escRespuesta;
    public static volatile SingularAttribute<Escenario, Integer> escID;
    public static volatile SingularAttribute<Escenario, Modulo> tblModuloModId;
    public static volatile SingularAttribute<Escenario, String> escAmbiente;
    public static volatile SingularAttribute<Escenario, String> escEstimulo;
    public static volatile SingularAttribute<Escenario, String> escMedidaRespuesta;
    public static volatile SingularAttribute<Escenario, String> escArtefacto;
    public static volatile SingularAttribute<Escenario, String> escFuente;

}