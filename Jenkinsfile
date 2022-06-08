pipeline {
  agent any
  stages {
    stage('test') {
      environment {
        var1 = 'bonjour'
      }
      steps {
        sh 'mvn clean test'
        junit 'target/surefire-reports/*.xml'
      }
    }

    stage('build') {
      steps {
        git(url: 'https://github.com/kliakos/sparkjava-war-example.git', branch: 'main')
        sh 'mvn clean install'
      }
    }

    stage('end') {
      steps {
        sh 'echo "Fin des tâches, ça s\'est bien passé"'
      }
    }

  }
}