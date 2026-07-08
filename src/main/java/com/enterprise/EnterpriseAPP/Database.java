package com.enterprise.EnterpriseAPP;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface Database {

    // The methods inside the interfaces are by default public only
     void save(String user) ;



}
