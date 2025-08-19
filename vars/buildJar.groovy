#!/user/bin/env groovy

def call() {
    echo "building the application for branch $BRANCH_NAME" // Only use for multi-branch job
    echo "building the application for branch $GIT_BRANCH"  // Only use for multi-branch job
    echo "building the application ..."
    sh 'mvn package'
}
