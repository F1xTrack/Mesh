package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yz1 */
/* loaded from: classes.dex */
public final class C8276yz1 implements InterfaceC0877Kz1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C8276yz1;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return InterfaceC0877Kz1.j1;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return "null";
    }
}
