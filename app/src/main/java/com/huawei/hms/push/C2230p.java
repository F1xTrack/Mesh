package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* renamed from: com.huawei.hms.push.p */
/* loaded from: classes.dex */
public class C2230p extends Thread {

    /* renamed from: a */
    private Context f19461a;

    /* renamed from: b */
    private C2229o f19462b;

    public C2230p(Context context, C2229o c2229o) {
        this.f19461a = context;
        this.f19462b = c2229o;
    }

    /* renamed from: a */
    private static Intent m12511a(Context context, C2229o c2229o) throws URISyntaxException {
        if (c2229o == null) {
            return null;
        }
        Intent intentM12441b = C2219e.m12441b(context, c2229o.m12490c());
        if (c2229o.m12500m() == null) {
            if (c2229o.m12487a() != null) {
                Intent intent = new Intent(c2229o.m12487a());
                if (C2219e.m12438a(context, c2229o.m12490c(), intent).booleanValue()) {
                    intentM12441b = intent;
                }
            }
            intentM12441b.setPackage(c2229o.m12490c());
            return intentM12441b;
        }
        try {
            Intent uri = Intent.parseUri(c2229o.m12500m(), 0);
            uri.setSelector(null);
            if (uri.getClipData() == null) {
                uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
            }
            HMSLog.m12617d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
            return C2219e.m12438a(context, c2229o.m12490c(), uri).booleanValue() ? uri : intentM12441b;
        } catch (Exception e) {
            HMSLog.m12623w("PushSelfShowLog", "intentUri error," + e.toString());
            return intentM12441b;
        }
    }

    /* renamed from: b */
    private boolean m12513b(Context context) {
        if ("cosa".equals(this.f19462b.m12495h())) {
            return m12512a(context);
        }
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.m12622i("PushSelfShowLog", "enter run()");
        try {
            if (!m12513b(this.f19461a) || m12514b(this.f19461a, this.f19462b)) {
                return;
            }
            C2228n.m12462a(this.f19461a, this.f19462b);
        } catch (Exception e) {
            HMSLog.m12620e("PushSelfShowLog", e.toString());
        }
    }

    /* renamed from: b */
    private boolean m12514b(Context context, C2229o c2229o) {
        if (!"cosa".equals(c2229o.m12495h()) || m12511a(context, c2229o) != null) {
            return false;
        }
        HMSLog.m12617d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    /* renamed from: a */
    private boolean m12512a(Context context) {
        return C2219e.m12444c(context, this.f19462b.m12490c());
    }
}
