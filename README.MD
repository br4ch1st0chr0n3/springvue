# Sample Spring Boot + Vue.js app

Visit [https://springvue-1.herokuapp.com/](https://springvue-1.herokuapp.com/)

Also, try [https://springvue-1.herokuapp.com/api/messages/hello](https://springvue-1.herokuapp.com/api/messages/hello)

* Inspired by [this video](https://www.youtube.com/watch?v=2G6r2f40Lps&t=2s)
* Deployed on Heroku by following [this tutorial](https://www.youtube.com/watch?v=Papvsbo3KKM)

## TODO
* add [vuex store](https://blog.logrocket.com/vue-typescript-tutorial-examples/#data)


## Dev
* Change code
  * Build and run backend (alternatively, with an IDE's Run button)
    ```shell
    mvn clean package
    java -jar target/springvue-0.0.1-SNAPSHOT.jar
    ```
  * Run frontend
    ```shell
    npm run serve
    ```

## Deploy
* Build package
```shell
 mvn clean package
```
* Deploy
```shell
heroku deploy:jar target/springvue-0.0.1-SNAPSHOT.jar -a springvue-1
```
* Open
```shell
heroku open -a springvue-1
```