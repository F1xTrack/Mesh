package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import defpackage.C7352u70;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.hints.i;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class f extends g {
    public final Window.Callback b;
    public final e c;
    public final GestureDetectorCompat d;
    public final D1 e;
    public final i f;

    public f(Window.Callback callback, Activity activity, e eVar, D1 d1) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, eVar);
        i iVar = new i();
        super(callback);
        this.b = callback;
        this.c = eVar;
        this.e = d1;
        this.d = gestureDetectorCompat;
        this.f = iVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.d.a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            e eVar = this.c;
            View viewB = eVar.b("onUp");
            C7352u70 c7352u70 = eVar.g;
            io.sentry.internal.gestures.b bVar = (io.sentry.internal.gestures.b) c7352u70.d;
            if (viewB == null || bVar == null) {
                return;
            }
            d dVar = (d) c7352u70.c;
            d dVar2 = d.Unknown;
            if (dVar == dVar2) {
                eVar.c.getLogger().k(EnumC5148n1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - c7352u70.a;
            float y = motionEvent.getY() - c7352u70.b;
            eVar.a(bVar, (d) c7352u70.c, Collections.singletonMap(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, Math.abs(x) > Math.abs(y) ? x > 0.0f ? "right" : "left" : y > 0.0f ? "down" : "up"), motionEvent);
            eVar.d(bVar, (d) c7352u70.c);
            c7352u70.d = null;
            c7352u70.c = dVar2;
            c7352u70.a = 0.0f;
            c7352u70.b = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.g, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        D1 d1;
        if (motionEvent != null) {
            this.f.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (d1 != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
