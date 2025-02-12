pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Commandes pour le build ici, ex : mvn clean install
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Commandes pour exécuter des tests ici
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying to Kubernetes...'
                // Commandes pour déployer ici, ex : kubectl apply -f kubernetes/
            }
        }
    }
}
