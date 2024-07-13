package com.codigo.adapter.antiguo;

public class BibliotecaAntigua {

    public String obtenerInfoAntigua(int idLibro){

        return "<libro>\n" +
                "    <id>" +idLibro+"</id>\n" +
                "    <titulo>Maria</titulo>\n" +
                "    <editorial>Ruben Editorial</editorial>\n" +
                "    <anio>1996</anio>\n" +
                "    <ciudad>Colombia</ciudad>\n" +
                "    <direccion>123 Calle Ficticia, Ciudad Ejemplo</direccion>\n" +
                "    <email>ruben.editorial@example.com</email>\n" +
                "    <telefono>1234567890</telefono>\n" +
                "    <genero>Terror</genero>\n" +
                "    <isbn>xxxxx-xxxx-xxx</isbn>\n" +
                "    <nacionalidad>Española</nacionalidad>\n" +
                "</libro>";
    }

    public String obtenerInfoAntigua2(int idLibro){

        return idLibro+"|Juan Pérez|Pérez|30|1990-05-20|123 Calle Ficticia, Ciudad Ejemplo|juan.perez@example.com|1234567890|Masculino|Soltero|Española";
    }

}
