package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import defpackage.AbstractC8235ym;
import defpackage.C0532Go1;
import defpackage.C7352u70;
import defpackage.H30;
import io.sentry.C;
import io.sentry.C5122f;
import io.sentry.C5185y;
import io.sentry.E;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.S0;
import io.sentry.U;
import io.sentry.U1;
import io.sentry.Z1;
import io.sentry.a2;
import io.sentry.android.core.SentryAndroidOptions;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final E b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.b d = null;
    public U e = null;
    public d f;
    public final C7352u70 g;

    public e(Activity activity, E e, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.Unknown;
        this.f = dVar;
        C7352u70 c7352u70 = new C7352u70();
        c7352u70.c = dVar;
        c7352u70.a = 0.0f;
        c7352u70.b = 0.0f;
        this.g = c7352u70;
        this.a = new WeakReference(activity);
        this.b = e;
        this.c = sentryAndroidOptions;
    }

    public static String c(d dVar) {
        int i = c.a[dVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click";
    }

    public final void a(io.sentry.internal.gestures.b bVar, d dVar, Map map, MotionEvent motionEvent) {
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            String strC = c(dVar);
            C5185y c5185y = new C5185y();
            c5185y.c(motionEvent, "android:motionEvent");
            c5185y.c(bVar.a.get(), "android:view");
            C5122f c5122f = new C5122f();
            c5122f.d = "user";
            c5122f.f = "ui.".concat(strC);
            String str = bVar.c;
            if (str != null) {
                c5122f.b(str, "view.id");
            }
            String str2 = bVar.b;
            if (str2 != null) {
                c5122f.b(str2, "view.class");
            }
            for (Map.Entry entry : map.entrySet()) {
                c5122f.e.put((String) entry.getKey(), entry.getValue());
            }
            c5122f.h = EnumC5148n1.INFO;
            this.b.v(c5122f, c5185y);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, AbstractC8235ym.k("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, AbstractC8235ym.k("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, AbstractC8235ym.k("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void d(io.sentry.internal.gestures.b bVar, d dVar) {
        boolean z = dVar == d.Click || !(dVar == this.f && bVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        E e = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                C c = new C(8);
                e.getClass();
                S0.b(c);
                this.d = bVar;
                this.f = dVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = bVar.c;
        if (str == null) {
            io.sentry.config.a.D(null, "UiElement.tag can't be null");
            str = null;
        }
        U u = this.e;
        if (u != null) {
            if (!z && !u.b()) {
                sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, AbstractC8235ym.k("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.l();
                    return;
                }
                return;
            }
            e(U1.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        String strConcat = "ui.action.".concat(c(dVar));
        a2 a2Var = new a2();
        a2Var.d = true;
        a2Var.f = 30000L;
        a2Var.e = sentryAndroidOptions.getIdleTimeout();
        a2Var.a = true;
        U u2 = e.u(new Z1(str2, io.sentry.protocol.C.COMPONENT, strConcat, null), a2Var);
        u2.n().i = "auto.ui.gesture_listener." + bVar.d;
        S0.b(new H30(this, 26, u2));
        this.e = u2;
        this.d = bVar;
        this.f = dVar;
    }

    public final void e(U1 u1) {
        U u = this.e;
        if (u != null) {
            if (u.getStatus() == null) {
                this.e.f(u1);
            } else {
                this.e.finish();
            }
        }
        C0532Go1 c0532Go1 = new C0532Go1(2, this);
        this.b.getClass();
        S0.b(c0532Go1);
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C7352u70 c7352u70 = this.g;
        c7352u70.d = null;
        c7352u70.c = d.Unknown;
        c7352u70.a = 0.0f;
        c7352u70.b = 0.0f;
        c7352u70.a = motionEvent.getX();
        c7352u70.b = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.c = d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            C7352u70 c7352u70 = this.g;
            if (((d) c7352u70.c) == d.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.b bVarG = io.sentry.config.a.g(sentryAndroidOptions, viewB, x, y, aVar);
                if (bVarG == null) {
                    sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
                StringBuilder sb = new StringBuilder("Scroll target found: ");
                String str = bVarG.c;
                if (str == null) {
                    io.sentry.config.a.D(null, "UiElement.tag can't be null");
                    str = null;
                }
                sb.append(str);
                logger.k(enumC5148n1, sb.toString(), new Object[0]);
                c7352u70.d = bVarG;
                c7352u70.c = d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.b bVarG = io.sentry.config.a.g(sentryAndroidOptions, viewB, x, y, aVar);
            if (bVarG == null) {
                sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            d dVar = d.Click;
            a(bVarG, dVar, Collections.emptyMap(), motionEvent);
            d(bVarG, dVar);
        }
        return false;
    }
}
