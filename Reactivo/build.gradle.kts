plugins {
    id("java")
}

group = "com.reactivo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")


    // Project Reactor
    implementation("io.projectreactor:reactor-core:3.6.10")

    //R2DBC
    implementation("io.r2dbc:r2dbc-h2:1.0.0.RELEASE")
    implementation ("io.r2dbc:r2dbc-spi:0.9.1.RELEASE")
    //R2DBC pool de conexiones
    implementation("io.r2dbc:r2dbc-pool:0.8.5.RELEASE")

    //Logger SLF4J
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("org.slf4j:slf4j-simple:1.7.32")

    // Lombok
    implementation("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")


    //Mockito
    testImplementation("org.mockito:mockito-core:3.12.4")

}

tasks.test {
    useJUnitPlatform()
}