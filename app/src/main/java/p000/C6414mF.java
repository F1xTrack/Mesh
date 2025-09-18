package p000;

import android.os.Handler;

/* renamed from: mF */
/* loaded from: classes.dex */
public final class C6414mF implements InterfaceC1029QL {

    /* renamed from: a */
    public final C0903OL f37585a;

    /* renamed from: b */
    public InterfaceC0715LL f37586b;

    /* renamed from: c */
    public boolean f37587c;

    /* renamed from: d */
    public final /* synthetic */ C6477nF f37588d;

    public C6414mF(C6477nF c6477nF, C0903OL c0903ol) {
        this.f37588d = c6477nF;
        this.f37585a = c0903ol;
    }

    @Override // p000.InterfaceC1029QL
    public final void release() {
        Handler handler = this.f37588d.f38211t;
        handler.getClass();
        AbstractC7485Dh1.m1806U(handler, new RunnableC0204DE(1, this));
    }
}
