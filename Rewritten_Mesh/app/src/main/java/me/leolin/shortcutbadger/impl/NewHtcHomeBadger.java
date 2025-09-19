package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;
import p000.AbstractC8977cP1;
import p000.C11488w01;
import p000.InterfaceC7278zf;

/* loaded from: classes2.dex */
public class NewHtcHomeBadger implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) throws C11488w01 {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            AbstractC8977cP1.m10693b(reactApplicationContext, intent);
            z = true;
        } catch (C11488w01 unused) {
            z = false;
        }
        try {
            AbstractC8977cP1.m10693b(reactApplicationContext, intent2);
            z2 = true;
        } catch (C11488w01 unused2) {
        }
        if (z || z2) {
            return;
        }
        throw new C11488w01("unable to resolve intent: " + intent2.toString());
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Collections.singletonList("com.htc.launcher");
    }
}
