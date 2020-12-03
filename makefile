all:
	javac -d src *.java

run:
	java -cp src Calculator

clean:
	rm -rf src

