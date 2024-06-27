pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Clean and compile the project
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }
        stage('Parallel Test Execution') {
            parallel {
                stage('Smoke Tests') {
                    steps {
                        script {
                            if (isUnix()) {
                                sh 'mvn test -Dsurefire.suiteXmlFiles=smoke-testng.xml'
                            } else {
                                bat 'mvn test -Dsurefire.suiteXmlFiles=smoke-testng.xml'
                            }
                        }
                    }
                }
                stage('Regression Tests') {
                    steps {
                        script {
                            if (isUnix()) {
                                sh 'mvn test -Dsurefire.suiteXmlFiles=regression-testng.xml'
                            } else {
                                bat 'mvn test -Dsurefire.suiteXmlFiles=regression-testng.xml'
                            }
                        }
                    }
                }
            }
        }
    }

}
