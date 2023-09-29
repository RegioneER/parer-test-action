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
 * The persistent class for the MON_V_CHK_UD_NONVERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_NONVERS_AMB")
@NamedQuery(name = "MonVChkUdNonversAmb.findAll", query = "SELECT m FROM MonVChkUdNonversAmb m")
public class MonVChkUdNonversAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdNonversNorisolub;
    private String flUdNonversNoverif;
    private String flUdNonversVerif;
    private MonVChkUdNonversAmbId monVChkUdNonversAmbId;

    @EmbeddedId
    public MonVChkUdNonversAmbId getMonVChkUdNonversAmbId() {
        return monVChkUdNonversAmbId;
    }

    public void setMonVChkUdNonversAmbId(MonVChkUdNonversAmbId monVChkUdNonversAmbId) {
        this.monVChkUdNonversAmbId = monVChkUdNonversAmbId;
    }

    public MonVChkUdNonversAmb() {/* Hibernate */
    }

    @Column(name = "FL_UD_NONVERS_NORISOLUB", columnDefinition = "char(1)")
    public String getFlUdNonversNorisolub() {
        return this.flUdNonversNorisolub;
    }

    public void setFlUdNonversNorisolub(String flUdNonversNorisolub) {
        this.flUdNonversNorisolub = flUdNonversNorisolub;
    }

    @Column(name = "FL_UD_NONVERS_NOVERIF", columnDefinition = "char(1)")
    public String getFlUdNonversNoverif() {
        return this.flUdNonversNoverif;
    }

    public void setFlUdNonversNoverif(String flUdNonversNoverif) {
        this.flUdNonversNoverif = flUdNonversNoverif;
    }

    @Column(name = "FL_UD_NONVERS_VERIF", columnDefinition = "char(1)")
    public String getFlUdNonversVerif() {
        return this.flUdNonversVerif;
    }

    public void setFlUdNonversVerif(String flUdNonversVerif) {
        this.flUdNonversVerif = flUdNonversVerif;
    }

}
