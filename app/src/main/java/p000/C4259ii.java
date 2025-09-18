package p000;

import android.util.Pair;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.Closeable;
import java.util.HashMap;

/* renamed from: ii */
/* loaded from: classes.dex */
public final class C4259ii implements QD0 {

    /* renamed from: a */
    public final HashMap f29408a;

    /* renamed from: b */
    public final QD0 f29409b;

    /* renamed from: c */
    public final String f29410c;

    /* renamed from: d */
    public final String f29411d;

    /* renamed from: e */
    public final /* synthetic */ int f29412e;

    /* renamed from: f */
    public final C1210TE f29413f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4259ii(C1210TE c1210te, QD0 qd0) {
        this(qd0, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.f29412e = 1;
        this.f29413f = c1210te;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        C11981zt0 c11981zt0M19069e;
        int i;
        boolean z;
        try {
            AbstractC4250iZ.m19063b();
            ((C7027vg) rd0).f44475c.mo752j(rd0, this.f29410c);
            Pair pairM19070f = m19070f(rd0);
            do {
                synchronized (this) {
                    try {
                        c11981zt0M19069e = m19069e(pairM19070f);
                        i = 1;
                        if (c11981zt0M19069e == null) {
                            c11981zt0M19069e = m19068d(pairM19070f);
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                }
            } while (!c11981zt0M19069e.m26575a(abstractC1237Tf, rd0));
            if (z) {
                if (!((C7027vg) rd0).m25466h()) {
                    i = 2;
                }
                c11981zt0M19069e.m26582i(i);
            }
        } finally {
            AbstractC4250iZ.m19063b();
        }
    }

    /* renamed from: c */
    public final Closeable m19067c(Closeable closeable) {
        switch (this.f29412e) {
            case 0:
                return AbstractC7292zt.m26568o((AbstractC7292zt) closeable);
            default:
                return EncodedImage.cloneOrNull((EncodedImage) closeable);
        }
    }

    /* renamed from: d */
    public final synchronized C11981zt0 m19068d(Object obj) {
        C11981zt0 c11981zt0;
        c11981zt0 = new C11981zt0(this, obj);
        this.f29408a.put(obj, c11981zt0);
        return c11981zt0;
    }

    /* renamed from: e */
    public final synchronized C11981zt0 m19069e(Object obj) {
        return (C11981zt0) this.f29408a.get(obj);
    }

    /* renamed from: f */
    public final Pair m19070f(RD0 rd0) {
        switch (this.f29412e) {
            case 0:
                C7027vg c7027vg = (C7027vg) rd0;
                return Pair.create(this.f29413f.m7640H(c7027vg.f44473a, c7027vg.f44476d), c7027vg.f44477e);
            default:
                C7027vg c7027vg2 = (C7027vg) rd0;
                C10737q70 c10737q70 = c7027vg2.f44473a;
                C1210TE c1210te = this.f29413f;
                c1210te.getClass();
                return Pair.create(c1210te.m7641I(c10737q70.f40609b), c7027vg2.f44477e);
        }
    }

    /* renamed from: g */
    public final synchronized void m19071g(Object obj, C11981zt0 c11981zt0) {
        if (this.f29408a.get(obj) == c11981zt0) {
            this.f29408a.remove(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4259ii(C1210TE c1210te, C6317ki c6317ki) {
        this(c6317ki, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f29412e = 0;
        this.f29413f = c1210te;
    }

    public C4259ii(QD0 qd0, String str, String str2) {
        this.f29409b = qd0;
        this.f29408a = new HashMap();
        this.f29410c = str;
        this.f29411d = str2;
    }
}
