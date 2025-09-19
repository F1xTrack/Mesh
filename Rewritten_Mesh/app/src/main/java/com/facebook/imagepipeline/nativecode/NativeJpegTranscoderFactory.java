package com.facebook.imagepipeline.nativecode;

import p000.AbstractC0646KF;
import p000.AbstractC10195lu0;
import p000.D60;
import p000.InterfaceC1090RK;
import p000.InterfaceC11504w70;
import p000.InterfaceC11631x70;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements InterfaceC11631x70 {

    /* renamed from: a */
    public final int f17856a;

    /* renamed from: b */
    public final boolean f17857b;

    /* renamed from: c */
    public final boolean f17858c;

    @InterfaceC1090RK
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f17856a = i;
        this.f17857b = z;
        this.f17858c = z2;
    }

    @Override // p000.InterfaceC11631x70
    @InterfaceC1090RK
    public InterfaceC11504w70 createImageTranscoder(D60 d60, boolean z) {
        if (d60 != AbstractC0646KF.f5957a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.f17853a = z;
        nativeJpegTranscoder.f17854b = this.f17856a;
        nativeJpegTranscoder.f17855c = this.f17857b;
        if (this.f17858c) {
            AbstractC10195lu0.m22592a();
        }
        return nativeJpegTranscoder;
    }
}
