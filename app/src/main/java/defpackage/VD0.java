package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class VD0 {
    public final ContentResolver a;
    public final SD0 b;
    public final AbstractC8355zO1 c;
    public final boolean d;
    public final C4332iN e;
    public final boolean f;
    public final C5587kt0 g;
    public final LinkedHashMap h;
    public final F71 i;
    public final F71 j;
    public final F71 k;
    public final F71 l;
    public final F71 m;
    public final F71 n;
    public final F71 o;
    public final F71 p;
    public final F71 q;
    public final F71 r;
    public final F71 s;
    public final F71 t;
    public final F71 u;
    public final F71 v;
    public final F71 w;
    public final int x;

    public VD0(ContentResolver contentResolver, SD0 sd0, AbstractC8355zO1 abstractC8355zO1, boolean z, C4332iN c4332iN, int i, boolean z2, C5587kt0 c5587kt0, SN sn) {
        O90.f(contentResolver, "contentResolver");
        O90.f(sd0, "producerFactory");
        O90.f(abstractC8355zO1, "networkFetcher");
        O90.f(c4332iN, "threadHandoffProducerQueue");
        NX.m(i, "downsampleMode");
        O90.f(c5587kt0, "imageTranscoderFactory");
        this.a = contentResolver;
        this.b = sd0;
        this.c = abstractC8355zO1;
        this.d = z;
        this.e = c4332iN;
        this.x = i;
        this.f = z2;
        this.g = c5587kt0;
        this.h = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        LB.b(new UD0(this, 14));
        LB.b(new UD0(this, 8));
        LB.b(new UD0(this, 6));
        this.i = LB.b(new UD0(this, 15));
        this.j = LB.b(new UD0(this, 2));
        this.k = LB.b(new UD0(this, 16));
        this.l = LB.b(new UD0(this, 3));
        this.m = LB.b(new UD0(this, 9));
        this.n = LB.b(new UD0(this, 1));
        this.o = LB.b(new UD0(this, 0));
        this.p = LB.b(new UD0(this, 10));
        this.q = LB.b(new UD0(this, 13));
        this.r = LB.b(new UD0(this, 7));
        this.s = LB.b(new UD0(this, 12));
        this.t = LB.b(new UD0(this, 17));
        this.u = LB.b(new UD0(this, 11));
        this.v = LB.b(new UD0(this, 5));
        this.w = LB.b(new UD0(this, 4));
    }

    public final QD0 a(C6589q70 c6589q70) {
        AbstractC4368iZ.b();
        Uri uri = c6589q70.b;
        O90.e(uri, "imageRequest.sourceUri");
        int i = c6589q70.c;
        if (i == 0) {
            return (QD0) this.i.getValue();
        }
        F71 f71 = this.q;
        F71 f712 = this.s;
        switch (i) {
            case 2:
                return c6589q70.a() ? (QD0) f712.getValue() : (QD0) f71.getValue();
            case 3:
                return c6589q70.a() ? (QD0) f712.getValue() : (QD0) this.p.getValue();
            case 4:
                if (c6589q70.a()) {
                    return (QD0) f712.getValue();
                }
                String type = this.a.getType(uri);
                Object obj = AbstractC1937Yp0.a;
                return type != null ? D51.o(type, "video/", false) : false ? (QD0) f71.getValue() : (QD0) this.r.getValue();
            case 5:
                return (QD0) this.v.getValue();
            case 6:
                return (QD0) this.u.getValue();
            case 7:
                return (QD0) this.w.getValue();
            case 8:
                return (QD0) this.t.getValue();
            default:
                throw new IllegalArgumentException(AbstractC8235ym.v("Unsupported uri scheme! Uri is: ", C6518pl0.b(uri)));
        }
    }

    public final QD0 b(C6589q70 c6589q70) {
        if (!(c6589q70.l.a <= 3)) {
            throw new IllegalArgumentException();
        }
        int i = c6589q70.c;
        if (i == 0) {
            Object value = this.k.getValue();
            O90.e(value, "<get-networkFetchToEncod…oryPrefetchSequence>(...)");
            return (QD0) value;
        }
        if (i == 2 || i == 3) {
            Object value2 = this.m.getValue();
            O90.e(value2, "<get-localFileFetchToEnc…oryPrefetchSequence>(...)");
            return (QD0) value2;
        }
        Uri uri = c6589q70.b;
        O90.e(uri, "imageRequest.sourceUri");
        throw new IllegalArgumentException(AbstractC8235ym.v("Unsupported uri scheme for encoded image fetch! Uri is: ", C6518pl0.b(uri)));
    }

    public final synchronized QD0 c(QD0 qd0) {
        QD0 qd02;
        qd02 = (QD0) this.h.get(qd0);
        if (qd02 == null) {
            SD0 sd0 = this.b;
            C1484Su0 c1484Su0 = new C1484Su0(qd0, sd0.p, (ExecutorService) sd0.i.c);
            SD0 sd02 = this.b;
            C1484Su0 c1484Su02 = new C1484Su0(sd02.n, sd02.o, c1484Su0, 1);
            this.h.put(qd0, c1484Su02);
            qd02 = c1484Su02;
        }
        return qd02;
    }

    public final QD0 d(QD0 qd0) {
        SD0 sd0 = this.b;
        CC0 cc0 = sd0.n;
        TE te = sd0.o;
        W91 w91 = new W91(new C4394ii(te, new C5553ki(cc0, te, qd0, 0)), this.e);
        CC0 cc02 = sd0.n;
        O90.f(cc02, "memoryCache");
        O90.f(te, "cacheKeyFactory");
        return new C4013gi(cc02, te, w91, 0);
    }

    public final QD0 e(QD0 qd0) {
        O90.f(qd0, "inputProducer");
        AbstractC4368iZ.b();
        SD0 sd0 = this.b;
        return d(new UD(sd0.d, (ExecutorService) sd0.i.b, sd0.e, sd0.f, sd0.g, sd0.h, qd0, sd0.r, sd0.q));
    }

    public final QD0 f(AbstractC0207Ck0 abstractC0207Ck0, InterfaceC3991ga1[] interfaceC3991ga1Arr) {
        C5811m3 c5811m3 = new C5811m3(g(abstractC0207Ck0), 0);
        SD0 sd0 = this.b;
        C5587kt0 c5587kt0 = this.g;
        return e(new W91(sd0.a(new C5811m3(interfaceC3991ga1Arr), true, c5587kt0), new C2543ca1((ExecutorService) sd0.i.d, sd0.a(c5811m3, true, c5587kt0))));
    }

    public final C4394ii g(QD0 qd0) {
        boolean z = this.f;
        SD0 sd0 = this.b;
        if (z) {
            AbstractC4368iZ.b();
            C0593Hj c0593Hj = sd0.k;
            C0593Hj c0593Hj2 = sd0.l;
            Map map = sd0.s;
            TE te = sd0.o;
            qd0 = new C3369dK(c0593Hj, c0593Hj2, map, te, new C3369dK(c0593Hj, c0593Hj2, map, te, qd0, 1), 0);
        }
        CC0 cc0 = sd0.m;
        TE te2 = sd0.o;
        return new C4394ii(te2, (QD0) new C5553ki(cc0, te2, qd0, 1));
    }
}
