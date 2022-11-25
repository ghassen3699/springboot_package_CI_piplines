pipeline {
    agent any
    // tools{
    //     maven 'Maven'
    // }

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
                    withCredentials([usernamePassword(credentialsId: 'docker_cred', passwordVariable: 'PASS', usernameVariable: 'USER')]){
                        sh 'docker build -t ghassenkhamassi/my-springboot-app:1.0 .'
                        sh 'docker logout'
                        sh "docker login -u $USER -p $PASS"
                        sh 'docker push ghassenkhamassi/my-springboot-app:1.0'
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