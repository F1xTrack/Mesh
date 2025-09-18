package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sA1 */
/* loaded from: classes.dex */
public final class C11000sA1 implements InterfaceC7885Kz1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C11000sA1;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return InterfaceC7885Kz1.f6417i1;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        return StringUtils.UNDEFINED;
    }
}
