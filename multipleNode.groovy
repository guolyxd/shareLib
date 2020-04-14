pipeline{
    agent none
    stages{
        stage('backend'){
            agent{
                docker{image 'maven:3-alpine'}
            }
            steps{
                sh 'mvn --v'
            }
        }
        stage('frontend'){
            agent{
                docker{image 'node:7-alpine'}
            }
            steps{
                sh 'node -v'
            }
        }
    }
}
