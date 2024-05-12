def call(String Project, String ImageTag, String DockerHubUser){
  sh "docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
}
