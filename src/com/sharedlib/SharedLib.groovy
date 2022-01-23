package com.sharedlib

class SharedLib implements Serializable {

    def script

    SharedLib(script) {
        this.script = script
    }

    def buildImage(String image, String repo) {
        script.withCredentials([script.usernamePassword(credentialsId: 'nexus-user-creds', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
            script.sh "docker build -t $image ."
            script.sh "echo $script.PWD | docker login -u $script.USER --password-stdin $repo"
            script.sh "docker push $image"
        }
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