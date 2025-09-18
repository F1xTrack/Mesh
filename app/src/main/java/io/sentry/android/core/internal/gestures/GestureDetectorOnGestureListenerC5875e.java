package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.AbstractC5802S0;
import io.sentry.C5754C;
import io.sentry.C5760E;
import io.sentry.C5824Z1;
import io.sentry.C5828a2;
import io.sentry.C6017f;
import io.sentry.C6193y;
import io.sentry.EnumC5809U1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5807U;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.gestures.C6044b;
import io.sentry.internal.gestures.EnumC6043a;
import io.sentry.protocol.EnumC6080C;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import p000.AbstractC7222ym;
import p000.C11249u70;
import p000.C7655Go1;
import p000.H30;

/* renamed from: io.sentry.android.core.internal.gestures.e */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC5875e implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    public final WeakReference f33715a;

    /* renamed from: b */
    public final C5760E f33716b;

    /* renamed from: c */
    public final SentryAndroidOptions f33717c;

    /* renamed from: d */
    public C6044b f33718d = null;

    /* renamed from: e */
    public InterfaceC5807U f33719e = null;

    /* renamed from: f */
    public EnumC5874d f33720f;

    /* renamed from: g */
    public final C11249u70 f33721g;

    public GestureDetectorOnGestureListenerC5875e(Activity activity, C5760E c5760e, SentryAndroidOptions sentryAndroidOptions) {
        EnumC5874d enumC5874d = EnumC5874d.Unknown;
        this.f33720f = enumC5874d;
        C11249u70 c11249u70 = new C11249u70();
        c11249u70.f43528c = enumC5874d;
        c11249u70.f43526a = 0.0f;
        c11249u70.f43527b = 0.0f;
        this.f33721g = c11249u70;
        this.f33715a = new WeakReference(activity);
        this.f33716b = c5760e;
        this.f33717c = sentryAndroidOptions;
    }

    /* renamed from: c */
    public static String m21570c(EnumC5874d enumC5874d) {
        int i = AbstractC5873c.f33714a[enumC5874d.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click";
    }

    /* renamed from: a */
    public final void m21571a(C6044b c6044b, EnumC5874d enumC5874d, Map map, MotionEvent motionEvent) {
        if (this.f33717c.isEnableUserInteractionBreadcrumbs()) {
            String strM21570c = m21570c(enumC5874d);
            C6193y c6193y = new C6193y();
            c6193y.m21928c(motionEvent, "android:motionEvent");
            c6193y.m21928c(c6044b.f34200a.get(), "android:view");
            C6017f c6017f = new C6017f();
            c6017f.f34146d = "user";
            c6017f.f34148f = "ui.".concat(strM21570c);
            String str = c6044b.f34202c;
            if (str != null) {
                c6017f.m21778b(str, "view.id");
            }
            String str2 = c6044b.f34201b;
            if (str2 != null) {
                c6017f.m21778b(str2, "view.class");
            }
            for (Map.Entry entry : map.entrySet()) {
                c6017f.f34147e.put((String) entry.getKey(), entry.getValue());
            }
            c6017f.f34150h = EnumC6069n1.INFO;
            this.f33716b.mo21376v(c6017f, c6193y);
        }
    }

    /* renamed from: b */
    public final View m21572b(String str) {
        Activity activity = (Activity) this.f33715a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f33717c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, AbstractC7222ym.m26234k("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, AbstractC7222ym.m26234k("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, AbstractC7222ym.m26234k("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    /* renamed from: d */
    public final void m21573d(C6044b c6044b, EnumC5874d enumC5874d) {
        boolean z = enumC5874d == EnumC5874d.Click || !(enumC5874d == this.f33720f && c6044b.equals(this.f33718d));
        SentryAndroidOptions sentryAndroidOptions = this.f33717c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        C5760E c5760e = this.f33716b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                C5754C c5754c = new C5754C(8);
                c5760e.getClass();
                AbstractC5802S0.m21464b(c5754c);
                this.f33718d = c6044b;
                this.f33720f = enumC5874d;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f33715a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = c6044b.f34202c;
        if (str == null) {
            AbstractC6003a.m21735D(null, "UiElement.tag can't be null");
            str = null;
        }
        InterfaceC5807U interfaceC5807U = this.f33719e;
        if (interfaceC5807U != null) {
            if (!z && !interfaceC5807U.mo21420b()) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, AbstractC7222ym.m26234k("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f33719e.mo21430l();
                    return;
                }
                return;
            }
            m21574e(EnumC5809U1.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        String strConcat = "ui.action.".concat(m21570c(enumC5874d));
        C5828a2 c5828a2 = new C5828a2();
        c5828a2.f33474d = true;
        c5828a2.f33476f = 30000L;
        c5828a2.f33475e = sentryAndroidOptions.getIdleTimeout();
        c5828a2.f33409a = true;
        InterfaceC5807U interfaceC5807UMo21375u = c5760e.mo21375u(new C5824Z1(str2, EnumC6080C.COMPONENT, strConcat, null), c5828a2);
        interfaceC5807UMo21375u.mo21432n().f33387i = "auto.ui.gesture_listener." + c6044b.f34203d;
        AbstractC5802S0.m21464b(new H30(this, 26, interfaceC5807UMo21375u));
        this.f33719e = interfaceC5807UMo21375u;
        this.f33718d = c6044b;
        this.f33720f = enumC5874d;
    }

    /* renamed from: e */
    public final void m21574e(EnumC5809U1 enumC5809U1) {
        InterfaceC5807U interfaceC5807U = this.f33719e;
        if (interfaceC5807U != null) {
            if (interfaceC5807U.getStatus() == null) {
                this.f33719e.mo21424f(enumC5809U1);
            } else {
                this.f33719e.finish();
            }
        }
        C7655Go1 c7655Go1 = new C7655Go1(2, this);
        this.f33716b.getClass();
        AbstractC5802S0.m21464b(c7655Go1);
        this.f33719e = null;
        if (this.f33718d != null) {
            this.f33718d = null;
        }
        this.f33720f = EnumC5874d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C11249u70 c11249u70 = this.f33721g;
        c11249u70.f43529d = null;
        c11249u70.f43528c = EnumC5874d.Unknown;
        c11249u70.f43526a = 0.0f;
        c11249u70.f43527b = 0.0f;
        c11249u70.f43526a = motionEvent.getX();
        c11249u70.f43527b = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f33721g.f43528c = EnumC5874d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewM21572b = m21572b("onScroll");
        if (viewM21572b != null && motionEvent != null) {
            C11249u70 c11249u70 = this.f33721g;
            if (((EnumC5874d) c11249u70.f43528c) == EnumC5874d.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                EnumC6043a enumC6043a = EnumC6043a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f33717c;
                C6044b c6044bM21748g = AbstractC6003a.m21748g(sentryAndroidOptions, viewM21572b, x, y, enumC6043a);
                if (c6044bM21748g == null) {
                    sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
                StringBuilder sb = new StringBuilder("Scroll target found: ");
                String str = c6044bM21748g.f34202c;
                if (str == null) {
                    AbstractC6003a.m21735D(null, "UiElement.tag can't be null");
                    str = null;
                }
                sb.append(str);
                logger.mo21407k(enumC6069n1, sb.toString(), new Object[0]);
                c11249u70.f43529d = c6044bM21748g;
                c11249u70.f43528c = EnumC5874d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewM21572b = m21572b("onSingleTapUp");
        if (viewM21572b != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            EnumC6043a enumC6043a = EnumC6043a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f33717c;
            C6044b c6044bM21748g = AbstractC6003a.m21748g(sentryAndroidOptions, viewM21572b, x, y, enumC6043a);
            if (c6044bM21748g == null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            EnumC5874d enumC5874d = EnumC5874d.Click;
            m21571a(c6044bM21748g, enumC5874d, Collections.emptyMap(), motionEvent);
            m21573d(c6044bM21748g, enumC5874d);
        }
        return false;
    }
}
