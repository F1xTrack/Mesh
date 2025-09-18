package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.TC;

/* loaded from: classes.dex */
public final class a implements TC {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.TC
    public final void b() {
    }

    @Override // defpackage.TC
    public final Object m() {
        return this.a.rewind();
    }
}
