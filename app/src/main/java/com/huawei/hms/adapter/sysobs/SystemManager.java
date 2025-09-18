package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class SystemManager {

    /* renamed from: a */
    private static SystemManager f18766a = new SystemManager();

    /* renamed from: b */
    private static final Object f18767b = new Object();

    /* renamed from: c */
    private static SystemNotifier f18768c = new C2026a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f18766a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f18768c;
    }

    public void notifyNoticeResult(int i) {
        f18768c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f18768c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        f18768c.notifyObservers(i);
    }

    /* renamed from: com.huawei.hms.adapter.sysobs.SystemManager$a */
    public class C2026a implements SystemNotifier {

        /* renamed from: a */
        private final List<SystemObserver> f18769a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.f18767b) {
                try {
                    Iterator<SystemObserver> it = this.f18769a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f18767b) {
                try {
                    Iterator<SystemObserver> it = this.f18769a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f18769a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f18767b) {
                this.f18769a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f18767b) {
                this.f18769a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.f18767b) {
                try {
                    Iterator<SystemObserver> it = this.f18769a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
