Run the xjc tool to create .java files from the .xsd:
	xjc -p sampleSchemaPackage SampleSchema.xsd .

Compile the .java files in the package that was just created:
	javac sampleSchemaPackage/*.java

Compile the test class:
	javac JaxbTestClass.java

Run the test class:
	java JaxbTestClass

Check the output:
	cat SamplePerson.xml

