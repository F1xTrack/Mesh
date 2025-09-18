package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class WD {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        int i12 = AbstractC0277Dh1.a;
        Locale locale = Locale.US;
        StringBuilder sbM = AbstractC1705Vq.m("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i, i2, "\n queuedInputBuffers=");
        sbM.append(i3);
        sbM.append("\n skippedInputBuffers=");
        sbM.append(i4);
        sbM.append("\n renderedOutputBuffers=");
        sbM.append(i5);
        sbM.append("\n skippedOutputBuffers=");
        sbM.append(i6);
        sbM.append("\n droppedBuffers=");
        sbM.append(i7);
        sbM.append("\n droppedInputBuffers=");
        sbM.append(i8);
        sbM.append("\n maxConsecutiveDroppedBuffers=");
        sbM.append(i9);
        sbM.append("\n droppedToKeyframeEvents=");
        sbM.append(i10);
        sbM.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM.append(j);
        sbM.append("\n videoFrameProcessingOffsetCount=");
        sbM.append(i11);
        sbM.append("\n}");
        return sbM.toString();
    }
}
