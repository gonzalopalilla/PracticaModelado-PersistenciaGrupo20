package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TipoElementoConverter implements AttributeConverter<ElementoDefensor, String> {
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        if(elementoDefensor instanceof Arco) {
            return "Arco";
        } else if (elementoDefensor instanceof Escudo) {
            return "Escudo";
        } else if (elementoDefensor instanceof Espada) {
            return "Espada";
        }
        return null;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String dbData) {
        if(dbData.equals("Arco")) {
            return new Arco();
        } else if (dbData.equals("Escudo")) {
            return new Escudo();
        } else if (dbData.equals("Espada")) {
            return new Espada();
        }
        return null;
    }
}
