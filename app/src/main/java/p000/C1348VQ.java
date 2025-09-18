package p000;

import android.media.MediaFormat;

/* renamed from: VQ */
/* loaded from: classes.dex */
public final class C1348VQ implements InterfaceC11581wj1, InterfaceC0114Bo, PB0 {

    /* renamed from: a */
    public InterfaceC11581wj1 f12554a;

    /* renamed from: b */
    public InterfaceC0114Bo f12555b;

    /* renamed from: c */
    public InterfaceC11581wj1 f12556c;

    /* renamed from: d */
    public InterfaceC0114Bo f12557d;

    @Override // p000.InterfaceC0114Bo
    /* renamed from: a */
    public final void mo880a(long j, float[] fArr) {
        InterfaceC0114Bo interfaceC0114Bo = this.f12557d;
        if (interfaceC0114Bo != null) {
            interfaceC0114Bo.mo880a(j, fArr);
        }
        InterfaceC0114Bo interfaceC0114Bo2 = this.f12555b;
        if (interfaceC0114Bo2 != null) {
            interfaceC0114Bo2.mo880a(j, fArr);
        }
    }

    @Override // p000.InterfaceC0114Bo
    /* renamed from: b */
    public final void mo881b() {
        InterfaceC0114Bo interfaceC0114Bo = this.f12557d;
        if (interfaceC0114Bo != null) {
            interfaceC0114Bo.mo881b();
        }
        InterfaceC0114Bo interfaceC0114Bo2 = this.f12555b;
        if (interfaceC0114Bo2 != null) {
            interfaceC0114Bo2.mo881b();
        }
    }

    @Override // p000.InterfaceC11581wj1
    /* renamed from: c */
    public final void mo8438c(long j, long j2, C6686qX c6686qX, MediaFormat mediaFormat) {
        InterfaceC11581wj1 interfaceC11581wj1 = this.f12556c;
        if (interfaceC11581wj1 != null) {
            interfaceC11581wj1.mo8438c(j, j2, c6686qX, mediaFormat);
        }
        InterfaceC11581wj1 interfaceC11581wj12 = this.f12554a;
        if (interfaceC11581wj12 != null) {
            interfaceC11581wj12.mo8438c(j, j2, c6686qX, mediaFormat);
        }
    }

    @Override // p000.PB0
    /* renamed from: d */
    public final void mo259d(int i, Object obj) {
        if (i == 7) {
            this.f12554a = (InterfaceC11581wj1) obj;
            return;
        }
        if (i == 8) {
            this.f12555b = (InterfaceC0114Bo) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C10217m31 c10217m31 = (C10217m31) obj;
        if (c10217m31 == null) {
            this.f12556c = null;
            this.f12557d = null;
        } else {
            this.f12556c = c10217m31.getVideoFrameMetadataListener();
            this.f12557d = c10217m31.getCameraMotionListener();
        }
    }
}
