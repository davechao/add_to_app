import 'package:flutter/material.dart';

class Cell extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _CellState();
}

class _CellState extends State<Cell> {
  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);

    return Scaffold(
      body: SafeArea(
        child: Container(
          color: Colors.white,
          alignment: Alignment.center,
          child: Text("Flutter Cell", style: theme.textTheme.headline3),
        ),
      ),
    );
  }
}
