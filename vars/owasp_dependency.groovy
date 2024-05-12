def call(){
  dependencyCheck additionalArguments: '--scan ./ --format HTML', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
