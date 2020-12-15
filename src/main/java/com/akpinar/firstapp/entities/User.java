package com.akpinar.firstapp.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User model classi")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "user nesnesi tekil id alani")
    private int id;

    @ApiModelProperty(value = "user nesnesi ad alani")
    private String ad;

    @ApiModelProperty(value = "user nesnesi soyad alani")
    private String soyad;

    @ApiModelProperty(value = "user nesnesi mail alani")
    private String mail;


}
