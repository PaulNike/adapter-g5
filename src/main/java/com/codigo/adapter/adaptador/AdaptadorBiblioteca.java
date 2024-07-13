package com.codigo.adapter.adaptador;

import com.codigo.adapter.antiguo.BibliotecaAntigua;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

@Component
public class AdaptadorBiblioteca {
    private final BibliotecaAntigua bibliotecaAntigua = new BibliotecaAntigua();

    public String obtenerDetalles(int idLibro){
        //Obtenemos los detalles del XML
        String detalles = bibliotecaAntigua.obtenerInfoAntigua(idLibro);
        //Conversion de XML a Json
        JSONObject jsonObject = XML.toJSONObject(detalles);
        //Retornar el JSON en String pero con un INDENTADO DE 4 para hacer mas legible la lectura del objeto
        return jsonObject.toString(4);
    }
}
