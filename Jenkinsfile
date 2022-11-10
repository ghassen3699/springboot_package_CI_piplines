def gv
pipeline {
    agent any
    // environment{
    //     docker-credential = credentials('7b2024bb-9e9f-4d71-93c3-1880a1bd3091')
    // }

    stages{

        // init the groovy file 
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        // build the project 
        stage("build Jar"){
            steps{
                script{
                    gv.buildProject()
                }
            }
        }

        // // build the image 
        // stage("build Jar"){
        //     steps{
        //         script{
        //             echo "building the docker image ...."
        //             withCredentials([usernamePassword(credentialsID: '7b2024bb-9e9f-4d71-93c3-1880a1bd3091', passwordVariable: 'PASS', usernameVariable: 'USERNAME')]){
        //                 sh 'docker build -tag imageName'
        //                 sh "docker login -u $USERNAME --password-stdin"
        //                 sh 'docker push imageName'
        //             }
        //         }
        //     }
        // }

        // deploy the project 
        stage("deploy"){
            steps{
                script{
                    gv.deployProject()
                    
                }
            }
        }
    }
}