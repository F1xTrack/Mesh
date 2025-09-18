package p000;

import java.util.Locale;

/* renamed from: WD */
/* loaded from: classes.dex */
public final class C1398WD {

    /* renamed from: a */
    public int f13065a;

    /* renamed from: b */
    public int f13066b;

    /* renamed from: c */
    public int f13067c;

    /* renamed from: d */
    public int f13068d;

    /* renamed from: e */
    public int f13069e;

    /* renamed from: f */
    public int f13070f;

    /* renamed from: g */
    public int f13071g;

    /* renamed from: h */
    public int f13072h;

    /* renamed from: i */
    public int f13073i;

    /* renamed from: j */
    public int f13074j;

    /* renamed from: k */
    public long f13075k;

    /* renamed from: l */
    public int f13076l;

    public final String toString() {
        int i = this.f13065a;
        int i2 = this.f13066b;
        int i3 = this.f13067c;
        int i4 = this.f13068d;
        int i5 = this.f13069e;
        int i6 = this.f13070f;
        int i7 = this.f13071g;
        int i8 = this.f13072h;
        int i9 = this.f13073i;
        int i10 = this.f13074j;
        long j = this.f13075k;
        int i11 = this.f13076l;
        int i12 = AbstractC7485Dh1.f2166a;
        Locale locale = Locale.US;
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i, i2, "\n queuedInputBuffers=");
        sbM8594m.append(i3);
        sbM8594m.append("\n skippedInputBuffers=");
        sbM8594m.append(i4);
        sbM8594m.append("\n renderedOutputBuffers=");
        sbM8594m.append(i5);
        sbM8594m.append("\n skippedOutputBuffers=");
        sbM8594m.append(i6);
        sbM8594m.append("\n droppedBuffers=");
        sbM8594m.append(i7);
        sbM8594m.append("\n droppedInputBuffers=");
        sbM8594m.append(i8);
        sbM8594m.append("\n maxConsecutiveDroppedBuffers=");
        sbM8594m.append(i9);
        sbM8594m.append("\n droppedToKeyframeEvents=");
        sbM8594m.append(i10);
        sbM8594m.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM8594m.append(j);
        sbM8594m.append("\n videoFrameProcessingOffsetCount=");
        sbM8594m.append(i11);
        sbM8594m.append("\n}");
        return sbM8594m.toString();
    }
}
