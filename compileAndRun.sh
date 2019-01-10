#!/bin/bash
mkdir out && rm -f out/*.class && javac -d out src/Main.java && java -cp out/ Main
