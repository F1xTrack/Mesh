package com.facebook.soloader;

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
import p000.AbstractC0259E6;
import p000.C1349VR;
import p000.C1482XY;
import p000.C7215yf;
import p000.O90;

/* renamed from: com.facebook.soloader.a */
/* loaded from: classes.dex */
public final class C1933a extends AbstractC1937e {

    /* renamed from: a */
    public C1349VR[] f17975a;

    /* renamed from: b */
    public final ZipFile f17976b;

    /* renamed from: c */
    public final C7215yf f17977c;

    /* renamed from: d */
    public final /* synthetic */ C7215yf f17978d;

    /* renamed from: e */
    public final boolean f17979e;

    /* renamed from: f */
    public final File f17980f;

    /* renamed from: g */
    public final int f17981g;

    public C1933a(C7215yf c7215yf, C7215yf c7215yf2, boolean z) {
        this.f17978d = c7215yf;
        this.f17976b = new ZipFile(c7215yf.f46376e);
        this.f17977c = c7215yf2;
        this.f17979e = z;
        this.f17980f = new File(c7215yf.f42548d.getApplicationInfo().nativeLibraryDir);
        this.f17981g = c7215yf.f46378g;
    }

    @Override // com.facebook.soloader.AbstractC1937e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17976b.close();
    }

    @Override // com.facebook.soloader.AbstractC1937e
    /* renamed from: m */
    public final AbstractC0259E6[] mo11079m() {
        return m11082p();
    }

    @Override // com.facebook.soloader.AbstractC1937e
    /* renamed from: n */
    public final void mo11080n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (C1349VR c1349vr : m11082p()) {
            InputStream inputStream = this.f17976b.getInputStream(c1349vr.f12563c);
            try {
                C1482XY c1482xy = new C1482XY(c1349vr, inputStream);
                inputStream = null;
                try {
                    AbstractC1937e.m11090a(c1482xy, bArr, file);
                    c1482xy.close();
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

    /* renamed from: o */
    public final C1349VR[] m11081o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.f17978d.f46377f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.f17976b.entries();
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
                    C1349VR c1349vr = (C1349VR) map.get(strGroup2);
                    if (c1349vr == null || i < c1349vr.f12564d) {
                        map.put(strGroup2, new C1349VR(strGroup2, zipEntryNextElement, i));
                    }
                }
            }
        }
        this.f17977c.getClass();
        C1349VR[] c1349vrArr = (C1349VR[]) map.values().toArray(new C1349VR[map.size()]);
        Arrays.sort(c1349vrArr);
        return c1349vrArr;
    }

    /* renamed from: p */
    public final C1349VR[] m11082p() {
        C1349VR[] c1349vrArr = this.f17975a;
        if (c1349vrArr != null) {
            return c1349vrArr;
        }
        C1349VR[] c1349vrArrM11081o = m11081o();
        this.f17975a = c1349vrArrM11081o;
        if (this.f17979e || (this.f17981g & 1) == 0) {
            return c1349vrArrM11081o;
        }
        for (C1349VR c1349vr : c1349vrArrM11081o) {
            ZipEntry zipEntry = c1349vr.f12563c;
            zipEntry.getName();
            File file = this.f17980f;
            File file2 = new File(file, (String) c1349vr.f2473a);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.f17975a;
                }
                O90.m5973k(3, "BackupSoSource");
            } catch (IOException e) {
                e.toString();
            }
        }
        C1349VR[] c1349vrArr2 = new C1349VR[0];
        this.f17975a = c1349vrArr2;
        return c1349vrArr2;
    }
}
