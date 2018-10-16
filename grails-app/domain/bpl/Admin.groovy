package bpl

class Admin {

    Integer id
    String name
    String email
    String password

    Date dateCreated
    Date lastUpdated


    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
    }

    static mapping = {
        version(false)
    }

    def beforeInsert = {
        this.password = this.password.encodeAsMD5()
    }


    def beforeUpdate = {
        this.password = this.password.encodeAsMD5()
    }


}
