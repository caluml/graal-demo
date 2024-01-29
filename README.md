This is a quick project to show how Graal works.

After cloning this repo,

  1. Download Graal from https://www.graalvm.org/downloads/
  1. export JAVA_HOME=/opt/path/to/graal
  1. ./build-native.sh

## Running the normal way
`time java -cp target/classes/ graalcli.Main add 123 234`

## Running the Graal native way
`time target/graal-cli add 123 234`
