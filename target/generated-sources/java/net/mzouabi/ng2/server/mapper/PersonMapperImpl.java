package net.mzouabi.ng2.server.mapper;

import javax.annotation.Generated;
import net.mzouabi.ng2.server.dto.PersonDTO;
import net.mzouabi.ng2.server.model.Person;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-09T20:38:58-0300",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        return personDTO;
    }

    @Override
    public Person toEntity(PersonDTO person) {
        if ( person == null ) {
            return null;
        }

        Person person_ = new Person();

        return person_;
    }

    @Override
    public void mapToEntity(PersonDTO personDTO, Person person) {
        if ( personDTO == null ) {
            return;
        }
    }
}
