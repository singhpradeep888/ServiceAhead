node {
    def mvnHome = tool 'MVN'

    stage('Clean Code') {
        sh "'${mvnHome}/bin/mvn' clean"
    }

  stage('Validate Code') {
        sh "'${mvnHome}/bin/mvn' validate"
    }
  stage('Compile Code) {
        sh "'${mvnHome}/bin/mvn' compile"
    }
  stage('Test Code') {
        sh "'${mvnHome}/bin/mvn' test"
    }
  stage('package Code') {
       sh "'${mvnHome}/bin/mvn' package"
    }

  stage('verify Code') {
        sh "'${mvnHome}/bin/mvn' verify"
    }
  stage('install Code') {
        sh "'${mvnHome}/bin/mvn' install"
    }
  stage('site') {
        sh "'${mvnHome}/bin/mvn' site"
    }

  
}
