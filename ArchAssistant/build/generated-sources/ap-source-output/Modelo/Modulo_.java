package Modelo;

import Modelo.Escenario;
import Modelo.Interface;
import Modelo.Modulo;
import Modelo.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-11T08:17:01")
@StaticMetamodel(Modulo.class)
public class Modulo_ { 

    public static volatile SingularAttribute<Modulo, String> modFinal;
    public static volatile SingularAttribute<Modulo, String> modDescripcion;
    public static volatile SingularAttribute<Modulo, String> modNombre;
    public static volatile SingularAttribute<Modulo, Modulo> tblModuloModId;
    public static volatile ListAttribute<Modulo, Escenario> escenarioList;
    public static volatile SingularAttribute<Modulo, Proyecto> tblProyectoProID;
    public static volatile ListAttribute<Modulo, Interface> interfaceList;
    public static volatile SingularAttribute<Modulo, Integer> modId;
    public static volatile ListAttribute<Modulo, Modulo> moduloList;

}