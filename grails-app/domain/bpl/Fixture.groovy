package bpl

class Fixture {

    Integer id
    String matches
    String matchDate
    Group group

    Date dateCreated
    Date lastUpdated


    static constraints = {
        matches(nullable: false)
        matchDate(nullable: false)
    }
}
