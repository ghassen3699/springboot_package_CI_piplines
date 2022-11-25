pipeline {
    agent any
    tools{
        maven 'Maven'
    }

    stages {
        stage("init"){
            steps{
                script{
                    echo "initialisation of project"
                }
            }
            
        }

        stage("build"){
            steps{
                script{
                    echo "build the project"
                    sh "chmod +x mvnw"
                    sh './mvnw clean package -Dmaven.test.skip=true'
                }
            }
        }

        stage("build image"){
            steps{
                script{
                    echo "build project image"
                    withCredentials([usernamePassword(credentialId: 'docker-cred', passwordVariables: 'PASS', usernameVariable: 'USER')]){
                        sh 'docker build -t ghassenkhamassi/my-app:1.2 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push ghassenkhamassi/my-app:1.2'
                    }

                }
            }
        }

        stage("test"){
            steps{
                script{
                    echo "test the project"
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "deploy the project"
                }
            }
        }
    }
}