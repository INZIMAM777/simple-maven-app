pipeline {
    agent any
    
    stages {
        stage('Version 1: Manual Approval') {
            steps {
                // Task 1: Checkout
                checkout scm
                // Task 2: Input step
                input message: 'Proceed with Build?', ok: 'Yes, Proceed'
                // Task 3: Confirmation
                echo "Build approved by user. Proceeding..."
            }
        }

        stage('Version 2: Input Parameter') {
            steps {
                // Task 2: Accept parameter during execution (not at start)
                script {
                    def userInput = input(
                        id: 'userInput', message: 'Enter Approval Note:', parameters: [
                            string(defaultValue: 'Approved', name: 'CONFIRM_NOTE')
                        ]
                    )
                    // Task 3: Execute BAT command
                    bat "echo Approval Note: ${userInput}"
                }
            }
        }

        stage('Version 3: System Info') {
            steps {
                // Task 2: Print Build Number
                echo "Current Jenkins Build Number: ${env.BUILD_NUMBER}"
                // Task 3: Status Message
                echo "Version 3 Status: Execution Successful"
            }
        }

        stage('Version 4: Save to File') {
            steps {
                script {
                    // Task 2: Accept text parameter
                    def finalParam = input(
                        id: 'finalText', message: 'Enter text to save:', parameters: [
                            string(name: 'DATA')
                        ]
                    )
                    // Task 3: Save to file using BAT
                    bat "echo ${finalParam} > experiment4_output.txt"
                    bat "type experiment4_output.txt"
                }
            }
        }
    }
}
