pipeline {
  agent any
  
  environment {
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials('server-credentials-id')
  }
  
  parameters {
    choice(name:'VERSION', choices:['1.1.0', '1.1.1', '1.1.2'], description:'choice of version')
    booleanParam(name:'executeTests', defaultValue:true, description:'the execution of tests')
  }
  
  
  stages {
    
    stage("build"){
      steps {
        echo 'build the application'
        echo "build version ${NEW_VERSION}"
      }
    }
    
    stage("test"){
      when {
        expression{
          params.executeTests == true
        }
      }
      steps {
        echo 'test the application'
      }
    }
    
    stage("deploy"){
      steps {
        echo "Deploying version ${params.VERSION}"
        echo 'deploy the application'
      }
    }
    
  }
}
