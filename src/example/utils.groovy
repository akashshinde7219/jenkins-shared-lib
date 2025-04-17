package org.example

class Utils implements Serializable {
    def getVersion() {
        return "v1.2.${new Date().format('MMddHHmm')}"
    }
}
