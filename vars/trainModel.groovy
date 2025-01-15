// vars/trainModel.groovy
def call() {
    sh """
        source ${env.WORKSPACE}/mldenv/bin/activate
        python src/train.py
    """
}
