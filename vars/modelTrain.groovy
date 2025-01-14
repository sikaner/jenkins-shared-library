#!/usr/bin/env groovy

def call() {
    sh """
        # Activate virtual environment
        source \${WORKSPACE}/mldenv/bin/activate
        
        # Install requirements and run training
        pip install -r requirements.txt
        python3 src/train.py
        
        # Deactivate virtual environment
        deactivate
    """
}
