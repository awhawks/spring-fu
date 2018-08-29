import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
	id("org.springframework.boot")
}

dependencies {
	api("org.springframework.boot:spring-boot-starter")

	api(project(":modules:webflux-jackson"))
	api(project(":modules:mongodb"))
	api(project(":modules:mongodb-embedded"))
	api(project(":modules:webflux"))
	api(project(":modules:webflux-mustache"))
	implementation("io.projectreactor.netty:reactor-netty")

	testImplementation("org.junit.jupiter:junit-jupiter-api")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
	testImplementation("org.springframework:spring-test")
	testImplementation("io.projectreactor:reactor-test")
}
