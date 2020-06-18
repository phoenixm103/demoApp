def CONTAINER_NAME="demoapp3"
def CONTAINER_TAG="latest"
def DOCKER_HUB_USER="moin103"      // Change with you'r DockerHub username.
def DOCKER_HUB_PASSWORD="Samiolol0987#"
def HTTP_PORT="6090"                // This is related to application port

pipeline {
    agent any
    stages {
    	stage('Checkout') {
        	steps {
        		checkout scm
    		}
    	}
    	stage ('Compile Stage') {
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
        	steps {
        		imagePrune(CONTAINER_NAME)
    		}
    	}
    	stage('Image Build'){
        	steps {
        		imageBuild(CONTAINER_NAME, CONTAINER_TAG)
    		}
		}
    	stage('Push to Docker Registry'){
        	steps {
            	pushToImage(CONTAINER_NAME, CONTAINER_TAG, DOCKER_HUB_USER, DOCKER_HUB_PASSWORD)
        	}
        }
    }
}
def imagePrune(containerName){
    try {
        sh "docker image prune -f"
        sh "docker stop $containerName"
    } catch(error){}
}

def imageBuild(containerName, tag){
    sh "docker build -t $containerName:$tag  -t $containerName --pull --no-cache ."
    echo "Image build complete"
}

def pushToImage(containerName, tag, dockerUser, dockerPassword){
    sh "docker login -u $dockerUser -p $dockerPassword"
    sh "docker tag $containerName:$tag $dockerUser/$containerName:$tag"
    sh "docker push $dockerUser/$containerName:$tag"
    echo "Image push complete"
}
