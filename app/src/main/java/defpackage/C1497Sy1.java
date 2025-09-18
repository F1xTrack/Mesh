package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Sy1 */
/* loaded from: classes.dex */
public final class C1497Sy1 implements InterfaceC0877Kz1 {
    public final InterfaceC0877Kz1 a;
    public final String b;

    public C1497Sy1(String str) {
        this.a = InterfaceC0877Kz1.i1;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1497Sy1)) {
            return false;
        }
        C1497Sy1 c1497Sy1 = (C1497Sy1) obj;
        return this.b.equals(c1497Sy1.b) && this.a.equals(c1497Sy1.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return new C1497Sy1(this.b, this.a.zzc());
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    public C1497Sy1(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        this.a = interfaceC0877Kz1;
        this.b = str;
    }
}
