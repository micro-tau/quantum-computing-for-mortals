#!/bin/bash

# Install git
sudo apt install git

# Install java 8
sudo apt install openjdk-8-jdk

# Install SBT
sudo apt install wget
wget https://dl.bintray.com/sbt/debian/sbt-1.2.7.deb
sudo dpkg -i sbt-1.2.7.deb
rm -r sbt-1.2.7.deb
sbt about

# Install Ruby and Jekyll
sudo apt install ruby ruby-dev build-essential
export GEM_HOME=$HOME/gems
export PATH=$HOME/gems/bin:$PATH
gem install jekyll bundler

# Install pandoc
sudo apt install pandoc

