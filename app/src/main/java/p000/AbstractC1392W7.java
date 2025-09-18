package p000;

import java.lang.ref.WeakReference;

/* renamed from: W7 */
/* loaded from: classes.dex */
public abstract class AbstractC1392W7 implements InterfaceC1266U7 {
    private final C1329V7 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private EnumC3909d8 currentAppState = EnumC3909d8.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<InterfaceC1266U7> appStateCallback = new WeakReference<>(this);

    public AbstractC1392W7(C1329V7 c1329v7) {
        this.appStateMonitor = c1329v7;
    }

    public EnumC3909d8 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<InterfaceC1266U7> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f12368h.addAndGet(i);
    }

    @Override // p000.InterfaceC1266U7
    public void onUpdateAppState(EnumC3909d8 enumC3909d8) {
        EnumC3909d8 enumC3909d82 = this.currentAppState;
        EnumC3909d8 enumC3909d83 = EnumC3909d8.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC3909d82 == enumC3909d83) {
            this.currentAppState = enumC3909d8;
        } else {
            if (enumC3909d82 == enumC3909d8 || enumC3909d8 == enumC3909d83) {
                return;
            }
            this.currentAppState = EnumC3909d8.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        C1329V7 c1329v7 = this.appStateMonitor;
        this.currentAppState = c1329v7.f12375o;
        c1329v7.m8300d(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            C1329V7 c1329v7 = this.appStateMonitor;
            WeakReference<InterfaceC1266U7> weakReference = this.appStateCallback;
            synchronized (c1329v7.f12366f) {
                c1329v7.f12366f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
