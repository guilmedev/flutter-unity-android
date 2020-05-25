package br.com.flutter.unity;

import android.content.Intent;
import android.os.Bundle;


import br.com.unityModule.UnityPlayerActivity;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  private static  final  String CHANNEL = "br.com.unity/unity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);


    new MethodChannel(getFlutterView(), CHANNEL).setMethodCallHandler(new MethodChannel.MethodCallHandler() {
      @Override
      public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {

        if(methodCall.method.equals("open")){
          result.success(1 );

          Intent intent = new Intent(getApplicationContext(), UnityPlayerActivity.class);
          startActivity(intent);

        }

      }
    });

  }
}
