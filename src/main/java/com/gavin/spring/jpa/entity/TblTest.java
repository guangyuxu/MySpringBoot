package com.gavin.spring.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * There is no pk for table tblTest,
 * 1. all columns are defined ad @Id
 * 2. And the @IdClass is set as it self
 * 3. class marked as @NoArgsConstructor and @AllArgsConstructor
 * 4. implements Serializable
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TblTest")
@IdClass(TblTest.class)
public class TblTest implements Serializable {

    @Id
    @Column(name = "id1")
    private int id1;

    @Id
    @Column(name = "id2")
    private int id2;

    @Id
    @Column(name = "id3")
    private int id3;

}
