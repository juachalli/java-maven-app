def gv

pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo "building the application... from Jenkinsfile"
                    gv.buildApp()
                }
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    echo "testing the application... from Jenkinsfile"
                    gv.testApp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    echo "deploying the application... from Jenkinsfile"
                    gv.deployApp()
                }
            }
        }
    }   
}