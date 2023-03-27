package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        //arrange
        Person p = new Person("jan", "balk", 'm', 16);
        //act
        String outputName = "jan";
        //assert
        assertEquals("jan", outputName);
    }

    @Test
    void setName() {
        //arrange
        Person p = new Person("jan", "balk", 'm', 16);
        //act
        p.setName("fleur");
        String outputSetName = "fleur";
        //assert
        assertEquals("fleur", outputSetName);
    }

    @Test
    void getMiddleName() {
        //arrange
        //act
        //assert
    }

    @Test
    void getLastName() {
        //arrange
        //act
        //assert
    }

    @Test
    void setLastName() {
        //arrange
        //act
        //assert
    }

    @Test
    void getSex() {
        //arrange
        //act
        //assert
    }

    @Test
    void setSex() {
        //arrange
        //act
        //assert
    }

    @Test
    void getAge() {
        //arrange
        //act
        //assert
    }

    @Test
    void setAge() {
        //arrange
        //act
        //assert
    }

    @Test
    void getMother() {
        //arrange
        //act
        //assert
    }

    @Test
    void setMother() {
        //arrange
        //act
        //assert
    }

    @Test
    void getFather() {
        //arrange
        //act
        //assert
    }

    @Test
    void setFather() {
        //arrange
        //act
        //assert
    }

    @Test
    void getSiblings() {
        //arrange
        //act
        //assert
    }

    @Test
    void setSiblings() {
        //arrange
        //act
        //assert
    }

    @Test
    void getChildren() {
        //arrange
        //act
        //assert
    }

    @Test
    void setChildren() {
        //arrange
        //act
        //assert
    }

    @Test
    void getPets() {
        //arrange
        //act
        //assert
    }

    @Test
    void setPets() {
        //arrange
        //act
        //assert
    }

    @Test
    void addParents() {
        //arrange
        //act
        //assert
    }

    @Test
    void addChildToChildren() {
        //arrange
        //act
        //assert
    }

    @Test
    void addPet() {
        //arrange
        //act
        //assert
    }
}