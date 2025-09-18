package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p000.AbstractC0259E6;
import p000.C1482XY;
import p000.C4116gR;

/* renamed from: com.facebook.soloader.c */
/* loaded from: classes.dex */
public final class C1935c extends AbstractC1937e {

    /* renamed from: a */
    public final C4116gR[] f17985a;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1935c(p000.C4179hR r18, p000.C4179hR r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1935c.<init>(hR, hR):void");
    }

    @Override // com.facebook.soloader.AbstractC1937e
    /* renamed from: m */
    public final AbstractC0259E6[] mo11079m() {
        return this.f17985a;
    }

    @Override // com.facebook.soloader.AbstractC1937e
    /* renamed from: n */
    public final void mo11080n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (C4116gR c4116gR : this.f17985a) {
            FileInputStream fileInputStream = new FileInputStream(c4116gR.f27788c);
            try {
                C1482XY c1482xy = new C1482XY(c4116gR, fileInputStream);
                fileInputStream = null;
                try {
                    AbstractC1937e.m11090a(c1482xy, bArr, file);
                    c1482xy.close();
                } finally {
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
    }
}
