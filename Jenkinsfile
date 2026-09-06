pipeline{
  agent any
    stages{
      stage('Build'){
        steps{
          echo'build image'
          bat'docker build -t myapp'
        }
      }
      
       stage('Run'){
        steps{
          echo'run the container'
          bat' docker rm -f mycontainer || exit 0'
          bat'docker run -d -p 5000:5000 --name mycontainer myapp'
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
