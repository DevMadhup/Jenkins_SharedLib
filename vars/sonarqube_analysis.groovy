def call(String SonarQubeAPI){
  withSonarQubeEnv("${SonarQubeAPI}"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=NodeTodoApp -Dsonar.projectKey=NodeTodoApp -X"
  }
}
