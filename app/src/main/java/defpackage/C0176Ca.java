package defpackage;

/* renamed from: Ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176Ca extends Exception {
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0176Ca(int i, int i2, int i3, int i4, C6666qX c6666qX, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM = AbstractC1705Vq.m("AudioTrack init failed ", " Config(", i, i2, ", ");
        sbM.append(i3);
        sbM.append(", ");
        sbM.append(i4);
        sbM.append(") ");
        sbM.append(c6666qX);
        sbM.append(z ? " (recoverable)" : "");
        super(sbM.toString(), runtimeException);
        this.a = i;
        this.b = z;
    }
}
