package p000;

import java.nio.ByteBuffer;

/* renamed from: Tg */
/* loaded from: classes.dex */
public final class C1238Tg extends C1587ZD {

    /* renamed from: j */
    public long f11464j;

    /* renamed from: k */
    public int f11465k;

    /* renamed from: l */
    public int f11466l;

    @Override // p000.C1587ZD
    /* renamed from: t */
    public final void mo7722t() {
        super.mo7722t();
        this.f11465k = 0;
    }

    /* renamed from: x */
    public final boolean m7723x(C1587ZD c1587zd) {
        ByteBuffer byteBuffer;
        YN1.m9278c(!c1587zd.m2501g(1073741824));
        YN1.m9278c(!c1587zd.m2501g(268435456));
        YN1.m9278c(!c1587zd.m2501g(4));
        if (m7724y()) {
            if (this.f11465k >= this.f11466l) {
                return false;
            }
            ByteBuffer byteBuffer2 = c1587zd.f14798e;
            if (byteBuffer2 != null && (byteBuffer = this.f14798e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f11465k;
        this.f11465k = i + 1;
        if (i == 0) {
            this.f14800g = c1587zd.f14800g;
            if (c1587zd.m2501g(1)) {
                this.f3082b = 1;
            }
        }
        ByteBuffer byteBuffer3 = c1587zd.f14798e;
        if (byteBuffer3 != null) {
            m9506v(byteBuffer3.remaining());
            this.f14798e.put(byteBuffer3);
        }
        this.f11464j = c1587zd.f14800g;
        return true;
    }

    /* renamed from: y */
    public final boolean m7724y() {
        return this.f11465k > 0;
    }
}
