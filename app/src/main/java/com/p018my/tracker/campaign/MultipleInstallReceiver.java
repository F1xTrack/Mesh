package com.p018my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.p018my.tracker.obfuscated.AbstractC2391y2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f19697a = CampaignReceiver.class.getName();

    /* renamed from: b */
    private static final String f19698b = MultipleInstallReceiver.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f19699c = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            return;
        }
        if (!f19699c.compareAndSet(false, true)) {
            AbstractC2391y2.m13568a("MultipleInstallReceiver: attempt to call, but it was called before");
            return;
        }
        AbstractC2391y2.m13568a("MultipleInstallReceiver called");
        CampaignReceiver.m12754a(context, intent);
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                String str = activityInfo.name;
                if (!f19697a.equals(str) && !f19698b.equals(str)) {
                    AbstractC2391y2.m13568a("MultipleInstallReceiver: trigger onReceive class " + str);
                    try {
                        ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                    } catch (Throwable th) {
                        StringBuilder sbM26240q = AbstractC7222ym.m26240q("MultipleInstallReceiver: error in BroadcastReceiver ", str, " : ");
                        sbM26240q.append(th.getMessage());
                        AbstractC2391y2.m13568a(sbM26240q.toString());
                    }
                }
            }
        }
    }
}
