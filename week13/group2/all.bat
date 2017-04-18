echo Compiling

javac src\kz\kbtu\edu\fit\pt101\ch8\*.java src\PackageTest.java -d bin

echo Running

java -cp .;bin PackageTest