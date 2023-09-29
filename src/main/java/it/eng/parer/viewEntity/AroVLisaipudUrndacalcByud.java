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
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_LISAIPUD_URNDACALC_BYUD database table.
 *
 */
@Entity
@Table(name = "ARO_V_LISAIPUD_URNDACALC_BYUD")
@NamedQuery(name = "AroVLisaipudUrndacalcByud.findAll", query = "SELECT v FROM AroVLisaipudUrndacalcByud v")
public class AroVLisaipudUrndacalcByud implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idVerIndiceAip;

    public AroVLisaipudUrndacalcByud() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Id
    @Column(name = "ID_VER_INDICE_AIP")
    public BigDecimal getIdVerIndiceAip() {
        return idVerIndiceAip;
    }

    public void setIdVerIndiceAip(BigDecimal idVerIndiceAip) {
        this.idVerIndiceAip = idVerIndiceAip;
    }

}
