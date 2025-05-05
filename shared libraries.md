folder structure of shared libraries 

(root)
+- src                     # Groovy source files
|   +- org
|       +- foo
|           +- Bar.groovy  # for org.foo.Bar class
+- vars
|   +- foo.groovy          # for global 'foo' variable
|   +- foo.txt             # help for 'foo' variable
+- resources               # resource files (external libraries only)
|   +- org
|       +- foo
|           +- bar.json    # static helper data for org.foo.Bar 




shared libraries is way to store commanly reusable code ,such as scripts or function , that can be used in diff jenkins pipeline


syntax use in jenkins to declare lib 
@Library("my-shared-library") _    (_ all files)


var   // kepp your groovy files here
---hello.Groovy
---checkout.Groovy


src // use to store groovy classes and ghelper methods 

resourcec // it is use to store static files like scripts configures files , templetes 



##################################### Access Restriction ##################################### 

we can give access base on roles, team, or environment.
below  is example of role based access 

def restrictedFunction() {
    if (env.USER_ROLE != 'admin') {
        error "You do not have access to run this function."
    } else {
        echo "Running the restricted function"
        // Logic for the restricted function
    }
}
