#!/usr/bin/env groovy

def call(String environment) {
    sh """
        # Activate virtual environment
        source \${WORKSPACE}/mldenv/bin/activate
        
        # Run test script
        python3 src/test.py ${environment}
        
        # Deactivate virtual environment
        deactivate
    """
}
