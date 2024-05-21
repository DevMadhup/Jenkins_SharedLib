// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser, String Path){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} -f $Path/Dockerfile ."
}
