package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.flutter.FlutterInjector
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_flutter_activity.setOnClickListener {

            FlutterEngine(this).let {
                it.navigationChannel.setInitialRoute("flutter_activity")
                it.dartExecutor.executeDartEntrypoint(
                    DartExecutor.DartEntrypoint.createDefault()
                )
                FlutterEngineCache
                    .getInstance()
                    .put("flutter_activity_id", it)
            }

            val flutterActivity = FlutterActivity
                .withCachedEngine("flutter_activity_id")
                .build(this)
            startActivity(flutterActivity)
        }

        btn_flutter_fragment.setOnClickListener {
            FlutterEngine(this).let {
                it.navigationChannel.setInitialRoute("/")
                it.dartExecutor.executeDartEntrypoint(
                    DartExecutor.DartEntrypoint.createDefault()
                )
                FlutterEngineCache
                    .getInstance()
                    .put("flutter_fragment_id", it)
            }
            val intent = Intent()
            intent.setClass(this, MyFragmentActivity::class.java)
            startActivity(intent)
        }

        btn_flutter_view.setOnClickListener {
            FlutterEngine(this).let {
                it.lifecycleChannel.appIsResumed()
                it.navigationChannel.setInitialRoute("cell")
                it.dartExecutor.executeDartEntrypoint(
                    DartExecutor.DartEntrypoint.createDefault()
                )
                FlutterEngineCache
                    .getInstance()
                    .put("flutter_view_id", it)
            }
            val intent = Intent()
            intent.setClass(this, FlutterViewActivity::class.java)
            startActivity(intent)
        }
    }

}