package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("ladron")
public class Ladron extends Personaje{
  @Column
  private Integer nivelSiniestro;
  @Column
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
    //TODO
  }
}
