package com.bidea.bideafactory.entities;

import com.bidea.bideafactory.dto.CLienteDTO;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "starDate")
    private Date starDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "houseId")
    private Long houseId;

    @Column(name = "discountCode")
    private String discountCode;

    public Cliente() {
    }

    public Cliente(Long id, String name, String lastName, int age, String phoneNumber, Date starDate, Date endDate, Long houseId, String discountCode) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.starDate = starDate;
        this.endDate = endDate;
        this.houseId = houseId;
        this.discountCode = discountCode;
    }

    public Cliente(CLienteDTO cLienteDTO) {
        this.name = cLienteDTO.getName();
        this.lastName = cLienteDTO.getLastName();
        this.age = cLienteDTO.getAge();
        this.phoneNumber = cLienteDTO.getPhoneNumber();
        this.starDate = cLienteDTO.getStarDate();
        this.endDate = cLienteDTO.getEndDate();
        this.houseId = cLienteDTO.getHouseId();
        this.discountCode = cLienteDTO.getDiscountCode();
    }

    public void atualizar(Cliente cliente){
        if(cliente.getName() != null){
            this.name = cliente.getName();
        }
        if(cliente.getName() != null){
            this.lastName = cliente.getLastName();
        }
        if(cliente.getName() != null){
            this.age = cliente.getAge();
        }
        if(cliente.getName() != null){
            this.phoneNumber = cliente.getPhoneNumber();
        }
        if(cliente.getName() != null){
            this.starDate = cliente.getStarDate();
        }
        if(cliente.getName() != null){
            this.endDate = cliente.getEndDate();
        }
        if(cliente.getName() != null){
            this.houseId = cliente.getHouseId();
        }
        if(cliente.getName() != null){
            this.discountCode = cliente.getDiscountCode();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return age == cliente.age && Objects.equals(id, cliente.id) && Objects.equals(name, cliente.name) && Objects.equals(lastName, cliente.lastName) && Objects.equals(phoneNumber, cliente.phoneNumber) && Objects.equals(starDate, cliente.starDate) && Objects.equals(endDate, cliente.endDate) && Objects.equals(houseId, cliente.houseId) && Objects.equals(discountCode, cliente.discountCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, age, phoneNumber, starDate, endDate, houseId, discountCode);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", starDate=" + starDate +
                ", endDate=" + endDate +
                ", houseId=" + houseId +
                ", discountCode='" + discountCode + '\'' +
                '}';
    }
}
