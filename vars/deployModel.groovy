// vars/deployModel.groovy
def call(String modelAlias, String stage) {
    sh """
        source ${env.WORKSPACE}/mldenv/bin/activate
        python src/deploy.py ${modelAlias} ${stage}
    """
}
