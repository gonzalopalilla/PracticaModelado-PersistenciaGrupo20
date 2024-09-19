package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
public class Jugador {
  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String nombre;
  @Column
  private String apellido;
  @Column
  private LocalDate fechaAlta;
  @Column
  @OneToOne(mappedBy = "id_personaje", fetch = FetchType.EAGER)
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
