package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Sy1 */
/* loaded from: classes.dex */
public final class C8299Sy1 implements InterfaceC7885Kz1 {

    /* renamed from: a */
    public final InterfaceC7885Kz1 f11083a;

    /* renamed from: b */
    public final String f11084b;

    public C8299Sy1(String str) {
        this.f11083a = InterfaceC7885Kz1.f6417i1;
        this.f11084b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8299Sy1)) {
            return false;
        }
        C8299Sy1 c8299Sy1 = (C8299Sy1) obj;
        return this.f11084b.equals(c8299Sy1.f11084b) && this.f11083a.equals(c8299Sy1.f11083a);
    }

    public final int hashCode() {
        return this.f11083a.hashCode() + (this.f11084b.hashCode() * 31);
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return new C8299Sy1(this.f11084b, this.f11083a.zzc());
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    public C8299Sy1(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        this.f11083a = interfaceC7885Kz1;
        this.f11084b = str;
    }
}
