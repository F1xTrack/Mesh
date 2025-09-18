package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class P60 extends Thread {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC0053Al c;

    public P60(Context context, String str, InterfaceC0053Al interfaceC0053Al) {
        this.a = context;
        this.b = str;
        this.c = interfaceC0053Al;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new RQ(this.c, 11, C5806m12.a(this.a, this.b)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
