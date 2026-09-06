pipeline{
  agent any
    stages{
      stage('compile'){
        steps{
          bat' javac Factorial.java TestFactorial.java'
        }
      }
       stage('Test'){
        steps{
          bat' java TestFactorial.java'
        }
      }
       stage('Run'){
        steps{
          bat' java Factorial'
        }
      }
       stage('Package JAR'){
        steps{
          bat' jar cfm factorial.jar manifest.txt Factorial.class'
        }
      }
       stage('Archive JAR'){
        steps{
          bat' archiveArtifacts artifacts: factorial.jar '
        }
      }
    }
  post{
    success{
      echo'build successfully'
    }
    failure{
      echo'build failed'
    }
  }
}
