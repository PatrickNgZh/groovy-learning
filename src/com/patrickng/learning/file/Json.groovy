package com.patrickng.learning.file

import com.patrickng.learning.object.Person
import groovy.json.JsonOutput

/**
 * @author patrickng* @date 25/6/2020 5:25 PM
 */
def list = [new Person(name: "Patrick", age: 24),
            new Person(name: "John", age: 25)]
def json = JsonOutput.toJson(list)
println JsonOutput.prettyPrint(json)