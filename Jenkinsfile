pipeline{

    agent any
    
    stages{
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
	      
	    }
	    stage('Image Build'){
	      
	    }
	    stage('Push to Docker Registry'){
	        
	    }
    }
}

