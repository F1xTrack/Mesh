package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1946b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f18392a;

    public ViewTreeObserverOnPreDrawListenerC1946b(ClockFaceView clockFaceView) {
        this.f18392a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ClockFaceView clockFaceView = this.f18392a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f18352s.f18371k) - clockFaceView.f18345A;
        if (height != clockFaceView.f17419q) {
            clockFaceView.f17419q = height;
            clockFaceView.mo10667g();
            int i = clockFaceView.f17419q;
            ClockHandView clockHandView = clockFaceView.f18352s;
            clockHandView.f18380t = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
