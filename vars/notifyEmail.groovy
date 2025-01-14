// vars/notifyEmail.groovy
def call(String status) {
    emailext (
        subject: "Pipeline Status: ${status}",
        body: "The pipeline completed with status: ${status}",
        recipientProviders: [[$class: 'DevelopersRecipientProvider']],
        to: env.EMAIL_RECIPIENTS
    )
}