def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Choice a version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Execute tests?')
    }
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