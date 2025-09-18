package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import p000.C10925rb0;
import p000.InterfaceC10413nb0;
import p000.InterfaceC1839cJ;
import p000.InterfaceC9101dL0;
import p000.MJ0;
import p000.N20;

@InterfaceC9101dL0(name = NativeTimingSpec.NAME)
/* loaded from: classes.dex */
public final class TimingModule extends NativeTimingSpec implements InterfaceC10413nb0 {
    private final JavaTimerManager mJavaTimerManager;

    public TimingModule(ReactApplicationContext reactApplicationContext, InterfaceC1839cJ interfaceC1839cJ) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new JavaTimerManager(reactApplicationContext, this, MJ0.m5303a(), interfaceC1839cJ);
    }

    @Override // p000.InterfaceC10413nb0
    public void callIdleCallbacks(double d) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d);
        }
    }

    @Override // p000.InterfaceC10413nb0
    public void callTimers(WritableArray writableArray) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d, double d2, double d3, boolean z) {
        int i = (int) d;
        int i2 = (int) d2;
        JavaTimerManager javaTimerManager = this.mJavaTimerManager;
        javaTimerManager.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        javaTimerManager.f17926d.getClass();
        long jMax = Math.max(0L, (((long) d3) - jCurrentTimeMillis) + i2);
        if (i2 != 0 || z) {
            javaTimerManager.createTimer(i, jMax, z);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        javaTimerManager.f17924b.callTimers(writableArrayCreateArray);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d) {
        this.mJavaTimerManager.deleteTimer((int) d);
    }

    public void emitTimeDriftWarning(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
        }
    }

    public boolean hasActiveTimersInRange(long j) {
        JavaTimerManager javaTimerManager = this.mJavaTimerManager;
        synchronized (javaTimerManager.f17927e) {
            try {
                C10925rb0 c10925rb0 = (C10925rb0) javaTimerManager.f17929g.peek();
                if (c10925rb0 == null) {
                    return false;
                }
                if (!(!c10925rb0.f41742b && ((long) c10925rb0.f41743c) < j)) {
                    Iterator it = javaTimerManager.f17929g.iterator();
                    while (it.hasNext()) {
                        C10925rb0 c10925rb02 = (C10925rb0) it.next();
                        if (!c10925rb02.f41742b && ((long) c10925rb02.f41743c) < j) {
                        }
                    }
                    return false;
                }
                return true;
            } finally {
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        N20.m5523c(getReactApplicationContext()).m5524a(this.mJavaTimerManager);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        N20 n20M5523c = N20.m5523c(getReactApplicationContext());
        n20M5523c.f7470b.remove(this.mJavaTimerManager);
        JavaTimerManager javaTimerManager = this.mJavaTimerManager;
        javaTimerManager.f17923a.removeLifecycleEventListener(javaTimerManager);
        javaTimerManager.m11005a();
        if (javaTimerManager.f17937o) {
            javaTimerManager.f17925c.m5306d(5, javaTimerManager.f17934l);
            javaTimerManager.f17937o = false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.setSendIdleEvents(z);
    }
}
