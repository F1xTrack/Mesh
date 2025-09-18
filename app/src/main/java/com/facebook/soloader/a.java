package com.facebook.soloader;

import defpackage.C8214yf;
import defpackage.E6;
import defpackage.O90;
import defpackage.VR;
import defpackage.XY;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a extends e {
    public VR[] a;
    public final ZipFile b;
    public final C8214yf c;
    public final /* synthetic */ C8214yf d;
    public final boolean e;
    public final File f;
    public final int g;

    public a(C8214yf c8214yf, C8214yf c8214yf2, boolean z) {
        this.d = c8214yf;
        this.b = new ZipFile(c8214yf.e);
        this.c = c8214yf2;
        this.e = z;
        this.f = new File(c8214yf.d.getApplicationInfo().nativeLibraryDir);
        this.g = c8214yf.g;
    }

    @Override // com.facebook.soloader.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.facebook.soloader.e
    public final E6[] m() {
        return p();
    }

    @Override // com.facebook.soloader.e
    public final void n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (VR vr : p()) {
            InputStream inputStream = this.b.getInputStream(vr.c);
            try {
                XY xy = new XY(vr, inputStream);
                inputStream = null;
                try {
                    e.a(xy, bArr, file);
                    xy.close();
                } finally {
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public final VR[] o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.d.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.b.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(strGroup);
                    VR vr = (VR) map.get(strGroup2);
                    if (vr == null || i < vr.d) {
                        map.put(strGroup2, new VR(strGroup2, zipEntryNextElement, i));
                    }
                }
            }
        }
        this.c.getClass();
        VR[] vrArr = (VR[]) map.values().toArray(new VR[map.size()]);
        Arrays.sort(vrArr);
        return vrArr;
    }

    public final VR[] p() {
        VR[] vrArr = this.a;
        if (vrArr != null) {
            return vrArr;
        }
        VR[] vrArrO = o();
        this.a = vrArrO;
        if (this.e || (this.g & 1) == 0) {
            return vrArrO;
        }
        for (VR vr : vrArrO) {
            ZipEntry zipEntry = vr.c;
            zipEntry.getName();
            File file = this.f;
            File file2 = new File(file, (String) vr.a);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.a;
                }
                O90.k(3, "BackupSoSource");
            } catch (IOException e) {
                e.toString();
            }
        }
        VR[] vrArr2 = new VR[0];
        this.a = vrArr2;
        return vrArr2;
    }
}
