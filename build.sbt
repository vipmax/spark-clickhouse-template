name := "spark-clickhouse-template"

version := "0.1"

scalaVersion := "2.11.12"

// https://mvnrepository.com/artifact/org.apache.spark
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"

// 1 Caused by: com.fasterxml.jackson.databind.JsonMappingException: Incompatible Jackson version: 2.7.3
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"

// 2 Exception in thread "main" java.lang.NoSuchMethodError: net.jpountz.lz4.LZ4BlockInputStream.<init>(Ljava/io/InputStream;Z)V
libraryDependencies += "net.jpountz.lz4" % "lz4" % "1.3.0"

// must be after 1 and 2
libraryDependencies += "ru.yandex.clickhouse" % "clickhouse-jdbc" % "0.1.54"
