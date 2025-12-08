pipeline {
    agent any
    tools {
        maven 'Maven3'    // Nom du Maven installé sur Jenkins
        jdk 'Java11'      // Nom du JDK installé sur Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ton-projet.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'  // Compile et package
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'  // Exécute les tests unitaires
            }
        }
        stage('Docker Build & Push') {
            when {
                branch 'main'
            }
            steps {
                sh 'docker build -t tonrepo/ton-microservice:latest .'
                sh 'docker push tonrepo/ton-microservice:latest'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
        success {
            echo 'Build et tests réussis !'
        }
        failure {
            echo 'Build ou tests échoués !'
        }
    }
}
