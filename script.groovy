def buildApplication (){
    echo 'build the application'
    echo "build version ${NEW_VERSION}"
}


def testApplication (){
    echo "test the applciation ...."
}

def deployApplication (){
    echo "Deploying version ${params.VERSION}"
    echo 'deploy the application'
}

return this
