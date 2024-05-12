def call(String SonarQubeAPI){
  withSonarQubeEnv("Sonar"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=NodeTodoApp -Dsonar.projectKey=NodeTodoApp -X"
  }
}
