def call(){
  dependencyCheck additionalArguments: '--scan ./ --noupdate', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
