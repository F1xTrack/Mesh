package p000;

import java.util.HashMap;

/* renamed from: Bd */
/* loaded from: classes.dex */
public final class C0103Bd {

    /* renamed from: a */
    public String f942a;

    /* renamed from: b */
    public Integer f943b;

    /* renamed from: c */
    public C1597ZN f944c;

    /* renamed from: d */
    public Long f945d;

    /* renamed from: e */
    public Long f946e;

    /* renamed from: f */
    public HashMap f947f;

    /* renamed from: g */
    public Integer f948g;

    /* renamed from: h */
    public String f949h;

    /* renamed from: i */
    public byte[] f950i;

    /* renamed from: j */
    public byte[] f951j;

    /* renamed from: a */
    public final void m778a(String str, String str2) {
        HashMap map = this.f947f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public final C0166Cd m779b() {
        String strM26232i = this.f942a == null ? " transportName" : "";
        if (this.f944c == null) {
            strM26232i = strM26232i.concat(" encodedPayload");
        }
        if (this.f945d == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " eventMillis");
        }
        if (this.f946e == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " uptimeMillis");
        }
        if (this.f947f == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " autoMetadata");
        }
        if (strM26232i.isEmpty()) {
            return new C0166Cd(this.f942a, this.f943b, this.f944c, this.f945d.longValue(), this.f946e.longValue(), this.f947f, this.f948g, this.f949h, this.f950i, this.f951j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }
}
