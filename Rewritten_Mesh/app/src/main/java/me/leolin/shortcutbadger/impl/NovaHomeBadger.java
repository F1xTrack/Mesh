package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.List;
import p000.InterfaceC7278zf;

/* loaded from: classes2.dex */
public class NovaHomeBadger implements InterfaceC7278zf {
    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        reactApplicationContext.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
