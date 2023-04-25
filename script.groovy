def buildApp(){
    echo "Building the application..."
}

def testApp(){
    echo 'testing the applications...'
}

def deployApp(){
    echo 'deploying the applications...'
    echo "deploying version ${params.VERSION}"
}

return this  //important to import to jenkins file
