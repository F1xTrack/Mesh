package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sA1 */
/* loaded from: classes.dex */
public final class C6980sA1 implements InterfaceC0877Kz1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C6980sA1;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return InterfaceC0877Kz1.i1;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return StringUtils.UNDEFINED;
    }
}
