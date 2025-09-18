package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11076sm1;
import p000.AbstractServiceC8058Oi0;
import p000.C11204tm1;
import p000.C1210TE;
import p000.L71;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC8058Oi0 {

    /* renamed from: b */
    public L71 f16585b;

    /* renamed from: c */
    public boolean f16586c;

    static {
        C1210TE.m7637M("SystemAlarmService");
    }

    /* renamed from: a */
    public final void m10335a() {
        this.f16586c = true;
        C1210TE.m7634G().getClass();
        int i = AbstractC11076sm1.f42593a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C11204tm1.f43249a) {
            linkedHashMap.putAll(C11204tm1.f43250b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                C1210TE.m7634G().getClass();
            }
        }
        stopSelf();
    }

    @Override // p000.AbstractServiceC8058Oi0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        L71 l71 = new L71(this);
        this.f16585b = l71;
        if (l71.f6509i != null) {
            C1210TE.m7634G().getClass();
        } else {
            l71.f6509i = this;
        }
        this.f16586c = false;
    }

    @Override // p000.AbstractServiceC8058Oi0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16586c = true;
        L71 l71 = this.f16585b;
        l71.getClass();
        C1210TE.m7634G().getClass();
        l71.f6504d.m6262g(l71);
        l71.f6509i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f16586c) {
            C1210TE.m7634G().getClass();
            L71 l71 = this.f16585b;
            l71.getClass();
            C1210TE.m7634G().getClass();
            l71.f6504d.m6262g(l71);
            l71.f6509i = null;
            L71 l712 = new L71(this);
            this.f16585b = l712;
            if (l712.f6509i != null) {
                C1210TE.m7634G().getClass();
            } else {
                l712.f6509i = this;
            }
            this.f16586c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f16585b.m4903b(i2, intent);
        return 3;
    }
}
