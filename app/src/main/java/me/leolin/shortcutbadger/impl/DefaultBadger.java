package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC8977cP1;
import p000.C11488w01;
import p000.InterfaceC7278zf;

/* loaded from: classes2.dex */
public class DefaultBadger implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) throws C11488w01 {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                AbstractC8977cP1.m10693b(reactApplicationContext, intent2);
                return;
            } catch (C11488w01 unused) {
            }
        }
        AbstractC8977cP1.m10693b(reactApplicationContext, intent);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
