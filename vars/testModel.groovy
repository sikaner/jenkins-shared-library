// vars/testModel.groovy
def call(String modelAlias) {
    sh """
        source ${env.WORKSPACE}/mldenv/bin/activate
        python src/test.py ${modelAlias}
    """
}
