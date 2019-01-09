#!/bin/bash
find src -name '*.java' > sources.list
find out -name '*.class' > classes.list
rm -f @classes.list
javac @sources.list -d out && java -cp out
