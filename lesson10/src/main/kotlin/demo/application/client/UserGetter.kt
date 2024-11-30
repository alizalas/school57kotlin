package demo.application.client

import demo.application.dto.User


//fun main() {
//    Logic(Bar())
//}
//
//class Logic(
//        val userGetter: UserGetter,
//){
//    fun tim(){
//        userGetter.getUserById("123")
//    }
//}
//

interface UserGetter {
    fun getUserById(userId: String): User
}
//
//
//class Foo: UserGetter{
//    override fun getUserById(userId: String): User {
//        return User()
//    }
//}
//
//class Bar: UserGetter{
//    override fun getUserById(userId: String): User {
//        return User()
//    }
//}