pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''echo ${http}
echo ${port}'''
        sh './gradlew -Dhttp.proxyHost=${http}  -Dhttp.proxyPort=${port} -Dhttps.proxyHost=${http} -Dhttps.proxyPort=${port} clean build'
      }
    }
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'Test succes'
          }
        }
        stage('') {
          steps {
            echo 'Succes 2'
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        echo 'Succes'
      }
    }
  }
}