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


syntax use in jnekins to declare lib 
@Library("my-shared-library") _    (_ all files)
