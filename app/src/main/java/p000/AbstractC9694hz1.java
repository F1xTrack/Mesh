package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: hz1 */
/* loaded from: classes.dex */
public abstract class AbstractC9694hz1 implements InterfaceC8663Zy1, InterfaceC7885Kz1 {

    /* renamed from: a */
    public final String f28710a;

    /* renamed from: b */
    public final HashMap f28711b = new HashMap();

    public AbstractC9694hz1(String str) {
        this.f28710a = str;
    }

    /* renamed from: a */
    public abstract InterfaceC7885Kz1 mo6842a(C10919rY0 c10919rY0, List list);

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: b */
    public final InterfaceC7885Kz1 mo1956b(String str) {
        HashMap map = this.f28711b;
        return map.containsKey(str) ? (InterfaceC7885Kz1) map.get(str) : InterfaceC7885Kz1.f6417i1;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: d */
    public final boolean mo1957d(String str) {
        return this.f28711b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC9694hz1)) {
            return false;
        }
        AbstractC9694hz1 abstractC9694hz1 = (AbstractC9694hz1) obj;
        String str = this.f28710a;
        if (str != null) {
            return str.equals(abstractC9694hz1.f28710a);
        }
        return false;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: h */
    public final void mo1958h(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        HashMap map = this.f28711b;
        if (interfaceC7885Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC7885Kz1);
        }
    }

    public final int hashCode() {
        String str = this.f28710a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return new C10462nz1(this.f28711b.keySet().iterator());
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        return "toString".equals(str) ? new C8509Wz1(this.f28710a) : M12.m5215c(this, new C8509Wz1(str), c10919rY0, arrayList);
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
        return this.f28710a;
    }

    public InterfaceC7885Kz1 zzc() {
        return this;
    }
}
