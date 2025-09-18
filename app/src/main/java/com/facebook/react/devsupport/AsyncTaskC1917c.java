package com.facebook.react.devsupport;

import android.os.AsyncTask;
import p000.P80;
import p000.T71;
import p000.X40;

/* renamed from: com.facebook.react.devsupport.c */
/* loaded from: classes.dex */
public final class AsyncTaskC1917c extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ T71 f17910a;

    public AsyncTaskC1917c(T71 t71) {
        this.f17910a = t71;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean fuseboxEnabled = InspectorFlags.getFuseboxEnabled();
        T71 t71 = this.f17910a;
        if (fuseboxEnabled) {
            t71.f11176d = new CxxInspectorPackagerConnection(T71.m7554h(t71), (String) t71.f11175c);
        } else {
            t71.f11176d = new P80(T71.m7554h(t71), (String) t71.f11175c);
        }
        ((X40) t71.f11176d).connect();
        return null;
    }
}
