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
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('package') {
            steps {
                sh 'mvn clean'
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
