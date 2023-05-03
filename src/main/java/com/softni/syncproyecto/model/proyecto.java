package com.softni.syncproyecto.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proyecto")
public class proyecto {
    String id;
    String idProyecto;
    String projectName;
    Integer numContrato;
    String fechaContratoProyecto;
    Integer totalCredito;
    Integer creditoPagado;
    Integer creditoPendientePago;
    Integer tasaInteres;
    String rutaContrato;
    Integer plazoCredito;
    Boolean Flujos;
    Boolean Finanzas;
    Boolean Fideicomisos;
    Boolean revisionDocumental;
    Boolean revisionLegal;
    Boolean revisionTecnica;
    Integer numProveedores;
    String diaPago;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProyecto() {
        return this.idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getNumContrato() {
        return this.numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public String getFechaContratoProyecto() {
        return this.fechaContratoProyecto;
    }

    public void setFechaContratoProyecto(String fechaContratoProyecto) {
        this.fechaContratoProyecto = fechaContratoProyecto;
    }

    public Integer getTotalCredito() {
        return this.totalCredito;
    }

    public void setTotalCredito(Integer totalCredito) {
        this.totalCredito = totalCredito;
    }

    public Integer getCreditoPagado() {
        return this.creditoPagado;
    }

    public void setCreditoPagado(Integer creditoPagado) {
        this.creditoPagado = creditoPagado;
    }

    public Integer getCreditoPendientePago() {
        return this.creditoPendientePago;
    }

    public void setCreditoPendientePago(Integer creditoPendientePago) {
        this.creditoPendientePago = creditoPendientePago;
    }

    public Integer getTasaInteres() {
        return this.tasaInteres;
    }

    public void setTasaInteres(Integer tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getRutaContrato() {
        return this.rutaContrato;
    }

    public void setRutaContrato(String rutaContrato) {
        this.rutaContrato = rutaContrato;
    }

    public Integer getPlazoCredito() {
        return this.plazoCredito;
    }

    public void setPlazoCredito(Integer plazoCredito) {
        this.plazoCredito = plazoCredito;
    }

    public Boolean isFlujos() {
        return this.Flujos;
    }

    public Boolean getFlujos() {
        return this.Flujos;
    }

    public void setFlujos(Boolean Flujos) {
        this.Flujos = Flujos;
    }

    public Boolean isFinanzas() {
        return this.Finanzas;
    }

    public Boolean getFinanzas() {
        return this.Finanzas;
    }

    public void setFinanzas(Boolean Finanzas) {
        this.Finanzas = Finanzas;
    }

    public Boolean isFideicomisos() {
        return this.Fideicomisos;
    }

    public Boolean getFideicomisos() {
        return this.Fideicomisos;
    }

    public void setFideicomisos(Boolean Fideicomisos) {
        this.Fideicomisos = Fideicomisos;
    }

    public Boolean isRevisionDocumental() {
        return this.revisionDocumental;
    }

    public Boolean getRevisionDocumental() {
        return this.revisionDocumental;
    }

    public void setRevisionDocumental(Boolean revisionDocumental) {
        this.revisionDocumental = revisionDocumental;
    }

    public Boolean isRevisionLegal() {
        return this.revisionLegal;
    }

    public Boolean getRevisionLegal() {
        return this.revisionLegal;
    }

    public void setRevisionLegal(Boolean revisionLegal) {
        this.revisionLegal = revisionLegal;
    }

    public Boolean isRevisionTecnica() {
        return this.revisionTecnica;
    }

    public Boolean getRevisionTecnica() {
        return this.revisionTecnica;
    }

    public void setRevisionTecnica(Boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    public Integer getNumProveedores() {
        return this.numProveedores;
    }

    public void setNumProveedores(Integer numProveedores) {
        this.numProveedores = numProveedores;
    }

    public String getDiaPago() {
        return this.diaPago;
    }

    public void setDiaPago(String diaPago) {
        this.diaPago = diaPago;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", idProyecto='" + getIdProyecto() + "'" +
                ", projectName='" + getProjectName() + "'" +
                ", numContrato='" + getNumContrato() + "'" +
                ", fechaContratoProyecto='" + getFechaContratoProyecto() + "'" +
                ", totalCredito='" + getTotalCredito() + "'" +
                ", creditoPagado='" + getCreditoPagado() + "'" +
                ", creditoPendientePago='" + getCreditoPendientePago() + "'" +
                ", tasaInteres='" + getTasaInteres() + "'" +
                ", rutaContrato='" + getRutaContrato() + "'" +
                ", plazoCredito='" + getPlazoCredito() + "'" +
                ", Flujos='" + isFlujos() + "'" +
                ", Finanzas='" + isFinanzas() + "'" +
                ", Fideicomisos='" + isFideicomisos() + "'" +
                ", revisionDocumental='" + isRevisionDocumental() + "'" +
                ", revisionLegal='" + isRevisionLegal() + "'" +
                ", revisionTecnica='" + isRevisionTecnica() + "'" +
                ", numProveedores='" + getNumProveedores() + "'" +
                ", diaPago='" + getDiaPago() + "'" +
                "}";
    }

}
