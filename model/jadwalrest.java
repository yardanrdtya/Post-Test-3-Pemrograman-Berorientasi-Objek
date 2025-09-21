/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class jadwalrest extends jadwal {
    public jadwalrest(String hari) {
        super("Rest Day", "-", hari);
    }

    @Override
    public String toString() {
        return "Hari " + getHari() + " adalah REST DAY!";
    }
}
