//package demo.application.configuration
//
//import demo.application.client.CrmClient
//import demo.application.client.UserGetter
//import demo.application.controller.SyntheticUserGenerator
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import java.net.http.HttpClient
//
//@Configuration
//class Configuration {
////    @Bean
//    fun createUserGetter(): UserGetter {
//        if (System.getenv("") == "") {
//            return SyntheticUserGenerator()
//        } else {
//            return CrmClient()
//        }
//    }
//}