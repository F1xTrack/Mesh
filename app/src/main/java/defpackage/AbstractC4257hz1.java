package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: hz1 */
/* loaded from: classes.dex */
public abstract class AbstractC4257hz1 implements InterfaceC2043Zy1, InterfaceC0877Kz1 {
    public final String a;
    public final HashMap b = new HashMap();

    public AbstractC4257hz1(String str) {
        this.a = str;
    }

    public abstract InterfaceC0877Kz1 a(C6860rY0 c6860rY0, List list);

    @Override // defpackage.InterfaceC2043Zy1
    public final InterfaceC0877Kz1 b(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (InterfaceC0877Kz1) map.get(str) : InterfaceC0877Kz1.i1;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final boolean d(String str) {
        return this.b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4257hz1)) {
            return false;
        }
        AbstractC4257hz1 abstractC4257hz1 = (AbstractC4257hz1) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(abstractC4257hz1.a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final void h(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        HashMap map = this.b;
        if (interfaceC0877Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0877Kz1);
        }
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return new C6179nz1(this.b.keySet().iterator());
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        return "toString".equals(str) ? new C1812Wz1(this.a) : M12.c(this, new C1812Wz1(str), c6860rY0, arrayList);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return this.a;
    }

    public InterfaceC0877Kz1 zzc() {
        return this;
    }
}
