package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yz1 */
/* loaded from: classes.dex */
public final class C11867yz1 implements InterfaceC7885Kz1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C11867yz1;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return InterfaceC7885Kz1.f6418j1;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        return "null";
    }
}
