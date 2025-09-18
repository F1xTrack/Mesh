package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.F7 */
/* loaded from: classes2.dex */
public class C2599F7 implements InterfaceC3230ea<C3513p7, C2757Lf> {

    /* renamed from: a */
    private final C2574E7 f21176a;

    /* renamed from: b */
    private final C3565r7 f21177b;

    /* renamed from: c */
    private final C3617t7 f21178c;

    /* renamed from: d */
    private final C2499B7 f21179d;

    /* renamed from: e */
    private final C3747y7 f21180e;

    /* renamed from: f */
    private final C3773z7 f21181f;

    public C2599F7() {
        this(new C2574E7(), new C3565r7(new C2549D7()), new C3617t7(), new C2499B7(), new C3747y7(), new C3773z7());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3513p7 mo13846a(C2757Lf c2757Lf) {
        throw new UnsupportedOperationException();
    }

    public C2599F7(C2574E7 c2574e7, C3565r7 c3565r7, C3617t7 c3617t7, C2499B7 c2499b7, C3747y7 c3747y7, C3773z7 c3773z7) {
        this.f21177b = c3565r7;
        this.f21176a = c2574e7;
        this.f21178c = c3617t7;
        this.f21179d = c2499b7;
        this.f21180e = c3747y7;
        this.f21181f = c3773z7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2757Lf mo13847b(C3513p7 c3513p7) {
        C2757Lf c2757Lf = new C2757Lf();
        C3461n7 c3461n7 = c3513p7.f24427a;
        if (c3461n7 != null) {
            c2757Lf.f21645b = this.f21176a.mo13847b(c3461n7);
        }
        C3227e7 c3227e7 = c3513p7.f24428b;
        if (c3227e7 != null) {
            c2757Lf.f21646c = this.f21177b.mo13847b(c3227e7);
        }
        List<C3409l7> list = c3513p7.f24429c;
        if (list != null) {
            c2757Lf.f21649f = this.f21179d.mo13847b(list);
        }
        String str = c3513p7.f24433g;
        if (str != null) {
            c2757Lf.f21647d = str;
        }
        c2757Lf.f21648e = this.f21178c.m15523a(c3513p7.f24434h);
        if (!TextUtils.isEmpty(c3513p7.f24430d)) {
            c2757Lf.f21652i = this.f21180e.mo13847b(c3513p7.f24430d);
        }
        if (!TextUtils.isEmpty(c3513p7.f24431e)) {
            c2757Lf.f21653j = c3513p7.f24431e.getBytes();
        }
        if (!C2968U2.m15250b(c3513p7.f24432f)) {
            c2757Lf.f21654k = this.f21181f.m17325a(c3513p7.f24432f);
        }
        return c2757Lf;
    }
}
