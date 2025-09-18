package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* renamed from: com.huawei.hms.push.u */
/* loaded from: classes.dex */
public class C2235u {

    /* renamed from: c */
    private static final String[] f19476c = {"url", "app", "cosa", "rp"};

    /* renamed from: a */
    private Context f19477a;

    /* renamed from: b */
    private C2229o f19478b;

    public C2235u(Context context, C2229o c2229o) {
        this.f19477a = context;
        this.f19478b = c2229o;
    }

    /* renamed from: a */
    public static boolean m12530a(String str) {
        for (String str2 : f19476c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m12531b() throws URISyntaxException {
        HMSLog.m12622i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.m12622i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f19478b.m12490c() + ",and msg.intentUri is " + this.f19478b.m12500m());
            Intent intentM12441b = C2219e.m12441b(this.f19477a, this.f19478b.m12490c());
            boolean zBooleanValue = false;
            if (this.f19478b.m12500m() != null) {
                try {
                    Intent uri = Intent.parseUri(this.f19478b.m12500m(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.m12622i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = C2219e.m12438a(this.f19477a, this.f19478b.m12490c(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentM12441b = uri;
                    }
                } catch (Exception e) {
                    HMSLog.m12623w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (this.f19478b.m12487a() != null) {
                Intent intent = new Intent(this.f19478b.m12487a());
                if (C2219e.m12438a(this.f19477a, this.f19478b.m12490c(), intent).booleanValue()) {
                    intentM12441b = intent;
                }
            }
            if (intentM12441b == null) {
                HMSLog.m12622i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentM12441b.setPackage(this.f19478b.m12490c());
            if (zBooleanValue) {
                intentM12441b.addFlags(268435456);
            } else {
                intentM12441b.setFlags(805437440);
            }
            this.f19477a.startActivity(intentM12441b);
        } catch (Exception e2) {
            HMSLog.m12620e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    /* renamed from: c */
    public void m12532c() throws URISyntaxException {
        C2229o c2229o;
        HMSLog.m12617d("PushSelfShowLog", "enter launchNotify()");
        if (this.f19477a == null || (c2229o = this.f19478b) == null) {
            HMSLog.m12617d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(c2229o.m12495h())) {
            m12529a();
            return;
        }
        if ("cosa".equals(this.f19478b.m12495h())) {
            m12531b();
            return;
        }
        if ("rp".equals(this.f19478b.m12495h())) {
            HMSLog.m12623w("PushSelfShowLog", this.f19478b.m12495h() + " not support rich message.");
            return;
        }
        if ("url".equals(this.f19478b.m12495h())) {
            HMSLog.m12623w("PushSelfShowLog", this.f19478b.m12495h() + " not support URL.");
            return;
        }
        HMSLog.m12617d("PushSelfShowLog", this.f19478b.m12495h() + " is not exist in hShowType");
    }

    /* renamed from: a */
    private void m12529a() {
        try {
            HMSLog.m12622i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f19478b.m12490c());
            if (C2219e.m12444c(this.f19477a, this.f19478b.m12490c())) {
                m12531b();
            }
        } catch (Exception e) {
            HMSLog.m12620e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
