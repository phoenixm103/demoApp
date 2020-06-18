pipeline{

    agent any
    stage('Checkout'){
         checkout scm
    }
    stage('Compile Stage'){
        steps {
            sh 'mvn clean compile'        
        }
    }
    stage ('Testing Stage') {
        steps {
            sh 'mvn test'
        }
    }
    stage("Image Prune"){
        #imagePrune(CONTAINER_NAME)
    }
    stage('Image Build'){
        #imageBuild(CONTAINER_NAME,CONTAINER_TAG)
    }
    stage('Push to Docker Registry'){
        #pushToImage(CONTAINER_NAME,CONTAINER_TAG,DOCKER_HUB_USER,DOCKER_HUB_PASSWORD )
        
    }
}

