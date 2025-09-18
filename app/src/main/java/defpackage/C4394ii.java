package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.Closeable;
import java.util.HashMap;

/* renamed from: ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4394ii implements QD0 {
    public final HashMap a;
    public final QD0 b;
    public final String c;
    public final String d;
    public final /* synthetic */ int e;
    public final TE f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4394ii(TE te, QD0 qd0) {
        this(qd0, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.e = 1;
        this.f = te;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        C8447zt0 c8447zt0E;
        int i;
        boolean z;
        try {
            AbstractC4368iZ.b();
            ((C7647vg) rd0).c.j(rd0, this.c);
            Pair pairF = f(rd0);
            do {
                synchronized (this) {
                    try {
                        c8447zt0E = e(pairF);
                        i = 1;
                        if (c8447zt0E == null) {
                            c8447zt0E = d(pairF);
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                }
            } while (!c8447zt0E.a(abstractC1516Tf, rd0));
            if (z) {
                if (!((C7647vg) rd0).h()) {
                    i = 2;
                }
                c8447zt0E.i(i);
            }
        } finally {
            AbstractC4368iZ.b();
        }
    }

    public final Closeable c(Closeable closeable) {
        switch (this.e) {
            case 0:
                return AbstractC8446zt.o((AbstractC8446zt) closeable);
            default:
                return EncodedImage.cloneOrNull((EncodedImage) closeable);
        }
    }

    public final synchronized C8447zt0 d(Object obj) {
        C8447zt0 c8447zt0;
        c8447zt0 = new C8447zt0(this, obj);
        this.a.put(obj, c8447zt0);
        return c8447zt0;
    }

    public final synchronized C8447zt0 e(Object obj) {
        return (C8447zt0) this.a.get(obj);
    }

    public final Pair f(RD0 rd0) {
        switch (this.e) {
            case 0:
                C7647vg c7647vg = (C7647vg) rd0;
                return Pair.create(this.f.H(c7647vg.a, c7647vg.d), c7647vg.e);
            default:
                C7647vg c7647vg2 = (C7647vg) rd0;
                C6589q70 c6589q70 = c7647vg2.a;
                TE te = this.f;
                te.getClass();
                return Pair.create(te.I(c6589q70.b), c7647vg2.e);
        }
    }

    public final synchronized void g(Object obj, C8447zt0 c8447zt0) {
        if (this.a.get(obj) == c8447zt0) {
            this.a.remove(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4394ii(TE te, C5553ki c5553ki) {
        this(c5553ki, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.e = 0;
        this.f = te;
    }

    public C4394ii(QD0 qd0, String str, String str2) {
        this.b = qd0;
        this.a = new HashMap();
        this.c = str;
        this.d = str2;
    }
}
