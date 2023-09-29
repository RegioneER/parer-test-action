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
 * The persistent class for the ELV_V_COUNT_UD_MODIF database table.
 *
 */
@Entity
@Table(name = "ELV_V_COUNT_UD_MODIF")
@NamedQuery(name = "ElvVCountUdModif.findAll", query = "SELECT e FROM ElvVCountUdModif e")
public class ElvVCountUdModif implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niUnitaDocModElenco;
    private BigDecimal idElencoVers;

    public ElvVCountUdModif() {/* Hibernate */
    }

    @Column(name = "NI_UNITA_DOC_MOD_ELENCO")
    public BigDecimal getNiUnitaDocModElenco() {
        return this.niUnitaDocModElenco;
    }

    public void setNiUnitaDocModElenco(BigDecimal niUnitaDocModElenco) {
        this.niUnitaDocModElenco = niUnitaDocModElenco;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

}
