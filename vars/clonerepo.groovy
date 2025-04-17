def chechout(String giturl, String branch='master'){
    echo "Checking out branch: ${branch}"

    chechout([
        $class :'GitSCM',
        branches: [[name:branch]],
        userRemoteConfigs:[[url:giturl]]
    ])



}