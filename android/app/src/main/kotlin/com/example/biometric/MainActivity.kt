package com.example.biometric

import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine:FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
    }
}
