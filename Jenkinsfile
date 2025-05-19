pipeline {
    agent any
    parameters {
        string (
            name: 'BRANCH',
            defaultValue: 'main',
            description: 'Enter the branch to test')
        string (
            name: 'FEATURE_NAME',
            defaultValue: 'calculator.feature',
            description: """The features available are: 
            calculator.feature
            """)
  
        string (
            name: 'REPO_URL',
            defaultValue: 'https://github.com/thevictor0102/pruebas.git',
            description: 'Enter the repository to Test'
        )
    }
    
    stages{
        stage ('Clonar Repositorio') {
            steps {
                echo "Branch to test: ${params.BRANCH}"
                git branch: "${params.BRANCH}", url: "${params.REPO_URL}"
            }
        }
        stage('Mostrar contenido .feature') {
            steps {
                echo 'Contenido del archivo feature:'
                bat 'type "src\\test\\resources\\cucumber\\calculator.feature"'
            }
        }
        stage ('Lanzar Test') {
            steps {
                echo "TEST"
                bat """mvn clean test -D cucumber.features="src/test/resources/cucumber/${FEATURE_NAME}" """
                echo "TEST-END"
            }
        }
        stage ('Zip de Informe') {
            steps {
                echo "ZIP"
                powershell 'Compress-Archive target/cucumber-reports test.zip -Update'
                echo "ZIP-END"
            }
        }
        stage('Publicar zip') {
            steps {
                archiveArtifacts artifacts: 'test.zip', 
                fingerprint: true,
                allowEmptyArchive: true
            }
        }
    }
}
