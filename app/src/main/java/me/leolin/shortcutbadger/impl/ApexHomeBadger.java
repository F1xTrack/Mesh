package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC8977cP1;
import p000.C11488w01;
import p000.InterfaceC7278zf;

/* loaded from: classes2.dex */
public class ApexHomeBadger implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) throws C11488w01 {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        AbstractC8977cP1.m10693b(reactApplicationContext, intent);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
