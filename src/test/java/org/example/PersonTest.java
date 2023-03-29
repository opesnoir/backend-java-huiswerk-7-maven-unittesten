package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        //assert
        assertEquals("fleur", p.getName());
    }

    @Test
    void getMiddleName() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        String outputGetMiddleName = p.getMiddleName();
        //assert
        assertEquals("peter", outputGetMiddleName);
    }

    @Test
    void getLastName() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        String outputLastName = p.getLastName();
        //assert
        assertEquals("balk", outputLastName);
    }

    @Test
    void setLastName() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        p.setLastName("regen");
        //assert
        assertEquals("regen", p.getLastName());
    }

    @Test
    void getSex() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        char outcomeGetSex = p.getSex();
        //assert
        assertEquals('m', outcomeGetSex);
    }

    @Test
    void setSex() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        p.setSex('f');
        //assert
        assertEquals('f', p.getSex());
    }

    @Test
    void getAge() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        /*int outcomeGetAge = p.getAge();*/
        //assert
        assertEquals(16, p.getAge());
    }

    @Test
    void setAge() {
        Person p = new Person("jan", "peter","balk", 'm', 16);
        //act
        p.setAge(21);
        //assert
        assertEquals(21, p.getAge());
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

    @Test
    void testAddParents() {
        //arrange
        Person p = new Person("jan", "peter","balk", 'm', 16);
        Person father = new Person("piet", "peter","balk", 'm', 16);
        Person mother = new Person("els", "peter","balk", 'm', 16);
        Person child = new Person("jan", "peter","balk", 'm', 16);
        //act
        child.addParents(child, father, mother);
        //assert
        assertEquals("els", child.getMother().getName());
    }
}