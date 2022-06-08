pipeline {
  agent any
  stages {
    stage('test') {
      environment {
        var1 = 'bonjour'
      }
      steps {
        echo 'phase de test'
        sh 'mvn clean test'
      }
    }

    stage('reports') {
      steps {
        junit 'target/surefire-reports/*.xml'
      }
    }

    stage('end') {
      steps {
        sh 'echo "Fin des tâches, ça s\'est bien passé"'
      }
    }

  }
}