package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.hints.C6034i;
import io.sentry.internal.gestures.C6044b;
import java.util.Collections;
import p000.C11249u70;

/* renamed from: io.sentry.android.core.internal.gestures.f */
/* loaded from: classes2.dex */
public final class C5876f extends AbstractWindowCallbackC5877g {

    /* renamed from: b */
    public final Window.Callback f33722b;

    /* renamed from: c */
    public final GestureDetectorOnGestureListenerC5875e f33723c;

    /* renamed from: d */
    public final GestureDetectorCompat f33724d;

    /* renamed from: e */
    public final C5759D1 f33725e;

    /* renamed from: f */
    public final C6034i f33726f;

    public C5876f(Window.Callback callback, Activity activity, GestureDetectorOnGestureListenerC5875e gestureDetectorOnGestureListenerC5875e, C5759D1 c5759d1) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, gestureDetectorOnGestureListenerC5875e);
        C6034i c6034i = new C6034i();
        super(callback);
        this.f33722b = callback;
        this.f33723c = gestureDetectorOnGestureListenerC5875e;
        this.f33725e = c5759d1;
        this.f33724d = gestureDetectorCompat;
        this.f33726f = c6034i;
    }

    /* renamed from: a */
    public final void m21575a(MotionEvent motionEvent) {
        this.f33724d.f16109a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            GestureDetectorOnGestureListenerC5875e gestureDetectorOnGestureListenerC5875e = this.f33723c;
            View viewM21572b = gestureDetectorOnGestureListenerC5875e.m21572b("onUp");
            C11249u70 c11249u70 = gestureDetectorOnGestureListenerC5875e.f33721g;
            C6044b c6044b = (C6044b) c11249u70.f43529d;
            if (viewM21572b == null || c6044b == null) {
                return;
            }
            EnumC5874d enumC5874d = (EnumC5874d) c11249u70.f43528c;
            EnumC5874d enumC5874d2 = EnumC5874d.Unknown;
            if (enumC5874d == enumC5874d2) {
                gestureDetectorOnGestureListenerC5875e.f33717c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - c11249u70.f43526a;
            float y = motionEvent.getY() - c11249u70.f43527b;
            gestureDetectorOnGestureListenerC5875e.m21571a(c6044b, (EnumC5874d) c11249u70.f43528c, Collections.singletonMap(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, Math.abs(x) > Math.abs(y) ? x > 0.0f ? "right" : "left" : y > 0.0f ? "down" : "up"), motionEvent);
            gestureDetectorOnGestureListenerC5875e.m21573d(c6044b, (EnumC5874d) c11249u70.f43528c);
            c11249u70.f43529d = null;
            c11249u70.f43528c = enumC5874d2;
            c11249u70.f43526a = 0.0f;
            c11249u70.f43527b = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC5877g, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C5759D1 c5759d1;
        if (motionEvent != null) {
            this.f33726f.getClass();
            try {
                m21575a(MotionEvent.obtain(motionEvent));
            } finally {
                if (c5759d1 != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f33727a.dispatchTouchEvent(motionEvent);
    }
}
