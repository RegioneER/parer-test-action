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

package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The persistent class for the USR_STATO_USER database table.
 */
// @Entity
// @Table(schema = "SACER_IAM", name = "USR_STATO_USER")
// @NamedQuery(name = "UsrStatoUser.findAll", query = "SELECT u FROM UsrStatoUser u")
public class UsrStatoUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStatoUser;

    private String tiStatoUser;

    private Timestamp tsStato;

    private UsrUser usrUser;

    public UsrStatoUser() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_STATO_USER")
    public Long getIdStatoUser() {
        return this.idStatoUser;
    }

    public void setIdStatoUser(Long idStatoUser) {
        this.idStatoUser = idStatoUser;
    }

    @Column(name = "TI_STATO_USER")
    public String getTiStatoUser() {
        return this.tiStatoUser;
    }

    public void setTiStatoUser(String tiStatoUser) {
        this.tiStatoUser = tiStatoUser;
    }

    @Column(name = "TS_STATO")
    public Timestamp getTsStato() {
        return this.tsStato;
    }

    public void setTsStato(Timestamp tsStato) {
        this.tsStato = tsStato;
    }

    // bi-directional many-to-one association to UsrUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public UsrUser getUsrUser() {
        return this.usrUser;
    }

    public void setUsrUser(UsrUser usrUser) {
        this.usrUser = usrUser;
    }
}
