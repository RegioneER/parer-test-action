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

package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_UD_ANNUL_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_ANNUL_AMB")
@NamedQuery(name = "MonVChkUdAnnulAmb.findAll", query = "SELECT m FROM MonVChkUdAnnulAmb m")
public class MonVChkUdAnnulAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdAnnul;
    private String flUdAnnulDafarePing;
    private String flUdAnnulDafareSacer;
    private MonVChkUdAnnulAmbId monVChkUdAnnulAmbId;

    @EmbeddedId
    public MonVChkUdAnnulAmbId getMonVChkUdAnnulAmbId() {
        return monVChkUdAnnulAmbId;
    }

    public void setMonVChkUdAnnulAmbId(MonVChkUdAnnulAmbId monVChkUdAnnulAmbId) {
        this.monVChkUdAnnulAmbId = monVChkUdAnnulAmbId;
    }

    public MonVChkUdAnnulAmb() {/* Hibernate */
    }

    @Column(name = "FL_UD_ANNUL", columnDefinition = "char(1)")
    public String getFlUdAnnul() {
        return this.flUdAnnul;
    }

    public void setFlUdAnnul(String flUdAnnul) {
        this.flUdAnnul = flUdAnnul;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_PING", columnDefinition = "char(1)")
    public String getFlUdAnnulDafarePing() {
        return this.flUdAnnulDafarePing;
    }

    public void setFlUdAnnulDafarePing(String flUdAnnulDafarePing) {
        this.flUdAnnulDafarePing = flUdAnnulDafarePing;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_SACER", columnDefinition = "char(1)")
    public String getFlUdAnnulDafareSacer() {
        return this.flUdAnnulDafareSacer;
    }

    public void setFlUdAnnulDafareSacer(String flUdAnnulDafareSacer) {
        this.flUdAnnulDafareSacer = flUdAnnulDafareSacer;
    }

}
