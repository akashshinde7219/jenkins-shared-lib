// vars/checkout.groovy

def call(String gitUrl, String branch) {
    echo "Checking out branch: ${branch}"

    // Correctly call the checkout method
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: gitUrl]]
    ])
}