def gv


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
    
    tage("init"){
      steps {
        script{
          gv = load "script.groovy"
        }
      }
    }

    stage("build"){
      steps {
        script{
          gv.buildApplication()
        }
      }
    }
    
    stage("test"){
      when {
        expression{
          params.executeTests == true
        }
      }
      steps {
        script{
          gv.testApplication()
        }
      }
    }
    
    stage("deploy"){

      input{
        message "Select the environment to deploy to"
        ok "Done"
        parameters{
          choice(name:'ENV', choices:['Dev', 'test', 'prod'], description:'choice of environments')
        }
      }
      steps {
        script{
          gv.testApplication()
          echo "deployment to ${ENV}"
        }        
      }
    }
    
  }
}
