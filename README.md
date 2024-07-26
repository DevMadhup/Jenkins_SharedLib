# Jenkins Shared Library
- Shared libraries in Jenkins Pipelines are reusable pieces of code that can be organized into functions and classes.
- These libraries allow you to encapsulate common logic, making it easier to maintain and share across multiple pipelines and projects.

#
## How to create and use shared library in Jenkins.

### How to create Shared library
- Login to your Jenkins dashboard. <a href="">Jenkins Installation</a>
- Go to **Manage Jenkins** --> **System** and search for **Global Trusted Pipeline Libraries**.

  **Name:** Shared <br>
  **Default version:** \<branch name><br>
  **Project repository:** https://github.com/DevMadhup/Jenkins_SharedLib.git <br>
****

#
### How to use it in Jenkins pipeline
- Go to your declarative pipeline
- Add **@Library('Shared') _** at the very first line of your jenkins pipeline.

**Note:** @Library() _ is the syntax to use shared library.
