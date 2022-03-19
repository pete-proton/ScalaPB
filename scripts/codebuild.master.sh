#!/bin/sh
set -eu

export SBT_OPTS="-Xmx4G -Xms2G -Duser.timezone=Asia/Tokyo" && \
  sbt -Dsbt.log.noformat=true compile runtime/publish