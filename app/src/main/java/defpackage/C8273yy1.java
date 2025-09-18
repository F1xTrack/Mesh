package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yy1 */
/* loaded from: classes.dex */
public final class C8273yy1 implements InterfaceC0877Kz1 {
    public final boolean a;

    public C8273yy1(Boolean bool) {
        if (bool == null) {
            this.a = false;
        } else {
            this.a = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8273yy1) && this.a == ((C8273yy1) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new C1812Wz1(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return new C8273yy1(Boolean.valueOf(this.a));
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        return Double.valueOf(this.a ? 1.0d : ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return Boolean.toString(this.a);
    }
}
