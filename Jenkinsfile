pipeline {
    agent any
    stages {
    	stage ('Compile Stage') {
        	steps {
            	sh 'mvn clean compile'
                
            }
        }
        stage ('Unit test') {
        	steps{
            	sh "mvn test -Dtest=AllUnitTests"
            }
        }
		stage ('Deployment Stage') {
        	steps {
            	sh 'mvn deploy'
            }
        }
	}
}
