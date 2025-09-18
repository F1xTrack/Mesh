package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class W7 implements U7 {
    private final V7 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private EnumC3333d8 currentAppState = EnumC3333d8.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<U7> appStateCallback = new WeakReference<>(this);

    public W7(V7 v7) {
        this.appStateMonitor = v7;
    }

    public EnumC3333d8 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<U7> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.h.addAndGet(i);
    }

    @Override // defpackage.U7
    public void onUpdateAppState(EnumC3333d8 enumC3333d8) {
        EnumC3333d8 enumC3333d82 = this.currentAppState;
        EnumC3333d8 enumC3333d83 = EnumC3333d8.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC3333d82 == enumC3333d83) {
            this.currentAppState = enumC3333d8;
        } else {
            if (enumC3333d82 == enumC3333d8 || enumC3333d8 == enumC3333d83) {
                return;
            }
            this.currentAppState = EnumC3333d8.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        V7 v7 = this.appStateMonitor;
        this.currentAppState = v7.o;
        v7.d(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            V7 v7 = this.appStateMonitor;
            WeakReference<U7> weakReference = this.appStateCallback;
            synchronized (v7.f) {
                v7.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
