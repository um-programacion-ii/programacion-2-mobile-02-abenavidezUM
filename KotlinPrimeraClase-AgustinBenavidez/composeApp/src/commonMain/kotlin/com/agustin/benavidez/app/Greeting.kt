/*
 * Clase Greeting personalizada
 * Autor: Agustin Benavidez - Legajo 62344
 */
package com.agustin.benavidez.app

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "¡Hola desde ${platform.name}!"
    }
    
    fun getAuthorInfo(): String {
        return "Creado por Agustin Benavidez (Legajo: 62344)"
    }
}