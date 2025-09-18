package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yy1 */
/* loaded from: classes.dex */
public final class C11865yy1 implements InterfaceC7885Kz1 {

    /* renamed from: a */
    public final boolean f46562a;

    public C11865yy1(Boolean bool) {
        if (bool == null) {
            this.f46562a = false;
        } else {
            this.f46562a = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11865yy1) && this.f46562a == ((C11865yy1) obj).f46562a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f46562a).hashCode();
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f46562a;
        if (zEquals) {
            return new C8509Wz1(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.f46562a);
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return new C11865yy1(Boolean.valueOf(this.f46562a));
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        return Boolean.valueOf(this.f46562a);
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        return Double.valueOf(this.f46562a ? 1.0d : ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        return Boolean.toString(this.f46562a);
    }
}
