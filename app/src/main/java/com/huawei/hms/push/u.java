package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class u {
    private static final String[] c = {"url", "app", "cosa", "rp"};
    private Context a;
    private o b;

    public u(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b() throws URISyntaxException {
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.b.c() + ",and msg.intentUri is " + this.b.m());
            Intent intentB = e.b(this.a, this.b.c());
            boolean zBooleanValue = false;
            if (this.b.m() != null) {
                try {
                    Intent uri = Intent.parseUri(this.b.m(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = e.a(this.a, this.b.c(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (this.b.a() != null) {
                Intent intent = new Intent(this.b.a());
                if (e.a(this.a, this.b.c(), intent).booleanValue()) {
                    intentB = intent;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(this.b.c());
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            this.a.startActivity(intentB);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public void c() throws URISyntaxException {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.a == null || (oVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(oVar.h())) {
            a();
            return;
        }
        if ("cosa".equals(this.b.h())) {
            b();
            return;
        }
        if ("rp".equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support rich message.");
            return;
        }
        if ("url".equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", this.b.h() + " is not exist in hShowType");
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.c());
            if (e.c(this.a, this.b.c())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
