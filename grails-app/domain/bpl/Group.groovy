package bpl

class Group {

    Integer id
    String name

    Date dateCreated
    Date lastUpdated


    static hasMany = [team: Team]


    static constraints = {
        name(blank: false, nullable: false, unique: true)
    }

    static mapping = {
        version(false)
    }
}
