#!/usr/bin/env groovy

import com.shared-lib.SharedLib

def call() {
    return new SharedLib(this).testAndPackage()
}