pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo $PATH'
        sh './gradlew clean build'
      }
    }
  }
}