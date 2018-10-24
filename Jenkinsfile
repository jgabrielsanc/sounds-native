pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo ${BUILD_ID}
echo ${test}'''
        sh './gradlew clean build'
      }
    }
  }
}