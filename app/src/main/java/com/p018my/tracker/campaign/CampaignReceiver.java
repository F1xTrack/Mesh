package com.p018my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p018my.tracker.obfuscated.AbstractC2391y2;

/* loaded from: classes2.dex */
public class CampaignReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m12754a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("referrer");
        if (TextUtils.isEmpty(string)) {
            AbstractC2391y2.m13568a("CampaignReceiver: referrer is null or empty");
            return;
        }
        AbstractC2391y2.m13568a("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, (Class<?>) CampaignService.class).putExtra("referrer", string));
        } catch (Throwable th) {
            AbstractC2391y2.m13572b("CampaignReceiver error: " + th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m12754a(context, intent);
    }
}
