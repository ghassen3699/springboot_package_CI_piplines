pipeline {
    agent any
    // environment{
    //     docker-credential = credentials('7b2024bb-9e9f-4d71-93c3-1880a1bd3091')
    // }
    stages{

        // build the project 
        stage("build Jar"){
            steps{
                script{
                    echo "building the project ...."
                    sh 'chmod +x mvnw'
                    sh './mvnw clean package -Dmaven.test.skip=true'
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
                    echo "deploying the project ...." 
                    
                }
            }
        }
    }
}