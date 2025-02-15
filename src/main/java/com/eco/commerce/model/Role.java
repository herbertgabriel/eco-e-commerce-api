package com.eco.commerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_roles")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long id;
    private String name;

    public enum Values{
        ADMIN(1L),
        EMPLOYER(2L),
        CONSUMER(3L);

        long roleId;
        Values(long roleId){
            this.roleId = roleId;
        }
        public long getRoleId() {
            return roleId;
        }
    }
}
