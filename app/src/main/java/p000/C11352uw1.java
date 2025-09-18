package p000;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: uw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11352uw1 extends AbstractRunnableC7877Kv1 {

    /* renamed from: b */
    public final /* synthetic */ byte[] f44030b;

    /* renamed from: c */
    public final /* synthetic */ Long f44031c;

    /* renamed from: d */
    public final /* synthetic */ S81 f44032d;

    /* renamed from: e */
    public final /* synthetic */ C7611Fs1 f44033e;

    /* renamed from: f */
    public final /* synthetic */ C11734xw1 f44034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11352uw1(C11734xw1 c11734xw1, S81 s81, byte[] bArr, Long l, S81 s812, C7611Fs1 c7611Fs1) {
        super(s81);
        this.f44034f = c11734xw1;
        this.f44030b = bArr;
        this.f44031c = l;
        this.f44032d = s812;
        this.f44033e = c7611Fs1;
    }

    @Override // p000.AbstractRunnableC7877Kv1
    /* renamed from: a */
    public final void mo4778a(Exception exc) {
        if (exc instanceof C7619Fw1) {
            super.mo4778a(new C10101l90(-9, exc));
        } else {
            super.mo4778a(exc);
        }
    }

    @Override // p000.AbstractRunnableC7877Kv1
    /* renamed from: b */
    public final void mo4779b() {
        S81 s81 = this.f44032d;
        C11734xw1 c11734xw1 = this.f44034f;
        try {
            c11734xw1.f45911c.f1779m.mo7127C(C11734xw1.m26008a(c11734xw1, this.f44030b, this.f44031c), new BinderC11480vw1(c11734xw1, s81));
        } catch (RemoteException e) {
            C7357Av1 c7357Av1 = c11734xw1.f45909a;
            Object[] objArr = {this.f44033e};
            if (Log.isLoggable("PlayCore", 6)) {
                C7357Av1.m408b(c7357Av1.f470a, "requestIntegrityToken(%s)", objArr);
            } else {
                c7357Av1.getClass();
            }
            s81.m7185c(new C10101l90(-100, e));
        }
    }
}
