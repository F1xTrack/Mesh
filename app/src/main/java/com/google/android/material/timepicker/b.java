package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.s.k) - clockFaceView.A;
        if (height != clockFaceView.q) {
            clockFaceView.q = height;
            clockFaceView.g();
            int i = clockFaceView.q;
            ClockHandView clockHandView = clockFaceView.s;
            clockHandView.t = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
