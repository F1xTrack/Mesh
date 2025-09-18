package defpackage;

import android.media.MediaCodec;

/* renamed from: oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6218oB {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final C0999Mo1 j;

    public C6218oB() {
        C0999Mo1 c0999Mo1;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (AbstractC0277Dh1.a >= 24) {
            c0999Mo1 = new C0999Mo1();
            c0999Mo1.a = cryptoInfo;
            c0999Mo1.b = AbstractC3876g.g();
        } else {
            c0999Mo1 = null;
        }
        this.j = c0999Mo1;
    }
}
