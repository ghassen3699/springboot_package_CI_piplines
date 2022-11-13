// build the project
def buildProject (){
    echo "Building the project ...."
    sh "chmod +x mvnw"
    sh './mvnw clean package -Dmaven.test.skip=true'
}


// deploy the project 
def deployProject(){
    echo "deploying the project ...."
}

return this