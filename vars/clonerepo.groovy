def chechout(string giturl, string branch='main'){
    echo "Checking out branch: ${branch}"

    chechout([
        $class :'GitSCM',
        branches: [[name:branch]],
        userRemoteConfigs:[[url:giturl]]
    ])



}