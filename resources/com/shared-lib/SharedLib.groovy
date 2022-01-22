package com.shared-lib

class SharedLib implements Serializable {

    def script

    SharedLib(script) {
        this.script = script
    }

    def buildImage() {
        script.echo "building Docker image..."
    }

    def deployImage() {
        script.echo "deploying the Docker image to server instance..."
    }

    def testAndPackage() {
        script.echo "testing/packaging the application..."
        script.sh "mvn package"
    }

    def pushImage() {
        script.echo "pushing image to artifact repository..,"
    }
}