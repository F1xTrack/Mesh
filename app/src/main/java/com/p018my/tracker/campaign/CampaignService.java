package com.p018my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p018my.tracker.obfuscated.AbstractC2340m;
import com.p018my.tracker.obfuscated.AbstractC2391y2;
import com.p018my.tracker.obfuscated.C2357q0;
import p000.RunnableC0383G4;
import p000.RunnableC8339Ts1;

/* loaded from: classes2.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC2391y2.m13568a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AbstractC2391y2.m13568a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        RunnableC0383G4 runnableC0383G4 = new RunnableC0383G4(17, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                AbstractC2340m.m13290a(new RunnableC8339Ts1(this, stringExtra, runnableC0383G4, 11));
                return super.onStartCommand(null, i, i2);
            }
        }
        AbstractC2340m.m13290a(runnableC0383G4);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12756a(String str, Runnable runnable) {
        C2357q0.m13395a(str, this, runnable);
    }
}
