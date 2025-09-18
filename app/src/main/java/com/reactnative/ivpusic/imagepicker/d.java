package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import com.facebook.react.bridge.PromiseImpl;
import defpackage.C5977mw;

/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PickerModule c;

    public d(PickerModule pickerModule, Activity activity, String str, String str2, String str3) {
        this.c = pickerModule;
        this.a = str;
        this.b = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5977mw c5977mw = this.c.compression;
        this.c.options;
        String str = this.a;
        PromiseImpl promiseImpl = new PromiseImpl(new c(this, 0), new c(this, 1));
        synchronized (c5977mw) {
            promiseImpl.resolve(str);
        }
    }
}
