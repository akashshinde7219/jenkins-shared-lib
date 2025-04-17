def call(String env) {
    echo "Starting deployment for environment: ${env}"

    def utils = new example.Utils()
    def version = utils.getVersion()

    echo "Deploying version ${version} to ${env}"

    if (env == 'production') {
        echo "Running production checks..."
        // Add your production-specific logic here
    }

    // Simulate deployment
    echo "Deployment to ${env} completed."
}
