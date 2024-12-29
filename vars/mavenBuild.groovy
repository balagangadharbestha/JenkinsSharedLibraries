// vars/mavenBuild.groovy

def call(String goals = 'clean install') {
    echo "Running Maven with goals: ${goals}"
    sh "mvn ${goals}"
}
