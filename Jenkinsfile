pipeline {
    agent any
    
    parameters {
        string(name: 'USERNAME', defaultValue: 'Guest', description: 'Enter your name')
    }

    stages {
        stage('Checkout') {
            steps {
                // Task 1: Pulls latest code from GitHub
                checkout scm
            }
        }
        
        stage('Execute Commands') {
            steps {
                // Task 2: Print the parameter
                echo "The user is: ${params.USERNAME}"
                
                // Task 3: Use BAT to create file and store data
                // In Windows, '>' creates/overwrites a file
                bat "echo ${params.USERNAME} > user.txt"
                
                // Bonus: Verify by reading the file back
                bat "type user.txt"
            }
        }
    }
}
