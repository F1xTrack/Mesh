package p000;

/* renamed from: Ca */
/* loaded from: classes.dex */
public final class C0163Ca extends Exception {

    /* renamed from: a */
    public final int f1454a;

    /* renamed from: b */
    public final boolean f1455b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0163Ca(int i, int i2, int i3, int i4, C6686qX c6686qX, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("AudioTrack init failed ", " Config(", i, i2, ", ");
        sbM8594m.append(i3);
        sbM8594m.append(", ");
        sbM8594m.append(i4);
        sbM8594m.append(") ");
        sbM8594m.append(c6686qX);
        sbM8594m.append(z ? " (recoverable)" : "");
        super(sbM8594m.toString(), runtimeException);
        this.f1454a = i;
        this.f1455b = z;
    }
}
