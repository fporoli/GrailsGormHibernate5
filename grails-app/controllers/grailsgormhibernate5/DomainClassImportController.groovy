package grailsgormhibernate5

import grailsgormhibernate5plugin.PluginDomain
import grails.converters.JSON

class DomainClassImportController {

    def index() { }

    def totalCount() {
        def res = [
            instanceTotal: PluginDomain.count()
        ]
        render res as JSON
    }

}
