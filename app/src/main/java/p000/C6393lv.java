package p000;

import java.util.concurrent.CancellationException;

/* renamed from: lv */
/* loaded from: classes2.dex */
public final class C6393lv {

    /* renamed from: a */
    public final Object f37357a;

    /* renamed from: b */
    public final InterfaceC0115Bp f37358b;

    /* renamed from: c */
    public final InterfaceC6625pZ f37359c;

    /* renamed from: d */
    public final Object f37360d;

    /* renamed from: e */
    public final Throwable f37361e;

    public C6393lv(Object obj, InterfaceC0115Bp interfaceC0115Bp, InterfaceC6625pZ interfaceC6625pZ, Object obj2, Throwable th) {
        this.f37357a = obj;
        this.f37358b = interfaceC0115Bp;
        this.f37359c = interfaceC6625pZ;
        this.f37360d = obj2;
        this.f37361e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* renamed from: a */
    public static C6393lv m22598a(C6393lv c6393lv, InterfaceC0115Bp interfaceC0115Bp, CancellationException cancellationException, int i) {
        Object obj = c6393lv.f37357a;
        if ((i & 2) != 0) {
            interfaceC0115Bp = c6393lv.f37358b;
        }
        InterfaceC0115Bp interfaceC0115Bp2 = interfaceC0115Bp;
        InterfaceC6625pZ interfaceC6625pZ = c6393lv.f37359c;
        Object obj2 = c6393lv.f37360d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c6393lv.f37361e;
        }
        c6393lv.getClass();
        return new C6393lv(obj, interfaceC0115Bp2, interfaceC6625pZ, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6393lv)) {
            return false;
        }
        C6393lv c6393lv = (C6393lv) obj;
        return O90.m5963a(this.f37357a, c6393lv.f37357a) && O90.m5963a(this.f37358b, c6393lv.f37358b) && O90.m5963a(this.f37359c, c6393lv.f37359c) && O90.m5963a(this.f37360d, c6393lv.f37360d) && O90.m5963a(this.f37361e, c6393lv.f37361e);
    }

    public final int hashCode() {
        Object obj = this.f37357a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0115Bp interfaceC0115Bp = this.f37358b;
        int iHashCode2 = (iHashCode + (interfaceC0115Bp == null ? 0 : interfaceC0115Bp.hashCode())) * 31;
        InterfaceC6625pZ interfaceC6625pZ = this.f37359c;
        int iHashCode3 = (iHashCode2 + (interfaceC6625pZ == null ? 0 : interfaceC6625pZ.hashCode())) * 31;
        Object obj2 = this.f37360d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f37361e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f37357a + ", cancelHandler=" + this.f37358b + ", onCancellation=" + this.f37359c + ", idempotentResume=" + this.f37360d + ", cancelCause=" + this.f37361e + ')';
    }

    public /* synthetic */ C6393lv(Object obj, InterfaceC0115Bp interfaceC0115Bp, InterfaceC6625pZ interfaceC6625pZ, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0115Bp, (i & 4) != 0 ? null : interfaceC6625pZ, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
