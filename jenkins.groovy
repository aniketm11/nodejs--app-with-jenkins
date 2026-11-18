
pipeline {
    agent any

    stages {

        stage('Pull') {
            steps {
               git branch: 'main', url: 'https://github.com/aniketm11/nodejs--app-with-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}