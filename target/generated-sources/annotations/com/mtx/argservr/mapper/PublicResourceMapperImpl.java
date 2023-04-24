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
    date = "2023-04-23T21:35:58-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
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

        publicResource.setAbout( user.getAbout() );
        publicResource.setBirthDate( xmlGregorianCalendarToCalendar( dateToXmlGregorianCalendar( user.getBirthDate() ) ) );
        publicResource.setEmail( user.getEmail() );
        publicResource.setFirstName( user.getFirstName() );
        publicResource.setLastName( user.getLastName() );
        publicResource.setPhoneNumber( user.getPhoneNumber() );
        publicResource.setPhoto( user.getPhoto() );

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
