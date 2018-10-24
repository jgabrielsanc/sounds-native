pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo $PATH
echo %http.proxyHost%'''
        sh './gradlew clean build'
      }
    }
  }
}