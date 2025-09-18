package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.Arrays;
import java.util.List;
import p000.InterfaceC7278zf;
import p000.T21;

/* loaded from: classes2.dex */
public class SonyHomeBadger implements InterfaceC7278zf {

    /* renamed from: a */
    public final Uri f37811a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public T21 f37812b;

    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) {
        if (reactApplicationContext.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
            reactApplicationContext.sendBroadcast(intent);
            return;
        }
        if (i < 0) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        Uri uri = this.f37811a;
        if (looperMyLooper != mainLooper) {
            reactApplicationContext.getApplicationContext().getContentResolver().insert(uri, contentValues);
            return;
        }
        if (this.f37812b == null) {
            this.f37812b = new T21(reactApplicationContext.getApplicationContext().getContentResolver());
        }
        this.f37812b.startInsert(0, null, uri, contentValues);
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
