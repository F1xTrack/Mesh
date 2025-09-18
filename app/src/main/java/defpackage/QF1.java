package defpackage;

/* loaded from: classes.dex */
public final class QF1 extends XF1 {
    @Override // defpackage.XF1
    public final void a(long j, Object obj) {
        HB1 hb1 = (HB1) ((YE1) BJ1.i(j, obj));
        if (hb1.a) {
            hb1.a = false;
        }
    }

    @Override // defpackage.XF1
    public final void b(long j, Object obj, Object obj2) {
        YE1 ye1C = (YE1) BJ1.i(j, obj);
        YE1 ye1 = (YE1) BJ1.i(j, obj2);
        int size = ye1C.size();
        int size2 = ye1.size();
        if (size > 0 && size2 > 0) {
            if (!((HB1) ye1C).a) {
                ye1C = ye1C.c(size2 + size);
            }
            ye1C.addAll(ye1);
        }
        if (size > 0) {
            ye1 = ye1C;
        }
        BJ1.p(j, obj, ye1);
    }
}
