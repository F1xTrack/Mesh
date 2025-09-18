package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class VQ implements InterfaceC7848wj1, InterfaceC0140Bo, PB0 {
    public InterfaceC7848wj1 a;
    public InterfaceC0140Bo b;
    public InterfaceC7848wj1 c;
    public InterfaceC0140Bo d;

    @Override // defpackage.InterfaceC0140Bo
    public final void a(long j, float[] fArr) {
        InterfaceC0140Bo interfaceC0140Bo = this.d;
        if (interfaceC0140Bo != null) {
            interfaceC0140Bo.a(j, fArr);
        }
        InterfaceC0140Bo interfaceC0140Bo2 = this.b;
        if (interfaceC0140Bo2 != null) {
            interfaceC0140Bo2.a(j, fArr);
        }
    }

    @Override // defpackage.InterfaceC0140Bo
    public final void b() {
        InterfaceC0140Bo interfaceC0140Bo = this.d;
        if (interfaceC0140Bo != null) {
            interfaceC0140Bo.b();
        }
        InterfaceC0140Bo interfaceC0140Bo2 = this.b;
        if (interfaceC0140Bo2 != null) {
            interfaceC0140Bo2.b();
        }
    }

    @Override // defpackage.InterfaceC7848wj1
    public final void c(long j, long j2, C6666qX c6666qX, MediaFormat mediaFormat) {
        InterfaceC7848wj1 interfaceC7848wj1 = this.c;
        if (interfaceC7848wj1 != null) {
            interfaceC7848wj1.c(j, j2, c6666qX, mediaFormat);
        }
        InterfaceC7848wj1 interfaceC7848wj12 = this.a;
        if (interfaceC7848wj12 != null) {
            interfaceC7848wj12.c(j, j2, c6666qX, mediaFormat);
        }
    }

    @Override // defpackage.PB0
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.a = (InterfaceC7848wj1) obj;
            return;
        }
        if (i == 8) {
            this.b = (InterfaceC0140Bo) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C5813m31 c5813m31 = (C5813m31) obj;
        if (c5813m31 == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = c5813m31.getVideoFrameMetadataListener();
            this.d = c5813m31.getCameraMotionListener();
        }
    }
}
