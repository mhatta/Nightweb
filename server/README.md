## Build Instructions

1. Install JDK
	- If you use apt-get, just type `sudo apt-get install default-jdk`
	- Tested with openjdk-11-jdk on Debian sid 
2. Install [Leiningen](https://github.com/technomancy/leiningen)
	- The version in your package manager may be out of date
	- I recommend the manual installation they describe in their README
	- Tested with leiningen 2.8.1-9 on Debian sid
3. In this directory, type `lein uberjar`
4. To run it in the background, type `java -jar target/Nightweb-{VERSION}-standalone.jar &`
