/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;

import it.eng.parer.grantedEntity.OrgServizioErog;

/**
 * The persistent class for the ORG_TIPO_SERVIZIO database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "ORG_TIPO_SERVIZIO")
@NamedQuery(name = "OrgTipoServizio.findAll", query = "SELECT o FROM OrgTipoServizio o")
public class OrgTipoServizio implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoServizio;

    private String cdTipoServizio;

    private String dsTipoServizio;

    private String ggFatturazione;

    private String tiClasseTipoServizio;

    private String tipoFatturazione;

    private List<OrgServizioErog> orgServizioErogs = new ArrayList<>();
    // private List<OrgTariffa> orgTariffas= new ArrayList<>();

    public OrgTipoServizio() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_TIPO_SERVIZIO")
    @XmlID
    public Long getIdTipoServizio() {
        return this.idTipoServizio;
    }

    public void setIdTipoServizio(Long idTipoServizio) {
        this.idTipoServizio = idTipoServizio;
    }

    @Column(name = "CD_TIPO_SERVIZIO")
    public String getCdTipoServizio() {
        return this.cdTipoServizio;
    }

    public void setCdTipoServizio(String cdTipoServizio) {
        this.cdTipoServizio = cdTipoServizio;
    }

    @XmlTransient
    @Column(name = "DS_TIPO_SERVIZIO")
    public String getDsTipoServizio() {
        return this.dsTipoServizio;
    }

    public void setDsTipoServizio(String dsTipoServizio) {
        this.dsTipoServizio = dsTipoServizio;
    }

    @XmlTransient
    @Column(name = "GG_FATTURAZIONE", columnDefinition = "char")
    public String getGgFatturazione() {
        return this.ggFatturazione;
    }

    public void setGgFatturazione(String ggFatturazione) {
        this.ggFatturazione = ggFatturazione;
    }

    @XmlTransient
    @Column(name = "TI_CLASSE_TIPO_SERVIZIO")
    public String getTiClasseTipoServizio() {
        return this.tiClasseTipoServizio;
    }

    public void setTiClasseTipoServizio(String tiClasseTipoServizio) {
        this.tiClasseTipoServizio = tiClasseTipoServizio;
    }

    @XmlTransient
    @Column(name = "TIPO_FATTURAZIONE")
    public String getTipoFatturazione() {
        return this.tipoFatturazione;
    }

    public void setTipoFatturazione(String tipoFatturazione) {
        this.tipoFatturazione = tipoFatturazione;
    }

    // bi-directional many-to-one association to OrgServizioErog
    @XmlTransient
    @OneToMany(mappedBy = "orgTipoServizio")
    public List<OrgServizioErog> getOrgServizioErogs() {
        return this.orgServizioErogs;
    }

    public void setOrgServizioErogs(List<OrgServizioErog> orgServizioErogs) {
        this.orgServizioErogs = orgServizioErogs;
    }

    public OrgServizioErog addOrgServizioErog(OrgServizioErog orgServizioErog) {
        getOrgServizioErogs().add(orgServizioErog);
        orgServizioErog.setOrgTipoServizio(this);
        return orgServizioErog;
    }

    public OrgServizioErog removeOrgServizioErog(OrgServizioErog orgServizioErog) {
        getOrgServizioErogs().remove(orgServizioErog);
        orgServizioErog.setOrgTipoServizio(null);
        return orgServizioErog;
    }
    //
    // //bi-directional many-to-one association to OrgTariffa
    // @OneToMany(mappedBy = "orgTipoServizio")
    // public List<OrgTariffa> getOrgTariffas() {
    // return this.orgTariffas;
    // }
    //
    // public void setOrgTariffas(List<OrgTariffa> orgTariffas) {
    // this.orgTariffas = orgTariffas;
    // }
    //
    // public OrgTariffa addOrgTariffa(OrgTariffa orgTariffa) {
    // getOrgTariffas().add(orgTariffa);
    // orgTariffa.setOrgTipoServizio(this);
    //
    // return orgTariffa;
    // }
    //
    // public OrgTariffa removeOrgTariffa(OrgTariffa orgTariffa) {
    // getOrgTariffas().remove(orgTariffa);
    // orgTariffa.setOrgTipoServizio(null);
    //
    // return orgTariffa;
    // }

}
