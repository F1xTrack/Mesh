package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Dz1 */
/* loaded from: classes.dex */
public class C0331Dz1 implements InterfaceC2043Zy1, InterfaceC0877Kz1 {
    public final HashMap a = new HashMap();

    @Override // defpackage.InterfaceC2043Zy1
    public final InterfaceC0877Kz1 b(String str) {
        HashMap map = this.a;
        return map.containsKey(str) ? (InterfaceC0877Kz1) map.get(str) : InterfaceC0877Kz1.i1;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final boolean d(String str) {
        return this.a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0331Dz1) {
            return this.a.equals(((C0331Dz1) obj).a);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final void h(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        HashMap map = this.a;
        if (interfaceC0877Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0877Kz1);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return new C6179nz1(this.a.keySet().iterator());
    }

    @Override // defpackage.InterfaceC0877Kz1
    public InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        return "toString".equals(str) ? new C1812Wz1(toString()) : M12.c(this, new C1812Wz1(str), c6860rY0, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(StringUtils.COMMA));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        C0331Dz1 c0331Dz1 = new C0331Dz1();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC2043Zy1;
            HashMap map = c0331Dz1.a;
            if (z) {
                map.put((String) entry.getKey(), (InterfaceC0877Kz1) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC0877Kz1) entry.getValue()).zzc());
            }
        }
        return c0331Dz1;
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
        return "[object Object]";
    }
}
