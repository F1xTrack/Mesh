package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p000.AbstractC11770yD0;
import p000.C1236Te;
import p000.C8539Xo1;
import p000.C8575Yg1;
import p000.C8877bd1;
import p000.RunnableC0004A3;
import p000.RunnableC6234jO;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f18003a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C8877bd1.m10476b(context);
        C8539Xo1 c8539Xo1M7707a = C1236Te.m7707a();
        c8539Xo1M7707a.m9134Q(queryParameter);
        c8539Xo1M7707a.f13983d = AbstractC11770yD0.m26101b(iIntValue);
        if (queryParameter2 != null) {
            c8539Xo1M7707a.f13982c = Base64.decode(queryParameter2, 0);
        }
        C8575Yg1 c8575Yg1 = C8877bd1.m10475a().f17105d;
        C1236Te c1236TeM9144m = c8539Xo1M7707a.m9144m();
        RunnableC0004A3 runnableC0004A3 = new RunnableC0004A3(0);
        c8575Yg1.getClass();
        c8575Yg1.f14447e.execute(new RunnableC6234jO(c8575Yg1, c1236TeM9144m, i, runnableC0004A3));
    }
}
