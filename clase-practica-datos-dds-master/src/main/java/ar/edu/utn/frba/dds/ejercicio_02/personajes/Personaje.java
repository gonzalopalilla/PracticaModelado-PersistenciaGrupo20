package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.converters.TipoElementoConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_personaje", discriminatorType = DiscriminatorType.STRING)
public class Personaje{
  @Id
  @GeneratedValue
  private Long id;

  @Getter
  @ElementCollection
  @CollectionTable(name = "ElementoDefensor")
  @Convert(converter = TipoElementoConverter.class)
  @Column(name = "elemento")
  private List<ElementoDefensor> elementos;

  @Getter
  @Column(name = "tipo personaje")
  private TipoPersonaje tipoPersonaje;

  @Column
  @Getter @Setter
  private Integer estamina;

  @Column
  @Getter @Setter
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
