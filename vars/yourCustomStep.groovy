// When a shared library is referred from the Jenkins job,
// Jenkins, by default, will invoke the call() function within
// our Groovy file. Consider the call() function like the main()
// method in Java. We can also specify parameters for the call()
// function if we want to.  the name is the parameter. Default
// value ‘User’ will be assigned to the name in case the parameter
// is not passed by Jenkinsfile.
def call(String name = 'User') {
    echo "This is your custom step fuction, ${name}."
}