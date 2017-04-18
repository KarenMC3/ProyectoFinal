/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Karen Mendiola Carrillo
 */
public class cuestionario {
    
    String [] preguntas = new String[15];

    String [] respuestas = new String[15];
    
    public void cargar(){
        preguntas originales = new preguntas();
        for(int i = 0; i < 15; i++){
            preguntas[i] = originales.pregunta(i);
            respuestas[i] = originales.respuesta(i);
            
        }
    }
    
    public String mostrarPregunta(int i){
        return preguntas[i];
    }
    
    public String mostrarRespuestaCorrecta(int i){
        return respuestas[i];
    }
    
    public void cambiarPregunta(int i, String pregunta, String respuesta){
        preguntas[i-1] = pregunta;
        respuestas[i-1] = respuesta; 
    }
    
}
