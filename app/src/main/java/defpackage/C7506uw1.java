package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: uw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7506uw1 extends AbstractRunnableC0865Kv1 {
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ S81 d;
    public final /* synthetic */ C0466Fs1 e;
    public final /* synthetic */ C8077xw1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7506uw1(C8077xw1 c8077xw1, S81 s81, byte[] bArr, Long l, S81 s812, C0466Fs1 c0466Fs1) {
        super(s81);
        this.f = c8077xw1;
        this.b = bArr;
        this.c = l;
        this.d = s812;
        this.e = c0466Fs1;
    }

    @Override // defpackage.AbstractRunnableC0865Kv1
    public final void a(Exception exc) {
        if (exc instanceof C0478Fw1) {
            super.a(new C5640l90(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.AbstractRunnableC0865Kv1
    public final void b() {
        S81 s81 = this.d;
        C8077xw1 c8077xw1 = this.f;
        try {
            c8077xw1.c.m.C(C8077xw1.a(c8077xw1, this.b, this.c), new BinderC7697vw1(c8077xw1, s81));
        } catch (RemoteException e) {
            C0085Av1 c0085Av1 = c8077xw1.a;
            Object[] objArr = {this.e};
            if (Log.isLoggable("PlayCore", 6)) {
                C0085Av1.b(c0085Av1.a, "requestIntegrityToken(%s)", objArr);
            } else {
                c0085Av1.getClass();
            }
            s81.c(new C5640l90(-100, e));
        }
    }
}
