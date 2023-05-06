import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
    public void testGetAsInstance() {
    DataTest dat = new java.lang.Object() {int run() {
        try {
            Instances data = new Instances(new java.io.StringReader("\n@relation iris\n\n@attribute a1 numeric\n@attribute a2 numeric\n@attribute a3 numeric\n@attribute a4 numeric\n@attribute class {Iris-setosa,Iris-versicolor,Iris-virginica}\n\n@data\n5.1,3.5,1.4,0.2,Iris-setosa\n4.9,3,1.4,0.2,Iris-setosa\n4.7,3.2,1.3,0.2,Iris-setosa\n4.6,3.1,1.5,0.2,Iris-setosa\n5,3.6,1.4,0.2,Iris-setosa\n5.4,3.9,1.7,0.4,Iris-setosa\n4.6,3.4,1.4,0.3,Iris-setosa\n5,3.4,1.5,0.2,Iris-setosa\n4.4,2.9,1.4,0.2,Iris-setosa\n4.9,3.1,1.5,0.1,Iris-setosa\n5.4,3.7,1.5,0.2,Iris-setosa\n4.8,3.4,1.6,0.2,Iris-setosa\n4.8,3,1.4,0.1,Iris-setosa\n4.3,3,1.1,0.1,Iris-setosa\n5.8,4,1.2,0.2,Iris-setosa\n5.7,4.4,1.5,0.4,Iris-setosa\n5.4,3.9,1.3,0.4,Iris-setosa\n5.1
}