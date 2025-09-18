package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.q0;
import com.my.tracker.obfuscated.y2;
import defpackage.G4;
import defpackage.RunnableC1557Ts1;

/* loaded from: classes2.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        y2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        y2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        G4 g4 = new G4(17, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                m.a(new RunnableC1557Ts1(this, stringExtra, g4, 11));
                return super.onStartCommand(null, i, i2);
            }
        }
        m.a(g4);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        q0.a(str, this, runnable);
    }
}
