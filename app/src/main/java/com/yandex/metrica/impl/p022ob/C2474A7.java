package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.A7 */
/* loaded from: classes2.dex */
public class C2474A7 implements InterfaceC3230ea<C3357j7, C2782Mf> {

    /* renamed from: a */
    private final C2574E7 f20835a;

    /* renamed from: b */
    private final C3565r7 f20836b;

    /* renamed from: c */
    private final C3617t7 f20837c;

    /* renamed from: d */
    private final C2499B7 f20838d;

    /* renamed from: e */
    private final C3747y7 f20839e;

    /* renamed from: f */
    private final C3773z7 f20840f;

    public C2474A7() {
        this(new C2574E7(), new C3565r7(new C2549D7()), new C3617t7(), new C2499B7(), new C3747y7(), new C3773z7());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3357j7 mo13846a(C2782Mf c2782Mf) {
        throw new UnsupportedOperationException();
    }

    public C2474A7(C2574E7 c2574e7, C3565r7 c3565r7, C3617t7 c3617t7, C2499B7 c2499b7, C3747y7 c3747y7, C3773z7 c3773z7) {
        this.f20835a = c2574e7;
        this.f20836b = c3565r7;
        this.f20837c = c3617t7;
        this.f20838d = c2499b7;
        this.f20839e = c3747y7;
        this.f20840f = c3773z7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2782Mf mo13847b(C3357j7 c3357j7) {
        C2782Mf c2782Mf = new C2782Mf();
        String str = c3357j7.f23705a;
        String str2 = c2782Mf.f21744g;
        if (str == null) {
            str = str2;
        }
        c2782Mf.f21744g = str;
        C3513p7 c3513p7 = c3357j7.f23706b;
        if (c3513p7 != null) {
            C3461n7 c3461n7 = c3513p7.f24427a;
            if (c3461n7 != null) {
                c2782Mf.f21739b = this.f20835a.mo13847b(c3461n7);
            }
            C3227e7 c3227e7 = c3513p7.f24428b;
            if (c3227e7 != null) {
                c2782Mf.f21740c = this.f20836b.mo13847b(c3227e7);
            }
            List<C3409l7> list = c3513p7.f24429c;
            if (list != null) {
                c2782Mf.f21743f = this.f20838d.mo13847b(list);
            }
            String str3 = c3513p7.f24433g;
            String str4 = c2782Mf.f21741d;
            if (str3 == null) {
                str3 = str4;
            }
            c2782Mf.f21741d = str3;
            c2782Mf.f21742e = this.f20837c.m15523a(c3513p7.f24434h);
            if (!TextUtils.isEmpty(c3513p7.f24430d)) {
                c2782Mf.f21747j = this.f20839e.mo13847b(c3513p7.f24430d);
            }
            if (!TextUtils.isEmpty(c3513p7.f24431e)) {
                c2782Mf.f21748k = c3513p7.f24431e.getBytes();
            }
            if (!C2968U2.m15250b(c3513p7.f24432f)) {
                c2782Mf.f21749l = this.f20840f.m17325a(c3513p7.f24432f);
            }
        }
        return c2782Mf;
    }
}
