It is a simple REST Api using Kotlin and Docker.

# Setup
- Download kobweb
  
  https://github.com/varabyte/kobweb-cli/releases/download/v0.9.13/kobweb-0.9.13.zip
- Set `path variable` of kobweb. ie. ..kobweb/bin folder path
- Open Command prompt, set your project directory location and Run `kobweb create`
- Open IntelliJ IDE and open kobweb project from your project location
- Build project and If getting error then open `settings.gradle.kts` and change root project name to `Pascal Case` ie. DemoApi then re-build.


# Steps
- Write your code in `/api` package
- If you need serializaton plugin then checkout this repo https://github.com/Kotlin/kotlinx.serialization and put in the `libs.version.toml` file and use in your `build.gradle.kts`.
- To Run server
  1. Goto terminal in the IntelliJ
  2. Write `cd site`
  4. Write `kobweb run`
  
         If you get nodejs error then download it from the error link. ie. 'https://nodejs.org/dist/v18.12.1/node-v18.12.1-win-x64.zip'.  

  5. Open browser and run localserver, ie. http://localhost:8080/api/people?count=2
  6. Push code on Github

# Deploy server for free
- Goto https://render.com/
- Create account
- Connect your github
- Create new webservice from render dashboard
- Select your github repo and connect
- Give name and choose free plan
- Click on Create webservice, It will take few minutes to deploy, so be patience
- After successfully deploy, you can check your API from given link.

# Technology & Tools Used
- Kotlin
- Docker
- Gradle
- IntelliJ IDE

Author: Kaushal Vasava
