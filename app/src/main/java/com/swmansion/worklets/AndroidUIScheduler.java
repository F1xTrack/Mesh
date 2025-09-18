package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0446H4;
import p000.InterfaceC0965PK;
import p000.RunnableC0383G4;

/* loaded from: classes2.dex */
public class AndroidUIScheduler {

    /* renamed from: a */
    public final ReactApplicationContext f20263a;

    /* renamed from: b */
    public final AtomicBoolean f20264b = new AtomicBoolean(true);

    /* renamed from: c */
    public final RunnableC0383G4 f20265c = new RunnableC0383G4(0, this);

    @InterfaceC0965PK
    private final HybridData mHybridData = initHybrid();

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.f20263a = reactApplicationContext;
    }

    private native HybridData initHybrid();

    @InterfaceC0965PK
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new C0446H4(this, this.f20263a.getExceptionHandler()));
    }

    public native void invalidate();

    public native void triggerUI();
}
