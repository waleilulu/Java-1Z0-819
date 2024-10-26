public class Q021 {
    
}
/* 
A company has an existing Java 8 jar file, sales-app-1.1.1.jar, that uses several Apache open source jar files that have not been modularized.
commons-beanutils-1.9.3.jar
commons-collections4-4.2.jar
(Aotomactic-Module-Name: org.apache.commons.collections4)
commons-lang3-3.8.1.jar
(Aotomactic-Module-Name: org.apache.commons.lang3)
commons-text-1.3.jar
(Aotomactic-Module-Name: org.apache.commons.text)


Which module-info.java file should be used to convert sales-app-1.1.jar to a module?
A. module com.company.sales_app {
requires commons.beanutils;
requires org.apache.commons.collections4;
requires org.apache.commons.lang3;
requires org.apache.commons.text;
}
B. module com.company.sales_app {
requires org.apache.commons.beanutils;
requires org.apache.commons.collections4;
requires org.apache.commons.lang3;
requires org.apache.commons.text;
}
C. module com.company.sales_app {
requires commons.beanutils;
requires commons.collections4;
requires commons.lang3;
requires commons.text;
}
D. module com.company.sales_app {
requires commons.beanutils-1.9.3;
requires commons.collections4-4.2;
requires commons.lang3-3.8.1;
requires commons.text-1.3;
}
*/