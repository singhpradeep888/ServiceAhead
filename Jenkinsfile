pipeline {
    agent any

    tools {
        maven "MVN"
    }

    stages {
        stage('get code') {
            steps {
                git branch:'main' ,url:'https://github.com/singhpradeep888/ServiceAhead.git'
            }
        }
        
        stage('build') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('test') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('package') {
            steps {
                sh 'mvn test'
            }
        }

        stage('verify') {
            steps {
                // cleaning step
                sh 'mvn verify'
            }
        }
        stage('deploy') {
            steps {
                sh ' java -jar/var/lib/.jenkins/workspace/ServiceAhead/target/*.jar'
            }
        }
    }
    }
