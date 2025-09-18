package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.InterfaceC1208TC;

/* renamed from: com.bumptech.glide.load.data.a */
/* loaded from: classes.dex */
public final class C1875a implements InterfaceC1208TC {

    /* renamed from: a */
    public final ParcelFileDescriptorRewinder$InternalRewinder f17787a;

    public C1875a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f17787a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: a */
    public final ParcelFileDescriptor m10891a() {
        return this.f17787a.rewind();
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: b */
    public final void mo2895b() {
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: m */
    public final Object mo2902m() {
        return this.f17787a.rewind();
    }
}
