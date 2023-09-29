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

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_RICHANN database table.
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_RICHANN")
@NamedQuery(name = "SerVLisVerserByRichann.findAll", query = "SELECT s FROM SerVLisVerserByRichann s")
public class SerVLisVerserByRichann implements Serializable {

    private static final long serialVersionUID = 1L;

    public SerVLisVerserByRichann() {/* Hibernate */
    }

    private SerVLisVerserByRichannId serVLisVerserByRichannId;

    @EmbeddedId()
    public SerVLisVerserByRichannId getSerVLisVerserByRichannId() {
        return serVLisVerserByRichannId;
    }

    public void setSerVLisVerserByRichannId(SerVLisVerserByRichannId serVLisVerserByRichannId) {
        this.serVLisVerserByRichannId = serVLisVerserByRichannId;
    }
}
