package p000;

import android.media.MediaCodec;

/* renamed from: oB */
/* loaded from: classes.dex */
public final class C6536oB {

    /* renamed from: a */
    public byte[] f38853a;

    /* renamed from: b */
    public byte[] f38854b;

    /* renamed from: c */
    public int f38855c;

    /* renamed from: d */
    public int[] f38856d;

    /* renamed from: e */
    public int[] f38857e;

    /* renamed from: f */
    public int f38858f;

    /* renamed from: g */
    public int f38859g;

    /* renamed from: h */
    public int f38860h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f38861i;

    /* renamed from: j */
    public final C7967Mo1 f38862j;

    public C6536oB() {
        C7967Mo1 c7967Mo1;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f38861i = cryptoInfo;
        if (AbstractC7485Dh1.f2166a >= 24) {
            c7967Mo1 = new C7967Mo1();
            c7967Mo1.f7362a = cryptoInfo;
            c7967Mo1.f7363b = AbstractC4088g.m18354g();
        } else {
            c7967Mo1 = null;
        }
        this.f38862j = c7967Mo1;
    }
}
