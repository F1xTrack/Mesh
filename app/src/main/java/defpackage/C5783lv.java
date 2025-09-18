package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: lv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5783lv {
    public final Object a;
    public final InterfaceC0143Bp b;
    public final InterfaceC6481pZ c;
    public final Object d;
    public final Throwable e;

    public C5783lv(Object obj, InterfaceC0143Bp interfaceC0143Bp, InterfaceC6481pZ interfaceC6481pZ, Object obj2, Throwable th) {
        this.a = obj;
        this.b = interfaceC0143Bp;
        this.c = interfaceC6481pZ;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C5783lv a(C5783lv c5783lv, InterfaceC0143Bp interfaceC0143Bp, CancellationException cancellationException, int i) {
        Object obj = c5783lv.a;
        if ((i & 2) != 0) {
            interfaceC0143Bp = c5783lv.b;
        }
        InterfaceC0143Bp interfaceC0143Bp2 = interfaceC0143Bp;
        InterfaceC6481pZ interfaceC6481pZ = c5783lv.c;
        Object obj2 = c5783lv.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c5783lv.e;
        }
        c5783lv.getClass();
        return new C5783lv(obj, interfaceC0143Bp2, interfaceC6481pZ, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5783lv)) {
            return false;
        }
        C5783lv c5783lv = (C5783lv) obj;
        return O90.a(this.a, c5783lv.a) && O90.a(this.b, c5783lv.b) && O90.a(this.c, c5783lv.c) && O90.a(this.d, c5783lv.d) && O90.a(this.e, c5783lv.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0143Bp interfaceC0143Bp = this.b;
        int iHashCode2 = (iHashCode + (interfaceC0143Bp == null ? 0 : interfaceC0143Bp.hashCode())) * 31;
        InterfaceC6481pZ interfaceC6481pZ = this.c;
        int iHashCode3 = (iHashCode2 + (interfaceC6481pZ == null ? 0 : interfaceC6481pZ.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C5783lv(Object obj, InterfaceC0143Bp interfaceC0143Bp, InterfaceC6481pZ interfaceC6481pZ, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0143Bp, (i & 4) != 0 ? null : interfaceC6481pZ, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
