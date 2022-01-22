#!/usr/bin/env groovy

import com.sharedlib.SharedLib

def call() {
    return new SharedLib(this).testAndPackage()
}