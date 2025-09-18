package io.sentry.react;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5847T;
import io.sentry.android.core.C5852Y;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;
import io.sentry.config.AbstractC6003a;
import java.util.Date;

/* renamed from: io.sentry.react.f */
/* loaded from: classes2.dex */
public final class C6122f extends View {

    /* renamed from: f */
    public static final C5847T f34536f = new C5847T();

    /* renamed from: a */
    public final ReactApplicationContext f34537a;

    /* renamed from: b */
    public final C5852Y f34538b;

    /* renamed from: c */
    public final RunnableC6121e f34539c;

    /* renamed from: d */
    public final RunnableC6121e f34540d;

    /* renamed from: e */
    public final C5832D f34541e;

    /* JADX WARN: Type inference failed for: r2v1, types: [io.sentry.react.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.sentry.react.e] */
    public C6122f(ReactApplicationContext reactApplicationContext, C5832D c5832d) {
        super(reactApplicationContext);
        this.f34538b = new C5852Y();
        this.f34537a = reactApplicationContext;
        this.f34541e = c5832d;
        final int i = 0;
        this.f34539c = new Runnable(this) { // from class: io.sentry.react.e

            /* renamed from: b */
            public final /* synthetic */ C6122f f34535b;

            {
                this.f34535b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f34535b.m21856a("initialDisplay");
                        break;
                    default:
                        this.f34535b.m21856a("fullDisplay");
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f34540d = new Runnable(this) { // from class: io.sentry.react.e

            /* renamed from: b */
            public final /* synthetic */ C6122f f34535b;

            {
                this.f34535b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f34535b.m21856a("initialDisplay");
                        break;
                    default:
                        this.f34535b.m21856a("fullDisplay");
                        break;
                }
            }
        };
    }

    /* renamed from: a */
    public final void m21856a(String str) {
        this.f34538b.getClass();
        Date dateM21752k = AbstractC6003a.m21752k();
        System.nanoTime();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", str);
        writableMapCreateMap.putDouble("newFrameTimestampInSeconds", (dateM21752k.getTime() * 1000000) / 1.0E9d);
        ReactApplicationContext reactApplicationContext = this.f34537a;
        if (reactApplicationContext == null) {
            f34536f.mo21407k(EnumC6069n1.ERROR, "[TimeToDisplay] Recorded next frame draw but can't emit the event, reactContext is null.", new Object[0]);
        } else {
            ((RCTEventEmitter) reactApplicationContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onDrawNextFrameView", writableMapCreateMap);
        }
    }

    /* renamed from: b */
    public final void m21857b(Runnable runnable) {
        C5847T c5847t = f34536f;
        if (runnable == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, emitter is null.", new Object[0]);
            return;
        }
        C5832D c5832d = this.f34541e;
        if (c5832d == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
            return;
        }
        ReactApplicationContext reactApplicationContext = this.f34537a;
        if (reactApplicationContext == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
            return;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            c5847t.mo21407k(EnumC6069n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
        } else {
            ViewTreeObserverOnDrawListenerC5886f.m21584a(currentActivity, runnable, c5832d);
        }
    }

    public void setFullDisplay(boolean z) {
        if (z) {
            f34536f.mo21407k(EnumC6069n1.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            m21857b(this.f34540d);
        }
    }

    public void setInitialDisplay(boolean z) {
        if (z) {
            f34536f.mo21407k(EnumC6069n1.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            m21857b(this.f34539c);
        }
    }
}
