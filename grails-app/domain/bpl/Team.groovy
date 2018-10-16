package bpl

class Team {

    Integer id
    String teamName
    String ownerName
    String contact
    String email
    Group group

    Date dateCreated
    Date lastUpdated


    static constraints = {
        teamName(blank: false, nullable: false, unique: true)
        ownerName(blank: false, nullable: false)
        contact(blank: false, nullable: false)
        email(email: true, nullable: false, blank: false)
        group(nullable: true)

    }

    static mapping = {
        version(false)
    }
}
