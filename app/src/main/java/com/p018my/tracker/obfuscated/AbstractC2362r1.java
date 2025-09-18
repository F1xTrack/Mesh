package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: com.my.tracker.obfuscated.r1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2362r1 {

    /* renamed from: a */
    protected final C2360r f20112a = new C2360r(16384);

    /* renamed from: b */
    protected final C2360r f20113b = new C2360r(4096);

    /* renamed from: a */
    public synchronized void m13470a() {
        this.f20112a.m13462d();
        this.f20113b.m13462d();
    }

    /* renamed from: a */
    public static void m13468a(AbstractC2366s1 abstractC2366s1, String str, C2337l0 c2337l0, C2373u0 c2373u0, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, str);
        if (c2337l0 != null && !TextUtils.isEmpty(c2337l0.f20015a)) {
            boolean z = c2337l0.f20016b;
            c2360r.m13487a(2, c2337l0.f20015a);
            c2360r.m13484a(3, z ? 1 : 0);
        }
        if (c2373u0 != null && !TextUtils.isEmpty(c2373u0.f20131a)) {
            boolean z2 = c2373u0.f20132b;
            c2360r.m13487a(4, c2373u0.f20131a);
            c2360r.m13484a(5, z2 ? 1 : 0);
        }
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(31, c2360r);
        }
    }

    /* renamed from: a */
    public static void m13466a(AbstractC2366s1 abstractC2366s1, C2316g c2316g, C2290a0 c2290a0, C2360r c2360r, C2360r c2360r2) throws IOException {
        c2360r.m13458a();
        if (c2316g != null) {
            c2360r2.m13458a();
            c2360r2.m13487a(1, c2316g.f19938a);
            long j = c2316g.f19939b;
            if (j != -1) {
                c2360r2.m13485a(2, j);
            }
            if (c2360r2.m13460b() > 0) {
                c2360r.m13486a(31, c2360r2);
            }
        }
        c2360r.m13487a(1, c2290a0.f19733g);
        c2360r.m13487a(2, c2290a0.f19732f);
        c2360r.m13487a(3, c2290a0.f19737k);
        c2360r.m13487a(4, c2290a0.f19731e);
        abstractC2366s1.m13486a(21, c2360r);
    }

    /* renamed from: a */
    public static void m13469a(AbstractC2366s1 abstractC2366s1, String str, String str2, C2317g0 c2317g0, C2360r c2360r, C2360r c2360r2) throws IOException {
        C2290a0 c2290a0 = c2317g0.f19942c;
        c2360r.m13458a();
        m13468a(c2360r, str, c2317g0.f19943d, c2317g0.f19944e, c2360r2);
        int i = c2290a0.f19727a;
        if (i != -1) {
            c2360r.m13484a(1, i);
        }
        if (!TextUtils.isEmpty(c2290a0.f19730d)) {
            c2360r.m13487a(2, c2290a0.f19730d);
        }
        if (!TextUtils.isEmpty(c2290a0.f19736j)) {
            c2360r.m13487a(3, c2290a0.f19736j);
        }
        if (!TextUtils.isEmpty(c2290a0.f19742p)) {
            c2360r.m13487a(4, c2290a0.f19742p);
        }
        if (!TextUtils.isEmpty(c2290a0.f19728b)) {
            c2360r.m13487a(5, c2290a0.f19728b);
        }
        if (!TextUtils.isEmpty(c2290a0.f19729c)) {
            c2360r.m13487a(6, c2290a0.f19729c);
        }
        if (!TextUtils.isEmpty(c2290a0.f19735i)) {
            c2360r.m13487a(7, c2290a0.f19735i);
        }
        if (!TextUtils.isEmpty(c2290a0.f19734h)) {
            c2360r.m13487a(8, c2290a0.f19734h);
        }
        int i2 = c2290a0.f19749w;
        if (i2 != -1) {
            c2360r.m13484a(9, i2);
        }
        int i3 = c2290a0.f19743q;
        if (i3 != -1) {
            c2360r.m13484a(10, i3);
        }
        int i4 = c2290a0.f19744r;
        if (i4 != -1) {
            c2360r.m13484a(11, i4);
        }
        int i5 = c2290a0.f19745s;
        if (i5 != -1) {
            c2360r.m13484a(12, i5);
        }
        if (!Float.isNaN(c2290a0.f19747u)) {
            c2360r.m13483a(13, c2290a0.f19747u);
        }
        if (!Float.isNaN(c2290a0.f19748v)) {
            c2360r.m13483a(14, c2290a0.f19748v);
        }
        if (!Float.isNaN(c2290a0.f19746t)) {
            c2360r.m13483a(15, c2290a0.f19746t);
        }
        c2360r.m13487a(16, str2);
        C2348o c2348o = c2317g0.f19949j;
        if (c2348o != null) {
            int i6 = c2348o.f20068a;
            if (i6 != -1) {
                c2360r.m13484a(17, i6);
            }
            int i7 = c2348o.f20069b;
            if (i7 >= 0) {
                c2360r.m13484a(18, i7);
            }
        }
        long j = c2290a0.f19750x;
        if (j != -1) {
            c2360r.m13485a(19, j);
        }
        long j2 = c2290a0.f19751y;
        if (j2 != -1) {
            c2360r.m13485a(20, j2);
        }
        int i8 = c2290a0.f19752z;
        if (i8 != -1) {
            c2360r.m13484a(23, i8);
        }
        int i9 = c2290a0.f19726A;
        if (i9 != -1) {
            c2360r.m13484a(24, i9);
        }
        C2325i0 c2325i0 = c2317g0.f19950k;
        if (c2325i0 != null && !TextUtils.isEmpty(c2325i0.f19981a)) {
            c2360r.m13487a(25, c2317g0.f19950k.f19981a);
        }
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(23, c2360r);
        }
    }

    /* renamed from: a */
    public static void m13464a(AbstractC2366s1 abstractC2366s1, C2291a1 c2291a1, C2360r c2360r) throws IOException {
        if (c2291a1.equals(C2291a1.f19753g)) {
            return;
        }
        c2360r.m13458a();
        if (!Double.isNaN(c2291a1.f19755b)) {
            c2360r.m13482a(1, c2291a1.f19755b);
        }
        if (!Double.isNaN(c2291a1.f19756c)) {
            c2360r.m13482a(2, c2291a1.f19756c);
        }
        if (!Float.isNaN(c2291a1.f19757d)) {
            c2360r.m13482a(3, c2291a1.f19757d);
        }
        if (!Float.isNaN(c2291a1.f19758e)) {
            c2360r.m13482a(4, c2291a1.f19758e);
        }
        long j = c2291a1.f19759f;
        if (j > 0) {
            c2360r.m13485a(5, AbstractC2383w2.m13530b(j));
        }
        int i = c2291a1.f19754a;
        if (i != -1) {
            c2360r.m13484a(6, i);
        }
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(26, c2360r);
        }
    }

    /* renamed from: a */
    public static void m13467a(AbstractC2366s1 abstractC2366s1, C2326i1 c2326i1, C2389y0 c2389y0, C2290a0 c2290a0, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        int i = c2326i1.f19982a;
        if (i != -1) {
            c2360r.m13484a(1, i);
        }
        Boolean bool = c2326i1.f19984c;
        if (bool != null) {
            c2360r.m13484a(7, bool == Boolean.TRUE ? 1 : 0);
        }
        c2360r.m13487a(2, c2326i1.f19983b);
        if (!TextUtils.isEmpty(c2290a0.f19738l)) {
            c2360r.m13487a(3, c2290a0.f19738l);
        }
        if (!TextUtils.isEmpty(c2290a0.f19739m)) {
            c2360r.m13487a(4, c2290a0.f19739m);
        }
        if (!TextUtils.isEmpty(c2290a0.f19740n)) {
            c2360r.m13487a(5, c2290a0.f19740n);
        }
        if (!TextUtils.isEmpty(c2290a0.f19741o)) {
            c2360r.m13487a(6, c2290a0.f19741o);
        }
        if (c2389y0 != null) {
            c2360r.m13489a(8, c2389y0.f20165a);
        }
        c2360r.m13484a(11, c2326i1.f19985d != 2 ? 0 : 1);
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(25, c2360r);
        }
    }

    /* renamed from: a */
    public static void m13465a(AbstractC2366s1 abstractC2366s1, C2298b3 c2298b3, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        int i = c2298b3.f19774b;
        if (i == 0 || i == 1 || i == 2) {
            c2360r.m13484a(1, i);
        }
        int i2 = c2298b3.f19773a;
        if (i2 > -1) {
            c2360r.m13484a(2, i2);
        }
        c2360r.m13490a(3, c2298b3.f19775c);
        c2360r.m13490a(4, c2298b3.f19776d);
        c2360r.m13490a(5, c2298b3.f19777e);
        c2360r.m13490a(6, c2298b3.f19778f);
        c2360r.m13490a(7, c2298b3.f19779g);
        c2360r.m13490a(8, c2298b3.f19780h);
        c2360r.m13490a(9, c2298b3.f19781i);
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(22, c2360r);
        }
    }
}
