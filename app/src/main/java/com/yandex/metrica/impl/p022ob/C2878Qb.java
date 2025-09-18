package com.yandex.metrica.impl.p022ob;

import java.util.LinkedHashMap;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.AbstractC1374Vq;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Qb */
/* loaded from: classes2.dex */
public final class C2878Qb {

    /* renamed from: a */
    private final InterfaceC3016W0 f22001a;

    /* renamed from: com.yandex.metrica.impl.ob.Qb$a */
    public static final class a {

        /* renamed from: a */
        private final boolean f22002a;

        /* renamed from: b */
        private final int f22003b;

        /* renamed from: c */
        private final int f22004c;

        /* renamed from: d */
        private final String f22005d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        /* renamed from: a */
        public final String m14842a() {
            return this.f22005d;
        }

        /* renamed from: b */
        public final int m14843b() {
            return this.f22003b;
        }

        /* renamed from: c */
        public final int m14844c() {
            return this.f22004c;
        }

        /* renamed from: d */
        public final boolean m14845d() {
            return this.f22002a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22002a == aVar.f22002a && this.f22003b == aVar.f22003b && this.f22004c == aVar.f22004c && O90.m5963a(this.f22005d, aVar.f22005d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.f22002a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((((r0 * 31) + this.f22003b) * 31) + this.f22004c) * 31;
            String str = this.f22005d;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RequestReport(success=");
            sb.append(this.f22002a);
            sb.append(", httpStatus=");
            sb.append(this.f22003b);
            sb.append(", size=");
            sb.append(this.f22004c);
            sb.append(", failureReason=");
            return AbstractC1374Vq.m8593l(sb, this.f22005d, ")");
        }

        public a(boolean z, int i, int i2, String str) {
            this.f22002a = z;
            this.f22003b = i;
            this.f22004c = i2;
            this.f22005d = str;
        }

        public /* synthetic */ a(boolean z, int i, int i2, String str, int i3) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str);
        }
    }

    public C2878Qb(C3654ui c3654ui, InterfaceC3016W0 interfaceC3016W0) {
        this.f22001a = c3654ui.m16929e() ? interfaceC3016W0 : null;
    }

    /* renamed from: a */
    public final void m14841a(a aVar) {
        InterfaceC3016W0 interfaceC3016W0 = this.f22001a;
        if (interfaceC3016W0 != null) {
            LinkedHashMap linkedHashMapM24781i = AbstractC11077sn0.m24781i(new Pair("status", aVar.m14845d() ? "OK" : "FAILED"), new Pair("http_status", Integer.valueOf(aVar.m14843b())), new Pair("size", Integer.valueOf(aVar.m14844c())));
            String strM14842a = aVar.m14842a();
            if (strM14842a != null) {
                linkedHashMapM24781i.put("reason", strM14842a);
            }
            interfaceC3016W0.reportEvent("egress_status", AbstractC11077sn0.m24787o(linkedHashMapM24781i));
        }
    }

    /* renamed from: a */
    public final void m14840a() {
        InterfaceC3016W0 interfaceC3016W0 = this.f22001a;
        if (interfaceC3016W0 != null) {
            interfaceC3016W0.mo13935d("egress_diagnostics", "Unable to open url connection, check config url.");
        }
    }
}
