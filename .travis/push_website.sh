#!/usr/bin/env bash
set -e
gem update --system
gem install sass
gem install jekyll -v 4.0.0

# Workaround for https://github.com/sbt/sbt-ghpages/issues/46
sbt docs/makeMicrosite docs/ghpagesSynchLocal docs/publishMicrosite
