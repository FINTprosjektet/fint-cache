package no.fint.cache.model

import spock.lang.Specification


class CacheObjectSpec extends Specification {

    def "Create cache object"() {
        given:
        def obj = "test value"

        when:
        def cacheObject = new CacheObject(obj)
        println(cacheObject)

        then:
        cacheObject.checksum != null
        cacheObject.lastUpdated != null
        cacheObject.object == obj
    }
}
