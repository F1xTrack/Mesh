package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: com.facebook.react.modules.blob.a */
/* loaded from: classes.dex */
public final class RunnableC1929a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReactApplicationContext f17921a;

    /* renamed from: b */
    public final /* synthetic */ BlobModule f17922b;

    public RunnableC1929a(ReactApplicationContext reactApplicationContext, BlobModule blobModule) {
        this.f17921a = reactApplicationContext;
        this.f17922b = blobModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JavaScriptContextHolder javaScriptContextHolder = this.f17921a.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
            return;
        }
        BlobCollector.nativeInstall(this.f17922b, javaScriptContextHolder.get());
    }
}
