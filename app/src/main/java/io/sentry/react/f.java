package io.sentry.react;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.D;
import io.sentry.android.core.T;
import io.sentry.android.core.Y;
import java.util.Date;

/* loaded from: classes2.dex */
public final class f extends View {
    public static final T f = new T();
    public final ReactApplicationContext a;
    public final Y b;
    public final e c;
    public final e d;
    public final D e;

    /* JADX WARN: Type inference failed for: r2v1, types: [io.sentry.react.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.sentry.react.e] */
    public f(ReactApplicationContext reactApplicationContext, D d) {
        super(reactApplicationContext);
        this.b = new Y();
        this.a = reactApplicationContext;
        this.e = d;
        final int i = 0;
        this.c = new Runnable(this) { // from class: io.sentry.react.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.a("initialDisplay");
                        break;
                    default:
                        this.b.a("fullDisplay");
                        break;
                }
            }
        };
        final int i2 = 1;
        this.d = new Runnable(this) { // from class: io.sentry.react.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.a("initialDisplay");
                        break;
                    default:
                        this.b.a("fullDisplay");
                        break;
                }
            }
        };
    }

    public final void a(String str) {
        this.b.getClass();
        Date dateK = io.sentry.config.a.k();
        System.nanoTime();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", str);
        writableMapCreateMap.putDouble("newFrameTimestampInSeconds", (dateK.getTime() * 1000000) / 1.0E9d);
        ReactApplicationContext reactApplicationContext = this.a;
        if (reactApplicationContext == null) {
            f.k(EnumC5148n1.ERROR, "[TimeToDisplay] Recorded next frame draw but can't emit the event, reactContext is null.", new Object[0]);
        } else {
            ((RCTEventEmitter) reactApplicationContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onDrawNextFrameView", writableMapCreateMap);
        }
    }

    public final void b(Runnable runnable) {
        T t = f;
        if (runnable == null) {
            t.k(EnumC5148n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, emitter is null.", new Object[0]);
            return;
        }
        D d = this.e;
        if (d == null) {
            t.k(EnumC5148n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
            return;
        }
        ReactApplicationContext reactApplicationContext = this.a;
        if (reactApplicationContext == null) {
            t.k(EnumC5148n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
            return;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            t.k(EnumC5148n1.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
        } else {
            io.sentry.android.core.internal.util.f.a(currentActivity, runnable, d);
        }
    }

    public void setFullDisplay(boolean z) {
        if (z) {
            f.k(EnumC5148n1.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            b(this.d);
        }
    }

    public void setInitialDisplay(boolean z) {
        if (z) {
            f.k(EnumC5148n1.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            b(this.c);
        }
    }
}
