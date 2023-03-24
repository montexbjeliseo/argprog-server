package com.mtx.argservr.mapper;

import com.mtx.argservr.dto.response.PublicResource;
import com.mtx.argservr.security.model.User;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.annotation.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-24T00:07:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class PublicResourceMapperImpl implements PublicResourceMapper {

    private final DatatypeFactory datatypeFactory;

    public PublicResourceMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public PublicResource toPR(User user) {
        if ( user == null ) {
            return null;
        }

        PublicResource publicResource = new PublicResource();

        publicResource.setFirstName( user.getFirstName() );
        publicResource.setLastName( user.getLastName() );
        publicResource.setAbout( user.getAbout() );
        publicResource.setPhoto( user.getPhoto() );
        publicResource.setBirthDate( xmlGregorianCalendarToCalendar( dateToXmlGregorianCalendar( user.getBirthDate() ) ) );
        publicResource.setEmail( user.getEmail() );
        publicResource.setPhoneNumber( user.getPhoneNumber() );

        return publicResource;
    }

    private Calendar xmlGregorianCalendarToCalendar( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis( xcal.toGregorianCalendar().getTimeInMillis() );
        return cal;
    }

    private XMLGregorianCalendar dateToXmlGregorianCalendar( Date date ) {
        if ( date == null ) {
            return null;
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime( date );
        return datatypeFactory.newXMLGregorianCalendar( c );
    }
}
