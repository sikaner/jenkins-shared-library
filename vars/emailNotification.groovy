// vars/emailNotification.groovy
def call(String status, String environment) {
    emailext (
        subject: "Pipeline Status: ${status} for ${environment}",
        body: "The pipeline for ${environment} environment has ${status}.",
        to: 'hamza.awan@systemsltd.com'
    )
}