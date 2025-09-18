package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import p000.BinderC8245Rx1;
import p000.BinderC8916bx0;
import p000.FB1;
import p000.InterfaceC9197e50;
import p000.PB1;
import p000.RA1;

@KeepForSdk
@DynamiteApi
/* loaded from: classes.dex */
public class ThickBarcodeScannerCreator extends PB1 {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // p000.SB1
    public FB1 newBarcodeScanner(InterfaceC9197e50 interfaceC9197e50, RA1 ra1) {
        return new BinderC8245Rx1((Context) BinderC8916bx0.m10547H(interfaceC9197e50), ra1);
    }
}
