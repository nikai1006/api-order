node {
    stage('Build') {
        echo 'Building....'
        sh 'mvn clean package'
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
    }
    stage('Test') {
        echo 'Testing....'
     /* `make check` returns non-zero on test failures,
              * using `true` to allow the Pipeline to continue nonetheless
              */
        sh 'make check || true'
        junit '**/target/*.xml'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}