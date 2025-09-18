package p000;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Z60 {

    /* renamed from: l */
    public static final CancellationException f14724l = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    public final VD0 f14725a;

    /* renamed from: b */
    public final C1833cD f14726b;

    /* renamed from: c */
    public final C0160CX f14727c;

    /* renamed from: d */
    public final C0097BX f14728d;

    /* renamed from: e */
    public final CC0 f14729e;

    /* renamed from: f */
    public final CC0 f14730f;

    /* renamed from: g */
    public final C0487Hj f14731g;

    /* renamed from: h */
    public final C0487Hj f14732h;

    /* renamed from: i */
    public final C1210TE f14733i;

    /* renamed from: j */
    public final AtomicLong f14734j;

    /* renamed from: k */
    public final C8812b70 f14735k;

    static {
        new CancellationException("ImageRequest is null");
    }

    public Z60(VD0 vd0, Set set, C1156SN c1156sn, C1833cD c1833cD, CC0 cc0, CC0 cc02, C0487Hj c0487Hj, C0487Hj c0487Hj2, C1210TE c1210te, C4238iN c4238iN, C1833cD c1833cD2, C8812b70 c8812b70) {
        O90.m5968f(vd0, "producerSequenceFactory");
        O90.m5968f(set, "requestListeners");
        O90.m5968f(c1156sn, "requestListener2s");
        O90.m5968f(c1833cD, "isPrefetchEnabledSupplier");
        O90.m5968f(cc0, "bitmapMemoryCache");
        O90.m5968f(cc02, "encodedMemoryCache");
        O90.m5968f(c0487Hj, "mainBufferedDiskCache");
        O90.m5968f(c0487Hj2, "smallImageBufferedDiskCache");
        O90.m5968f(c1210te, "cacheKeyFactory");
        O90.m5968f(c4238iN, "threadHandoffProducerQueue");
        O90.m5968f(c1833cD2, "suppressBitmapPrefetchingSupplier");
        O90.m5968f(c8812b70, "config");
        this.f14725a = vd0;
        this.f14726b = c1833cD;
        this.f14727c = new C0160CX(set);
        this.f14728d = new C0097BX(c1156sn);
        this.f14734j = new AtomicLong();
        this.f14729e = cc0;
        this.f14730f = cc02;
        this.f14731g = c0487Hj;
        this.f14732h = c0487Hj2;
        this.f14733i = c1210te;
        this.f14735k = c8812b70;
    }

    /* renamed from: a */
    public final AbstractC0504I m9486a(C10737q70 c10737q70, Object obj, EnumC10609p70 enumC10609p70, DR0 dr0, String str) {
        if (c10737q70 == null) {
            return AbstractC10154lZ1.m22505a(new NullPointerException());
        }
        try {
            VD0 vd0 = this.f14725a;
            vd0.getClass();
            AbstractC4250iZ.m19063b();
            QD0 qd0M8329a = vd0.m8329a(c10737q70);
            if (c10737q70.f40623p != null) {
                qd0M8329a = vd0.m8331c(qd0M8329a);
            }
            if (enumC10609p70 == null) {
                enumC10609p70 = EnumC10609p70.FULL_FETCH;
            }
            return m9488c(qd0M8329a, c10737q70, enumC10609p70, obj, dr0, str);
        } catch (Exception e) {
            return AbstractC10154lZ1.m22505a(e);
        }
    }

    /* renamed from: b */
    public final boolean m9487b(Uri uri, EnumC10481o70 enumC10481o70) {
        C10865r70 c10865r70M24160c = C10865r70.m24160c(uri);
        c10865r70M24160c.f41344g = enumC10481o70;
        C10737q70 c10737q70M24161a = c10865r70M24160c.m24161a();
        C1210TE c1210te = this.f14733i;
        c1210te.getClass();
        O01 o01M7641I = c1210te.m7641I(c10737q70M24161a.f40609b);
        EnumC10481o70 enumC10481o702 = c10737q70M24161a.f40608a;
        O90.m5967e(enumC10481o702, "imageRequest.cacheChoice");
        int iOrdinal = enumC10481o702.ordinal();
        if (iOrdinal == 0) {
            return this.f14732h.m3554h(o01M7641I);
        }
        if (iOrdinal != 1) {
            return false;
        }
        return this.f14731g.m3554h(o01M7641I);
    }

    /* renamed from: c */
    public final AbstractC0504I m9488c(QD0 qd0, C10737q70 c10737q70, EnumC10609p70 enumC10609p70, Object obj, DR0 dr0, String str) {
        AbstractC4250iZ.m19063b();
        if (c10737q70 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C0160CX c0160cx = this.f14727c;
        if (dr0 != null) {
            c0160cx = new C0160CX(c0160cx, dr0);
        }
        E90 e90 = new E90(c0160cx, this.f14728d);
        try {
            EnumC10609p70 enumC10609p702 = c10737q70.f40619l;
            C11941zZ0 c11941zZ0 = new C11941zZ0(c10737q70, String.valueOf(this.f14734j.getAndIncrement()), str, e90, obj, enumC10609p702.f39845a > enumC10609p70.f39845a ? enumC10609p702 : enumC10609p70, false, c10737q70.f40612e || !AbstractC8885bh1.m10483d(c10737q70.f40609b), c10737q70.f40618k, this.f14735k);
            AbstractC4250iZ.m19063b();
            C7166xt c7166xt = new C7166xt(qd0, c11941zZ0, e90, 0);
            AbstractC4250iZ.m19063b();
            return c7166xt;
        } catch (Exception e) {
            return AbstractC10154lZ1.m22505a(e);
        }
    }

    /* renamed from: d */
    public final AbstractC0504I m9489d(QD0 qd0, C10737q70 c10737q70, Object obj) {
        EnumC10609p70 enumC10609p70 = EnumC10609p70.FULL_FETCH;
        EnumC11133tD0 enumC11133tD0 = EnumC11133tD0.f42954b;
        E90 e90 = new E90(this.f14727c, this.f14728d);
        try {
            EnumC10609p70 enumC10609p702 = c10737q70.f40619l;
            EnumC10609p70 enumC10609p703 = enumC10609p702.f39845a > 1 ? enumC10609p702 : enumC10609p70;
            String strValueOf = String.valueOf(this.f14734j.getAndIncrement());
            C8812b70 c8812b70 = this.f14735k;
            C10910rT1 c10910rT1 = c8812b70.f16804t;
            return new C7166xt(qd0, new C11941zZ0(c10737q70, strValueOf, null, e90, obj, enumC10609p703, true, false, enumC11133tD0, c8812b70), e90, 1);
        } catch (Exception e) {
            return AbstractC10154lZ1.m22505a(e);
        }
    }
}
