package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class P60 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ Context f8857a;

    /* renamed from: b */
    public final /* synthetic */ String f8858b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0048Al f8859c;

    public P60(Context context, String str, InterfaceC0048Al interfaceC0048Al) {
        this.f8857a = context;
        this.f8858b = str;
        this.f8859c = interfaceC0048Al;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new RunnableC1096RQ(this.f8859c, 11, C10212m12.m22627a(this.f8857a, this.f8858b)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
