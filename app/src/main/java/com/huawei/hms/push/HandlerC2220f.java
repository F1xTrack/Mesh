package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.huawei.hms.push.f */
/* loaded from: classes.dex */
public class HandlerC2220f extends Handler {

    /* renamed from: a */
    private WeakReference<a> f19418a;

    /* renamed from: com.huawei.hms.push.f$a */
    public interface a {
        /* renamed from: a */
        void mo12403a(Message message);
    }

    public HandlerC2220f(a aVar) {
        this.f19418a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f19418a.get();
        if (aVar != null) {
            aVar.mo12403a(message);
        }
    }
}
