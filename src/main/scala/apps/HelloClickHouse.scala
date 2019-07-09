package apps

import org.apache.spark.sql.SparkSession

object HelloClickHouse {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("HelloClickHouse")
      .master("local")
      .config("spark.driver.extraClassPath", "clickhouse-jdbc-0.1.54.jar")
      .config("spark.executor.extraClassPath", "clickhouse-jdbc-0.1.54.jar")
      .getOrCreate()


    val likes = spark.read
      .format("jdbc")
      .option("url", "jdbc:clickhouse://localhost:8123/")
      .option("dbtable", "default.vklikes")
      .option("user", "default")
      .option("password", "")
      .option("driver", "ru.yandex.clickhouse.ClickHouseDriver")
      .load()

    likes.show()


  }
}
