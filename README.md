# Spark_SQL_Demo

This project about Scala/Spark applications.

# How to run a Spark application on Intellij Idea with SBT on windows


1.Install latest version of JDK
2.Download pre-built version of Spark
3.Download winutils
4.Set environment variables for Java,Spark,Hadoop as per the instructions below in the below link
http://sundog-education.com/spark-scala/
5.Install Intellij Idea with scala plugin
6.Install latest version of SBT
7.Open Intellij and click on Create New Project and select Scala with SBT from the options.Click Next
and on the next window type project name,choose location of the project,select JDK and select
the same version of scala that comes with Spark installed.For me it's Scala 2.11.8 with Spark 2.2.0.
Click Finsih.
8.Once the project structure is created click on build.sbt on the left panel
9.Add the following line to import spark core libraries
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
10.Create a package "Demo" under src/main/scala.
11.Under Demo create a new Scala object file.Right click and click recompile.Once complied successfully right click and click run
12.You should get your desired output in the bottom pane.


# How to contribute



