#!/usr/bin/env sh
set -e
sbt publishLocal scalapbc/publishLocal createVersionFile
cd e2e
sbt clean test

