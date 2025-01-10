// vars/modelTest.groovy
def call(String environment) {
    sh """
        python3 src/test.py ${environment}
    """
}
