pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '/root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        echo 'Jenkins test'
      }
    }
  }
}