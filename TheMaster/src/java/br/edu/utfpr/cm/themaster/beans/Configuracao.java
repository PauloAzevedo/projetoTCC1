/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.themaster.beans;

/**
 *
 * @author a1028367
 */
class Configuracao {
    private Integer id;
    private Processador processador;
    private Memoria memoria;
    private GPU gpu;
    private HardDisc hardDisco;
    private Programas programas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public HardDisc getHardDisco() {
        return hardDisco;
    }

    public void setHardDisco(HardDisc hardDisco) {
        this.hardDisco = hardDisco;
    }

    public Programas getProgramas() {
        return programas;
    }

    public void setProgramas(Programas programas) {
        this.programas = programas;
    }
    
    
    
}
