package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;
import defpackage.AbstractC7096sn0;
import defpackage.O90;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Qb {
    private final W0 a;

    public static final class a {
        private final boolean a;
        private final int b;
        private final int c;
        private final String d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        public final String a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final boolean d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && O90.a(this.d, aVar.d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((((r0 * 31) + this.b) * 31) + this.c) * 31;
            String str = this.d;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RequestReport(success=");
            sb.append(this.a);
            sb.append(", httpStatus=");
            sb.append(this.b);
            sb.append(", size=");
            sb.append(this.c);
            sb.append(", failureReason=");
            return AbstractC1705Vq.l(sb, this.d, ")");
        }

        public a(boolean z, int i, int i2, String str) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        public /* synthetic */ a(boolean z, int i, int i2, String str, int i3) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str);
        }
    }

    public Qb(C3131ui c3131ui, W0 w0) {
        this.a = c3131ui.e() ? w0 : null;
    }

    public final void a(a aVar) {
        W0 w0 = this.a;
        if (w0 != null) {
            LinkedHashMap linkedHashMapI = AbstractC7096sn0.i(new Pair("status", aVar.d() ? "OK" : "FAILED"), new Pair("http_status", Integer.valueOf(aVar.b())), new Pair("size", Integer.valueOf(aVar.c())));
            String strA = aVar.a();
            if (strA != null) {
                linkedHashMapI.put("reason", strA);
            }
            w0.reportEvent("egress_status", AbstractC7096sn0.o(linkedHashMapI));
        }
    }

    public final void a() {
        W0 w0 = this.a;
        if (w0 != null) {
            w0.d("egress_diagnostics", "Unable to open url connection, check config url.");
        }
    }
}
