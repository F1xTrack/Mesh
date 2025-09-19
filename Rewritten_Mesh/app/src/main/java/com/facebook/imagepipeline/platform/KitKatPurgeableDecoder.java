package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p000.AbstractC1852cW;
import p000.AbstractC7292zt;
import p000.C11339uq0;
import p000.InterfaceC1090RK;

@InterfaceC1090RK
@TargetApi(19)
/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    @InterfaceC1090RK
    public KitKatPurgeableDecoder(AbstractC1852cW abstractC1852cW) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    public final Bitmap mo10904c(AbstractC7292zt abstractC7292zt, BitmapFactory.Options options) {
        ((C11339uq0) abstractC7292zt.m26572w()).m25253p();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    public final Bitmap mo10905d(AbstractC7292zt abstractC7292zt, int i, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.m10903e(abstractC7292zt, i);
        if (i <= ((C11339uq0) abstractC7292zt.m26572w()).m25253p()) {
            throw null;
        }
        throw new IllegalArgumentException();
    }
}
