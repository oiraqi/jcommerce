# set the base image
FROM ubuntu

# author
MAINTAINER Omar Iraqi

# extra metadata
LABEL version="1.0"
LABEL description="Docker Image for Ubuntu, OpenJDK 8, Git, curl, SDKMAN! and Spring Boot CLI"

# update sources list
RUN apt-get clean
RUN apt-get update
RUN apt-get install -y --no-install-recommends apt-utils

# install required software, one per line for better caching
RUN apt-get install -qy openjdk-8-jdk
RUN apt-get install -qy git
RUN apt-get install -qy curl
RUN apt-get install -qy locales
RUN apt-get install -qy nano
RUN apt-get install -qy tmux
RUN apt-get install -qy wget
RUN apt-get install -qy zip unzip
RUN curl -s "https://get.sdkman.io" | bash
RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install springboot"

# cleanup
RUN apt-get -qy autoremove

# locales to UTF-8
RUN locale-gen "en_US.UTF-8" && /usr/sbin/update-locale LANG=en_US.UTF-8
ENV LC_ALL en_US.UTF-8

