def call() {
    stage('Compile') {
        steps {
            sh "mvn clean compile"
        }
    }
}
