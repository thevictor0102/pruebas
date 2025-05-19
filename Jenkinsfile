pipeline
{
  agent any
  stages 
  {
    stage('Calculator cucumber test') 
    {
      steps 
      {
        bat 'mvn clean test -D cucumber.features="src/test/resources/cucumber/Calculator.feature" -Dcucumber.publish.quiet=false -Dcucumber.execution.verbose=true'
      }
    }
  }
}
