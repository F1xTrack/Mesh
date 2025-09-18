package com.facebook.react.devsupport;

import android.os.AsyncTask;
import defpackage.P80;
import defpackage.T71;
import defpackage.X40;

/* loaded from: classes.dex */
public final class c extends AsyncTask {
    public final /* synthetic */ T71 a;

    public c(T71 t71) {
        this.a = t71;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean fuseboxEnabled = InspectorFlags.getFuseboxEnabled();
        T71 t71 = this.a;
        if (fuseboxEnabled) {
            t71.d = new CxxInspectorPackagerConnection(T71.h(t71), (String) t71.c);
        } else {
            t71.d = new P80(T71.h(t71), (String) t71.c);
        }
        ((X40) t71.d).connect();
        return null;
    }
}
