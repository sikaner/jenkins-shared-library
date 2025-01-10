// vars/modelDeploy.groovy
def call(String environment) {
    sh """
        python3 src/deploy.py ${environment}
    """
}
