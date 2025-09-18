package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Dz1 */
/* loaded from: classes.dex */
public class C7521Dz1 implements InterfaceC8663Zy1, InterfaceC7885Kz1 {

    /* renamed from: a */
    public final HashMap f2333a = new HashMap();

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: b */
    public final InterfaceC7885Kz1 mo1956b(String str) {
        HashMap map = this.f2333a;
        return map.containsKey(str) ? (InterfaceC7885Kz1) map.get(str) : InterfaceC7885Kz1.f6417i1;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: d */
    public final boolean mo1957d(String str) {
        return this.f2333a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7521Dz1) {
            return this.f2333a.equals(((C7521Dz1) obj).f2333a);
        }
        return false;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: h */
    public final void mo1958h(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        HashMap map = this.f2333a;
        if (interfaceC7885Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC7885Kz1);
        }
    }

    public final int hashCode() {
        return this.f2333a.hashCode();
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return new C10462nz1(this.f2333a.keySet().iterator());
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        return "toString".equals(str) ? new C8509Wz1(toString()) : M12.m5215c(this, new C8509Wz1(str), c10919rY0, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f2333a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(StringUtils.COMMA));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        C7521Dz1 c7521Dz1 = new C7521Dz1();
        for (Map.Entry entry : this.f2333a.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC8663Zy1;
            HashMap map = c7521Dz1.f2333a;
            if (z) {
                map.put((String) entry.getKey(), (InterfaceC7885Kz1) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC7885Kz1) entry.getValue()).zzc());
            }
        }
        return c7521Dz1;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        return "[object Object]";
    }
}
