package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import java.util.UUID;
import p000.AbstractServiceC8058Oi0;
import p000.C0178Cp;
import p000.C1210TE;
import p000.C7863Ko1;
import p000.N71;
import p000.RunnableC1420WZ;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC8058Oi0 {

    /* renamed from: f */
    public static final /* synthetic */ int f16590f = 0;

    /* renamed from: b */
    public Handler f16591b;

    /* renamed from: c */
    public boolean f16592c;

    /* renamed from: d */
    public N71 f16593d;

    /* renamed from: e */
    public NotificationManager f16594e;

    static {
        C1210TE.m7637M("SystemFgService");
    }

    /* renamed from: a */
    public final void m10337a() {
        this.f16591b = new Handler(Looper.getMainLooper());
        this.f16594e = (NotificationManager) getApplicationContext().getSystemService("notification");
        N71 n71 = new N71(getApplicationContext());
        this.f16593d = n71;
        if (n71.f7520i != null) {
            C1210TE.m7634G().getClass();
        } else {
            n71.f7520i = this;
        }
    }

    @Override // p000.AbstractServiceC8058Oi0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m10337a();
    }

    @Override // p000.AbstractServiceC8058Oi0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16593d.m5553g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f16592c) {
            C1210TE.m7634G().getClass();
            this.f16593d.m5553g();
            m10337a();
            this.f16592c = false;
        }
        if (intent == null) {
            return 3;
        }
        N71 n71 = this.f16593d;
        n71.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            Objects.toString(intent);
            c1210teM7634G.getClass();
            n71.f7513b.m9154x(new RunnableC1420WZ(n71, intent.getStringExtra("KEY_WORKSPEC_ID"), false, 16));
            n71.m5551e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            n71.m5551e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C1210TE.m7634G().getClass();
            SystemForegroundService systemForegroundService = n71.f7520i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f16592c = true;
            C1210TE.m7634G().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        C1210TE c1210teM7634G2 = C1210TE.m7634G();
        Objects.toString(intent);
        c1210teM7634G2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        C7863Ko1 c7863Ko1 = n71.f7512a;
        c7863Ko1.getClass();
        c7863Ko1.f6317d.m9154x(new C0178Cp(c7863Ko1, uuidFromString));
        return 3;
    }
}
