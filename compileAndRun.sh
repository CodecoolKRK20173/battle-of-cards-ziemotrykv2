#!/bin/bash
if [ -f "$out" ]
then
    mkdir out
fi
rm -f out/*.class && javac -d out src/Main.java && java -cp out/ Main
