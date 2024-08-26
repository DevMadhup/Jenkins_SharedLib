def call(){
  sh "trivy fs . > trivy.txt"
}
