package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import com.facebook.react.bridge.PromiseImpl;
import p000.C6457mw;

/* renamed from: com.reactnative.ivpusic.imagepicker.d */
/* loaded from: classes2.dex */
public final class RunnableC2403d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f20242a;

    /* renamed from: b */
    public final /* synthetic */ String f20243b;

    /* renamed from: c */
    public final /* synthetic */ PickerModule f20244c;

    public RunnableC2403d(PickerModule pickerModule, Activity activity, String str, String str2, String str3) {
        this.f20244c = pickerModule;
        this.f20242a = str;
        this.f20243b = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6457mw c6457mw = this.f20244c.compression;
        this.f20244c.options;
        String str = this.f20242a;
        PromiseImpl promiseImpl = new PromiseImpl(new C2402c(this, 0), new C2402c(this, 1));
        synchronized (c6457mw) {
            promiseImpl.resolve(str);
        }
    }
}
