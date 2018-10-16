package bpl

import grails.transaction.Transactional

@Transactional
class GlobalConfigService {

    TeamService teamService

    public static boolean isBuilding = false;
    public static boolean isGeneratingSchema = false;

    def itemsPerPage() {
        return 5
    }

    public static String getUID(){
        return UUID.randomUUID().toString().toUpperCase();
    }
}
