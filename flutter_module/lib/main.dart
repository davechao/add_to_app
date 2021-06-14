import 'package:flutter/material.dart';
import 'package:flutter_module/cell.dart';
import 'package:flutter_module/counter_screen.dart';
import 'package:flutter_module/flutter_activity_screen.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: '/',
      routes: {
        '/': (context) => CounterScreen(),
        'flutter_activity': (context) => FlutterActivityScreen(),
        'cell': (context) => Cell(),
      },
    );
  }
}
