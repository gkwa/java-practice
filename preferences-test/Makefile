test2:
	sh -x compile.sh

test:
	cd prefstest && mvn test

prefstest:
	mvn archetype:generate -DgroupId=com.streambox.prefstest -DartifactId=prefstest -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false &&	
clean:
	rm -rf prefstest/target
