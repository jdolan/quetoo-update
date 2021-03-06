[![Build Status](http://ci.quetoo.org/buildStatus/icon?job=Quetoo-Installer)](http://ci.quetoo.org/job/Quetoo-Installer/)
[![Zlib License](https://img.shields.io/badge/license-Zlib%20License-green.svg)](COPYING)
![This software is BETA](https://img.shields.io/badge/development_stage-BETA-yellowgreen.svg)

# Quetoo Update

![Quetoo BETA](http://quetoo.org/files/15385369_1245001622212024_7988137002503923923_o.jpg)

## Overview

This repository provides a Java-based installer and update utility for [_Quetoo_](https://github.com/jdolan/quetoo).

## Compiling

This project builds with [Maven3](https://maven.apache.org/):

    mvn package [-DskipTests]

The resulting minified _uber_ `.jar` is created by the [Shade](https://maven.apache.org/plugins/maven-shade-plugin/) and [Proguard](https://github.com/wvengen/proguard-maven-plugin) Maven plugins.

## Support
 * The IRC channel for this project is *#quetoo* on *irc.freenode.net*
