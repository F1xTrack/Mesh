package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ ReactApplicationContext a;
    public final /* synthetic */ BlobModule b;

    public a(ReactApplicationContext reactApplicationContext, BlobModule blobModule) {
        this.a = reactApplicationContext;
        this.b = blobModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JavaScriptContextHolder javaScriptContextHolder = this.a.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
            return;
        }
        BlobCollector.nativeInstall(this.b, javaScriptContextHolder.get());
    }
}
