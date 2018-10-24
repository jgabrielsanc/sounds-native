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
  }
}