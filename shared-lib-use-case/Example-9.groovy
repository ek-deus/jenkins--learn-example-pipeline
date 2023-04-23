pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    echo 'script..'
                    def libLoop = load 'utils/loop.groovy'
                    libLoop.getInfoGit('https://github.com/ek-deus/jenkins--learn-example-pipeline.git')
                    libLoop.loopMethod()

                    libLoop.getInfoGitBranch('https://github.com/ek-deus/jenkins--learn-example-pipeline.git')
                }
            }
        }
    }
}
