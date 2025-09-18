package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Z60 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final VD0 a;
    public final C2472cD b;
    public final CX c;
    public final BX d;
    public final CC0 e;
    public final CC0 f;
    public final C0593Hj g;
    public final C0593Hj h;
    public final TE i;
    public final AtomicLong j;
    public final C2265b70 k;

    static {
        new CancellationException("ImageRequest is null");
    }

    public Z60(VD0 vd0, Set set, SN sn, C2472cD c2472cD, CC0 cc0, CC0 cc02, C0593Hj c0593Hj, C0593Hj c0593Hj2, TE te, C4332iN c4332iN, C2472cD c2472cD2, C2265b70 c2265b70) {
        O90.f(vd0, "producerSequenceFactory");
        O90.f(set, "requestListeners");
        O90.f(sn, "requestListener2s");
        O90.f(c2472cD, "isPrefetchEnabledSupplier");
        O90.f(cc0, "bitmapMemoryCache");
        O90.f(cc02, "encodedMemoryCache");
        O90.f(c0593Hj, "mainBufferedDiskCache");
        O90.f(c0593Hj2, "smallImageBufferedDiskCache");
        O90.f(te, "cacheKeyFactory");
        O90.f(c4332iN, "threadHandoffProducerQueue");
        O90.f(c2472cD2, "suppressBitmapPrefetchingSupplier");
        O90.f(c2265b70, "config");
        this.a = vd0;
        this.b = c2472cD;
        this.c = new CX(set);
        this.d = new BX(sn);
        this.j = new AtomicLong();
        this.e = cc0;
        this.f = cc02;
        this.g = c0593Hj;
        this.h = c0593Hj2;
        this.i = te;
        this.k = c2265b70;
    }

    public final I a(C6589q70 c6589q70, Object obj, EnumC6398p70 enumC6398p70, DR0 dr0, String str) {
        if (c6589q70 == null) {
            return AbstractC5719lZ1.a(new NullPointerException());
        }
        try {
            VD0 vd0 = this.a;
            vd0.getClass();
            AbstractC4368iZ.b();
            QD0 qd0A = vd0.a(c6589q70);
            if (c6589q70.p != null) {
                qd0A = vd0.c(qd0A);
            }
            if (enumC6398p70 == null) {
                enumC6398p70 = EnumC6398p70.FULL_FETCH;
            }
            return c(qd0A, c6589q70, enumC6398p70, obj, dr0, str);
        } catch (Exception e) {
            return AbstractC5719lZ1.a(e);
        }
    }

    public final boolean b(Uri uri, EnumC6207o70 enumC6207o70) {
        C6779r70 c6779r70C = C6779r70.c(uri);
        c6779r70C.g = enumC6207o70;
        C6589q70 c6589q70A = c6779r70C.a();
        TE te = this.i;
        te.getClass();
        O01 o01I = te.I(c6589q70A.b);
        EnumC6207o70 enumC6207o702 = c6589q70A.a;
        O90.e(enumC6207o702, "imageRequest.cacheChoice");
        int iOrdinal = enumC6207o702.ordinal();
        if (iOrdinal == 0) {
            return this.h.h(o01I);
        }
        if (iOrdinal != 1) {
            return false;
        }
        return this.g.h(o01I);
    }

    public final I c(QD0 qd0, C6589q70 c6589q70, EnumC6398p70 enumC6398p70, Object obj, DR0 dr0, String str) {
        AbstractC4368iZ.b();
        if (c6589q70 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        CX cx = this.c;
        if (dr0 != null) {
            cx = new CX(cx, dr0);
        }
        E90 e90 = new E90(cx, this.d);
        try {
            EnumC6398p70 enumC6398p702 = c6589q70.l;
            C8387zZ0 c8387zZ0 = new C8387zZ0(c6589q70, String.valueOf(this.j.getAndIncrement()), str, e90, obj, enumC6398p702.a > enumC6398p70.a ? enumC6398p702 : enumC6398p70, false, c6589q70.e || !AbstractC2374bh1.d(c6589q70.b), c6589q70.k, this.k);
            AbstractC4368iZ.b();
            C8066xt c8066xt = new C8066xt(qd0, c8387zZ0, e90, 0);
            AbstractC4368iZ.b();
            return c8066xt;
        } catch (Exception e) {
            return AbstractC5719lZ1.a(e);
        }
    }

    public final I d(QD0 qd0, C6589q70 c6589q70, Object obj) {
        EnumC6398p70 enumC6398p70 = EnumC6398p70.FULL_FETCH;
        EnumC7179tD0 enumC7179tD0 = EnumC7179tD0.b;
        E90 e90 = new E90(this.c, this.d);
        try {
            EnumC6398p70 enumC6398p702 = c6589q70.l;
            EnumC6398p70 enumC6398p703 = enumC6398p702.a > 1 ? enumC6398p702 : enumC6398p70;
            String strValueOf = String.valueOf(this.j.getAndIncrement());
            C2265b70 c2265b70 = this.k;
            C6846rT1 c6846rT1 = c2265b70.t;
            return new C8066xt(qd0, new C8387zZ0(c6589q70, strValueOf, null, e90, obj, enumC6398p703, true, false, enumC7179tD0, c2265b70), e90, 1);
        } catch (Exception e) {
            return AbstractC5719lZ1.a(e);
        }
    }
}
