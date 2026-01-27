def call(){
  timeout(time: 5, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
