pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo $PATH
echo %BUILD_NUMBER%'''
        sh './gradlew clean build'
      }
    }
  }
}