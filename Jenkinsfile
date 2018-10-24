pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo ${BUILD_ID}
echo ${http.proxyHost}'''
        sh './gradlew clean build'
      }
    }
  }
}