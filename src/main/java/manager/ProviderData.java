package manager;

import models.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProviderData {

    @DataProvider
    public Iterator<Object[]> userDTO(){   // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{
                User.builder()
                        .email("edpunk@bk.com")
                        .password("Nikonddddddddd12345!!!!!")
                        .build()
        });

        list.add(new Object[]{
                User.builder()
                        .email("edpunk@bk.com")
                        .password("Nikonddddddddd12345!!!!!")
                        .build()
        });

        list.add(new Object[]{
                User.builder()
                        .email("edpunk@bk.com")
                        .password("Nikonddddddddd12345!!!!!")
                        .build()
        });

                return list.iterator();


    }





}
