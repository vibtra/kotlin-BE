package no.boapi.test.repositories

import no.boapi.test.models.PersonUser
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<PersonUser, Int> {

    fun findByUserId(userID: Int): PersonUser?{
        var userList = findAll()
        for(user in userList){
            if(user.userId == userID){
                return user
            }
        }
        return null
    }


}