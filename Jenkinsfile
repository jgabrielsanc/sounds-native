pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'echo $PATH'
        sh 'gradle clean build'
      }
    }
  }
}