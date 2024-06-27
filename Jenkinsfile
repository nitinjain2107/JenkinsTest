pipeline {
    agent any
    tools{ maven 'MVN_HOME'}

    stages {
        stage('Build') {
            agent any
            steps {
                echo 'Building code....'
               
            }
        }
        stage('checkout'){
            agent any
            steps{
                 echo 'Checking out source code...'
                 git credentialsId: 'key', url: 'https://github.com/nitinjain2107/JenkinsTest.git'
                 stash 'source'
        }
        }
        stage('Test'){
            parallel {
                stage('Smoke Tests') {
                    agent any
                    steps {
                        echo 'Running smoke tests...'
                        bat 'mvn test -Dsurefire.suiteXmlFiles=smoke-test.xml'
                    }
                    
                }
                stage('Regression Tests') {
                    agent { label 'node1' }
                    steps {
                        echo 'Running regression tests...'
                        unstash 'source'
                        bat 'mvn test -Dsurefire.suiteXmlFiles=regression-test.xml'
                    }
                  
                }
            }
            
        }
        
    }
}

