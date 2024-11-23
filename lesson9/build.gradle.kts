plugins {
//    java он ненужен
    id("org.springframework.boot") version "2.7.18" // позволяет запустить
    kotlin("jvm")
    kotlin("plugin.spring") version "1.9.23" // открывает классы, которые по умолчанию final
    id("com.bmuschko.docker-spring-boot-application") version "9.4.0" // для запаковки в docker
}


repositories {
    mavenCentral() // иначе зависимости не скачаются
}

dependencies {
    implementation(platform("org.springframework.cloud:spring-cloud-dependencies:2021.0.9")) // словарики версий
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.18")) // для того, чтобы не указывать в остальных строчках версии
    implementation("org.springframework.boot:spring-boot-starter-web") // говорит, что мы делаем приложение
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin") // серелизатор/деселизатор


    testImplementation("org.springframework.boot:spring-boot-starter-test") // чтобы поднимать в тестах контекст спринга, чтобы понять, что он поднимается
}
