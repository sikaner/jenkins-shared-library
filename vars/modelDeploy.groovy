#!/usr/bin/env groovy

def call(String environment) {
    sh """
        # Activate virtual environment
        source \${WORKSPACE}/mldenv/bin/activate
        
        # Run deploy script with environment
        python3 src/deploy.py ${environment}
        
        # Deactivate virtual environment
        deactivate
    """
}
