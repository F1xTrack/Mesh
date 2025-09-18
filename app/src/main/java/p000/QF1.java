package p000;

/* loaded from: classes.dex */
public final class QF1 extends XF1 {
    @Override // p000.XF1
    /* renamed from: a */
    public final void mo4937a(long j, Object obj) {
        HB1 hb1 = (HB1) ((YE1) BJ1.m589i(j, obj));
        if (hb1.f4162a) {
            hb1.f4162a = false;
        }
    }

    @Override // p000.XF1
    /* renamed from: b */
    public final void mo4938b(long j, Object obj, Object obj2) {
        YE1 ye1Mo137c = (YE1) BJ1.m589i(j, obj);
        YE1 ye1 = (YE1) BJ1.m589i(j, obj2);
        int size = ye1Mo137c.size();
        int size2 = ye1.size();
        if (size > 0 && size2 > 0) {
            if (!((HB1) ye1Mo137c).f4162a) {
                ye1Mo137c = ye1Mo137c.mo137c(size2 + size);
            }
            ye1Mo137c.addAll(ye1);
        }
        if (size > 0) {
            ye1 = ye1Mo137c;
        }
        BJ1.m596p(j, obj, ye1);
    }
}
