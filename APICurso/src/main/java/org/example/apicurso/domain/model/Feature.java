package org.example.apicurso.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name = "tb_feature")
public class Feature extends BaseItem{
}
