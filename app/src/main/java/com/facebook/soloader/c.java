package com.facebook.soloader;

import defpackage.C3962gR;
import defpackage.E6;
import defpackage.XY;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends e {
    public final C3962gR[] a;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(defpackage.C4153hR r18, defpackage.C4153hR r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.<init>(hR, hR):void");
    }

    @Override // com.facebook.soloader.e
    public final E6[] m() {
        return this.a;
    }

    @Override // com.facebook.soloader.e
    public final void n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (C3962gR c3962gR : this.a) {
            FileInputStream fileInputStream = new FileInputStream(c3962gR.c);
            try {
                XY xy = new XY(c3962gR, fileInputStream);
                fileInputStream = null;
                try {
                    e.a(xy, bArr, file);
                    xy.close();
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
