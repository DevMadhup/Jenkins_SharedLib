def call(){
  dependencyCheck additionalArguments: '--scan ./ --format HTML', odcInstallation: 'DC'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
