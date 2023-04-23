@Library('test-library') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    def checkoutTool = new io.second.checkoutTools()
                    def url = 'https://github.com/ek-deus/jenkins--learn-example-pipeline.git'
                    def branch = 'main'
                    checkoutTool.checkOutFrom(url, branch)
                }
                sh "ls -lha"
            }
        }
    }
}