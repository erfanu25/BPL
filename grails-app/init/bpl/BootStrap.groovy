package bpl

class BootStrap {

    def init = { servletContext ->
        new Admin(id: "1",email: "erfan@bitmascot.com", password: "1234", name: "Erfan").save()

        new Team(id: "1", ownerName: "xmpl", teamName: "demo", email: "fdf@gfg.com", contact: "04354545" ).save()
        new Team(id: "2", ownerName: "xmpl", teamName: "demogh", email: "fdf@gfg.com", contact: "04354545" ).save()
        new Team(id: "3", ownerName: "xmpl", teamName: "demogh", email: "fdf@gfg.com", contact: "04354545" ).save()
        new Team(id: "4", ownerName: "xmpl", teamName: "demohg", email: "fdf@gfg.com", contact: "04354545" ).save()
        new Team(id: "5", ownerName: "xmpl", teamName: "demohdvc", email: "fdf@gfg.com", contact: "04354545" ).save()
        new Team(id: "6", ownerName: "xmpl", teamName: "demohhgh", email: "fdf@gfg.com", contact: "04354545" ).save()

        new Group(id: "1", name: "A").save()
        new Group(id: "2", name: "B").save()
        new Group(id: "3", name: "C").save()
    }
    def destroy = {
    }
}
