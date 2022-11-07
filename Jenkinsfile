pipeline {
  agent any
  environment {
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials('server-credentials-id')
  }
  
  stages {
    
    stage("build"){
      steps {
        echo 'build the application'
        echo "build version ${NEW_VERSION}"
      }
    }
    
    stage("test"){
      steps {
        echo 'test the application'
      }
    }
    
    stage("deploy"){
      steps {
        echo 'deploy the application'
        echo "deploy application with credentials ${SERVER_CREDENTIALS}"
        sh "${SERVER_CREDENTIALS}"
      }
    }
    
  }
}
