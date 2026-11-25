def call(){
  timeout(time: 10, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
