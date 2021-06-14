import 'package:flutter/material.dart';

class FlutterActivityScreen extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _FlutterActivityState();
}

class _FlutterActivityState extends State<FlutterActivityScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('FlutterActivity'),
      ),
      body: SafeArea(
        child: Center(
          child: Text('Hello FlutterActivity'),
        ),
      ),
    );
  }
}
