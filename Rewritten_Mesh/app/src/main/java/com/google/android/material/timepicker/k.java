package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public k(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        e eVar = this.a.w;
        if (eVar == null) {
            return false;
        }
        eVar.t = 1;
        eVar.s(eVar.r);
        eVar.h.d();
        return true;
    }
}
