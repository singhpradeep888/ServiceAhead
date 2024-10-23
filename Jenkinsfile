pipeline {
    agent any

    environment {
        // Define environment variables if needed
        MAVEN_HOME = '/usr/share/maven' // Adjust this path as per your system
        JAVA_HOME = '/usr/lib/jvm/java-11-openjdk' // Adjust Java version as needed
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from version control (e.g., Git)
                git branch: 'main', url: 'https://github.com/singhpradeep888/ServiceAhead.git'
            }
        }

        stage('Build') {
            steps {
                // Build the Maven project
                script {
                    sh "${MAVEN_HOME}/bin/mvn clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                // Run tests with Maven
                script {
                    sh "${MAVEN_HOME}/bin/mvn test"
                }
            }
        }

        stage('Package') {
            steps {
                // Package the project (e.g., into a JAR or WAR file)
                script {
                    sh "${MAVEN_HOME}/bin/mvn package"
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deploy step (e.g., upload artifacts to a server or repository)
                echo 'Deploying the application...'
                // Use commands like scp or upload to a Nexus/Artifactory repository
            }
        }
    }

    post {
        always {
            // Clean up workspace
            cleanWs()
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
