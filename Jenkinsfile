pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo ${http.proxyHost}'
        sh './gradlew clean build'
      }
    }
  }
}