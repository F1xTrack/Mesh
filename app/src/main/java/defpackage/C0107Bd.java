package defpackage;

import java.util.HashMap;

/* renamed from: Bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107Bd {
    public String a;
    public Integer b;
    public ZN c;
    public Long d;
    public Long e;
    public HashMap f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;

    public final void a(String str, String str2) {
        HashMap map = this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final C0185Cd b() {
        String strI = this.a == null ? " transportName" : "";
        if (this.c == null) {
            strI = strI.concat(" encodedPayload");
        }
        if (this.d == null) {
            strI = AbstractC8235ym.i(strI, " eventMillis");
        }
        if (this.e == null) {
            strI = AbstractC8235ym.i(strI, " uptimeMillis");
        }
        if (this.f == null) {
            strI = AbstractC8235ym.i(strI, " autoMetadata");
        }
        if (strI.isEmpty()) {
            return new C0185Cd(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }
}
