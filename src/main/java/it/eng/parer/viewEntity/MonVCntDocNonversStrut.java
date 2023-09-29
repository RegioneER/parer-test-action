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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_STRUT")
@NamedQuery(name = "MonVCntDocNonversStrut.findAll", query = "SELECT m FROM MonVCntDocNonversStrut m")
public class MonVCntDocNonversStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niDocNonvers;
    private MonVCntDocNonversStrutId monVCntDocNonversStrutId;

    @EmbeddedId
    public MonVCntDocNonversStrutId getMonVCntDocNonversStrutId() {
        return monVCntDocNonversStrutId;
    }

    public void setMonVCntDocNonversStrutId(MonVCntDocNonversStrutId monVCntDocNonversStrutId) {
        this.monVCntDocNonversStrutId = monVCntDocNonversStrutId;
    }

    public MonVCntDocNonversStrut() {/* Hibernate */
    }

    @Column(name = "NI_DOC_NONVERS")
    public BigDecimal getNiDocNonvers() {
        return this.niDocNonvers;
    }

    public void setNiDocNonvers(BigDecimal niDocNonvers) {
        this.niDocNonvers = niDocNonvers;
    }
}
