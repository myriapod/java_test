pipeline {
  agent {
    node {
      label 'test'
    }

  }
  stages {
    stage('test') {
      parallel {
        stage('test') {
          environment {
            var1 = 'bonjour'
          }
          steps {
            sh 'mvn clean test'
          }
        }

        stage('build') {
          steps {
            git(url: 'https://github.com/kliakos/sparkjava-war-example.git', branch: 'master')
            sh 'mvn clean install'
            archiveArtifacts 'target/*.war'
          }
        }

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