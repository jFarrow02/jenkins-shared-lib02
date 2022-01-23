#!/usr/bin/env groovy

import com.sharedlib.SharedLib

def call(String image, String repo) {
    return new SharedLib(this).buildImage(image, repo)
}