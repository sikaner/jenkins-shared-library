// vars/modelTrain.groovy
def call() {
    sh """
        python3 -m pip install -r requirements.txt
        python3 src/train.py
    """
}
