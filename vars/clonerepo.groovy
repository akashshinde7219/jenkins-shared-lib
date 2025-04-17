def call(String giturl, String branch){
    echo "Checking out branch: ${branch}"

    chechout([
        $class :'GitSCM',
        branches: [[name:branch]],
        userRemoteConfigs:[[url:giturl]]
    ])



}