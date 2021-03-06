/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package minecraft_java;

import org.junit.jupiter.api.Test;

import minecraft_java.world.World;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.joml.Vector3f;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class AppTest{

    World w;

    @BeforeEach
    void init(){
        w = new World(16);
    }

    @AfterEach
    void restore(){
        w = null;
    }

   @Test
   void TestWorldToLocal(){
       Vector3f wPos = new Vector3f(0, 0, -32);
       for (int i = 0; i < 64; i++) {
           System.out.println((int)wPos.add(0,0,1).z + " : " + w.worldToLocal(wPos).z);
       }
       //assertEquals(new Vector3i(), w.worldToLocal(wPos));
   } 

    
    

}

