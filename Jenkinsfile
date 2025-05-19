pipeline
{
  agent any
  stages 
  {
    stage('Test') 
    {
      steps 
      {
        sh """
        mvn clean test -D cucumber.features="src/test/resources/cucumber/Calculator.feature"
        """
      }
    }
  }
}
