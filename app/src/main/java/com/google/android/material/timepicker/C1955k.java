package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.material.timepicker.k */
/* loaded from: classes.dex */
public final class C1955k extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f18440a;

    public C1955k(TimePickerView timePickerView) {
        this.f18440a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C1949e c1949e = this.f18440a.f18390w;
        if (c1949e == null) {
            return false;
        }
        c1949e.f18414t = 1;
        c1949e.m11284s(c1949e.f18412r);
        c1949e.f18402h.m11291d();
        return true;
    }
}
