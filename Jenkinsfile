library identifier: 'mylibraryname@master',
        // 'mylibraryname' is just an identifier, it can be anything you like
        // 'master' refers to a valid git ref (branch)
        retriever: modernSCM([
                $class: 'GitSCMSource',
                //      credentialsId: 'your-sj-id', // remove this if it's public!
                remote: 'https://github.com/sjc1014/RemoteConfiguredSharedLibrary'
        ])

pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello world'
                yourCustomStep 'your_arg'
            }
        }
    }
}

