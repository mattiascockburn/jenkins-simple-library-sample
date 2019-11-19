// incorporated from https://github.com/cloudy-demos/pipeline-libraries/blob/master/vars/dockerImageTag.groovy
def call(body) {
    def tag = sh returnStdout: true,
	    script: "echo ${env.BUILD_NUMBER}-`git rev-parse HEAD` | tr -d '\n'"
    echo "The tag is: ${tag}"
    return tag
}
