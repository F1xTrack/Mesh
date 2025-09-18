package com.yandex.mapkit;

import android.content.Intent;
import android.net.Uri;
import com.yandex.runtime.Runtime;

/* loaded from: classes2.dex */
public class UrlOpener {
    public static void open(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        Runtime.getApplicationContext().startActivity(intent);
    }
}
