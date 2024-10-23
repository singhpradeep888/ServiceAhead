pipeline {
    agent any

    tools {
        maven "MVN"
    }

    stages {
        stage('get code') {
            steps {
                git 'https://github.com/singhpradeep888/ServiceAhead.git'
            }
        }
        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('validate') {
            steps {
                sh 'mvn validate'
            }
        }
        stage('compile') {
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
        stage('pre-intrigation test') {
            steps {
                sh 'mvn pre-integration-test'
            }
        }
        stage('intrigation test') {
            steps {
                sh 'mvn integration-test'
            }
        }
        stage('post-intrigation test') {
            steps {
                sh 'mvn post-integration-test'
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
