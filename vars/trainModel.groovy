def call() {
    sh '''#!/bin/bash
        . ${WORKSPACE}/mldenv/bin/activate
        python src/train.py
    '''
}