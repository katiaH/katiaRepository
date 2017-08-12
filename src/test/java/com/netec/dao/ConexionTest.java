package com.netec.dao;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexionTest {
    
    @Test
    public void ConexionTest() {
        
        ConeccionDao con = new ConeccionDao();
        con.Conectar();
        Assert.assertNotNull(con.getCon());
    }
    
}
