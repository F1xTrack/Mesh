package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class VD0 {

    /* renamed from: a */
    public final ContentResolver f12416a;

    /* renamed from: b */
    public final SD0 f12417b;

    /* renamed from: c */
    public final AbstractC11920zO1 f12418c;

    /* renamed from: d */
    public final boolean f12419d;

    /* renamed from: e */
    public final C4238iN f12420e;

    /* renamed from: f */
    public final boolean f12421f;

    /* renamed from: g */
    public final C10065kt0 f12422g;

    /* renamed from: h */
    public final LinkedHashMap f12423h;

    /* renamed from: i */
    public final F71 f12424i;

    /* renamed from: j */
    public final F71 f12425j;

    /* renamed from: k */
    public final F71 f12426k;

    /* renamed from: l */
    public final F71 f12427l;

    /* renamed from: m */
    public final F71 f12428m;

    /* renamed from: n */
    public final F71 f12429n;

    /* renamed from: o */
    public final F71 f12430o;

    /* renamed from: p */
    public final F71 f12431p;

    /* renamed from: q */
    public final F71 f12432q;

    /* renamed from: r */
    public final F71 f12433r;

    /* renamed from: s */
    public final F71 f12434s;

    /* renamed from: t */
    public final F71 f12435t;

    /* renamed from: u */
    public final F71 f12436u;

    /* renamed from: v */
    public final F71 f12437v;

    /* renamed from: w */
    public final F71 f12438w;

    /* renamed from: x */
    public final int f12439x;

    public VD0(ContentResolver contentResolver, SD0 sd0, AbstractC11920zO1 abstractC11920zO1, boolean z, C4238iN c4238iN, int i, boolean z2, C10065kt0 c10065kt0, C1156SN c1156sn) {
        O90.m5968f(contentResolver, "contentResolver");
        O90.m5968f(sd0, "producerFactory");
        O90.m5968f(abstractC11920zO1, "networkFetcher");
        O90.m5968f(c4238iN, "threadHandoffProducerQueue");
        AbstractC0852NX.m5764m(i, "downsampleMode");
        O90.m5968f(c10065kt0, "imageTranscoderFactory");
        this.f12416a = contentResolver;
        this.f12417b = sd0;
        this.f12418c = abstractC11920zO1;
        this.f12419d = z;
        this.f12420e = c4238iN;
        this.f12439x = i;
        this.f12421f = z2;
        this.f12422g = c10065kt0;
        this.f12423h = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        AbstractC0705LB.m4915b(new UD0(this, 14));
        AbstractC0705LB.m4915b(new UD0(this, 8));
        AbstractC0705LB.m4915b(new UD0(this, 6));
        this.f12424i = AbstractC0705LB.m4915b(new UD0(this, 15));
        this.f12425j = AbstractC0705LB.m4915b(new UD0(this, 2));
        this.f12426k = AbstractC0705LB.m4915b(new UD0(this, 16));
        this.f12427l = AbstractC0705LB.m4915b(new UD0(this, 3));
        this.f12428m = AbstractC0705LB.m4915b(new UD0(this, 9));
        this.f12429n = AbstractC0705LB.m4915b(new UD0(this, 1));
        this.f12430o = AbstractC0705LB.m4915b(new UD0(this, 0));
        this.f12431p = AbstractC0705LB.m4915b(new UD0(this, 10));
        this.f12432q = AbstractC0705LB.m4915b(new UD0(this, 13));
        this.f12433r = AbstractC0705LB.m4915b(new UD0(this, 7));
        this.f12434s = AbstractC0705LB.m4915b(new UD0(this, 12));
        this.f12435t = AbstractC0705LB.m4915b(new UD0(this, 17));
        this.f12436u = AbstractC0705LB.m4915b(new UD0(this, 11));
        this.f12437v = AbstractC0705LB.m4915b(new UD0(this, 5));
        this.f12438w = AbstractC0705LB.m4915b(new UD0(this, 4));
    }

    /* renamed from: a */
    public final QD0 m8329a(C10737q70 c10737q70) {
        AbstractC4250iZ.m19063b();
        Uri uri = c10737q70.f40609b;
        O90.m5967e(uri, "imageRequest.sourceUri");
        int i = c10737q70.f40610c;
        if (i == 0) {
            return (QD0) this.f12424i.getValue();
        }
        F71 f71 = this.f12432q;
        F71 f712 = this.f12434s;
        switch (i) {
            case 2:
                return c10737q70.m23931a() ? (QD0) f712.getValue() : (QD0) f71.getValue();
            case 3:
                return c10737q70.m23931a() ? (QD0) f712.getValue() : (QD0) this.f12431p.getValue();
            case 4:
                if (c10737q70.m23931a()) {
                    return (QD0) f712.getValue();
                }
                String type = this.f12416a.getType(uri);
                Object obj = AbstractC8592Yp0.f14551a;
                return type != null ? D51.m1556o(type, "video/", false) : false ? (QD0) f71.getValue() : (QD0) this.f12433r.getValue();
            case 5:
                return (QD0) this.f12437v.getValue();
            case 6:
                return (QD0) this.f12436u.getValue();
            case 7:
                return (QD0) this.f12438w.getValue();
            case 8:
                return (QD0) this.f12435t.getValue();
            default:
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unsupported uri scheme! Uri is: ", C10689pl0.m23861b(uri)));
        }
    }

    /* renamed from: b */
    public final QD0 m8330b(C10737q70 c10737q70) {
        if (!(c10737q70.f40619l.f39845a <= 3)) {
            throw new IllegalArgumentException();
        }
        int i = c10737q70.f40610c;
        if (i == 0) {
            Object value = this.f12426k.getValue();
            O90.m5967e(value, "<get-networkFetchToEncod…oryPrefetchSequence>(...)");
            return (QD0) value;
        }
        if (i == 2 || i == 3) {
            Object value2 = this.f12428m.getValue();
            O90.m5967e(value2, "<get-localFileFetchToEnc…oryPrefetchSequence>(...)");
            return (QD0) value2;
        }
        Uri uri = c10737q70.f40609b;
        O90.m5967e(uri, "imageRequest.sourceUri");
        throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unsupported uri scheme for encoded image fetch! Uri is: ", C10689pl0.m23861b(uri)));
    }

    /* renamed from: c */
    public final synchronized QD0 m8331c(QD0 qd0) {
        QD0 qd02;
        qd02 = (QD0) this.f12423h.get(qd0);
        if (qd02 == null) {
            SD0 sd0 = this.f12417b;
            C8290Su0 c8290Su0 = new C8290Su0(qd0, sd0.f10638p, (ExecutorService) sd0.f10631i.f43618c);
            SD0 sd02 = this.f12417b;
            C8290Su0 c8290Su02 = new C8290Su0(sd02.f10636n, sd02.f10637o, c8290Su0, 1);
            this.f12423h.put(qd0, c8290Su02);
            qd02 = c8290Su02;
        }
        return qd02;
    }

    /* renamed from: d */
    public final QD0 m8332d(QD0 qd0) {
        SD0 sd0 = this.f12417b;
        CC0 cc0 = sd0.f10636n;
        C1210TE c1210te = sd0.f10637o;
        W91 w91 = new W91(new C4259ii(c1210te, new C6317ki(cc0, c1210te, qd0, 0)), this.f12420e);
        CC0 cc02 = sd0.f10636n;
        O90.m5968f(cc02, "memoryCache");
        O90.m5968f(c1210te, "cacheKeyFactory");
        return new C4133gi(cc02, c1210te, w91, 0);
    }

    /* renamed from: e */
    public final QD0 m8333e(QD0 qd0) {
        O90.m5968f(qd0, "inputProducer");
        AbstractC4250iZ.m19063b();
        SD0 sd0 = this.f12417b;
        return m8332d(new C1272UD(sd0.f10626d, (ExecutorService) sd0.f10631i.f43617b, sd0.f10627e, sd0.f10628f, sd0.f10629g, sd0.f10630h, qd0, sd0.f10640r, sd0.f10639q));
    }

    /* renamed from: f */
    public final QD0 m8334f(AbstractC7438Ck0 abstractC7438Ck0, InterfaceC9516ga1[] interfaceC9516ga1Arr) {
        C6402m3 c6402m3 = new C6402m3(m8335g(abstractC7438Ck0), 0);
        SD0 sd0 = this.f12417b;
        C10065kt0 c10065kt0 = this.f12422g;
        return m8333e(new W91(sd0.m7197a(new C6402m3(interfaceC9516ga1Arr), true, c10065kt0), new C8999ca1((ExecutorService) sd0.f10631i.f43619d, sd0.m7197a(c6402m3, true, c10065kt0))));
    }

    /* renamed from: g */
    public final C4259ii m8335g(QD0 qd0) {
        boolean z = this.f12421f;
        SD0 sd0 = this.f12417b;
        if (z) {
            AbstractC4250iZ.m19063b();
            C0487Hj c0487Hj = sd0.f10633k;
            C0487Hj c0487Hj2 = sd0.f10634l;
            Map map = sd0.f10641s;
            C1210TE c1210te = sd0.f10637o;
            qd0 = new C3921dK(c0487Hj, c0487Hj2, map, c1210te, new C3921dK(c0487Hj, c0487Hj2, map, c1210te, qd0, 1), 0);
        }
        CC0 cc0 = sd0.f10635m;
        C1210TE c1210te2 = sd0.f10637o;
        return new C4259ii(c1210te2, (QD0) new C6317ki(cc0, c1210te2, qd0, 1));
    }
}
