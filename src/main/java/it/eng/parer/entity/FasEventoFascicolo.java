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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the FAS_EVENTO_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "FAS_EVENTO_FASCICOLO")
@NamedQuery(name = "FasEventoFascicolo.findAll", query = "SELECT f FROM FasEventoFascicolo f")
public class FasEventoFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idEventoFascicolo;
    private String dsDenomEvento;
    private Date tsApertura;
    private Date tsChiusura;

    private FasFascicolo fasFascicolo;

    public FasEventoFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_EVENTO_FASCICOLO_IDEVENTOFASCICOLO_GENERATOR", sequenceName = "SFAS_EVENTO_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_EVENTO_FASCICOLO_IDEVENTOFASCICOLO_GENERATOR")
    @Column(name = "ID_EVENTO_FASCICOLO")
    public long getIdEventoFascicolo() {
        return this.idEventoFascicolo;
    }

    public void setIdEventoFascicolo(long idEventoFascicolo) {
        this.idEventoFascicolo = idEventoFascicolo;
    }

    @Column(name = "DS_DENOM_EVENTO")
    public String getDsDenomEvento() {
        return this.dsDenomEvento;
    }

    public void setDsDenomEvento(String dsDenomEvento) {
        this.dsDenomEvento = dsDenomEvento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_APERTURA")
    public Date getTsApertura() {
        return this.tsApertura;
    }

    public void setTsApertura(Date tsApertura) {
        this.tsApertura = tsApertura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_CHIUSURA")
    public Date getTsChiusura() {
        return this.tsChiusura;
    }

    public void setTsChiusura(Date tsChiusura) {
        this.tsChiusura = tsChiusura;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

}
