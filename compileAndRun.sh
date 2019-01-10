#!/bin/bash
if [ -f "$out" ]
then
    mkdir out
fi
cd src
rm -f ../out/*.class && javac -d ../out Main.java && java -cp ../out/ Main
