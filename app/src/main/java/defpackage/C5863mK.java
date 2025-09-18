package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: mK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5863mK {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public VG g;
    public int h;
    public long i;
    public final /* synthetic */ C6627qK j;

    public C5863mK(C6627qK c6627qK, String str) {
        O90.f(str, "key");
        this.j = c6627qK;
        this.a = str;
        c6627qK.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(new File(this.j.a, sb.toString()));
            sb.append(".tmp");
            this.d.add(new File(this.j.a, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [lK] */
    public final C6245oK a() throws IOException {
        byte[] bArr = AbstractC0199Ch1.a;
        if (!this.e) {
            return null;
        }
        C6627qK c6627qK = this.j;
        if (!c6627qK.k && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                File file = (File) this.c.get(i);
                O90.f(file, "file");
                Logger logger = AbstractC7889wx0.a;
                C7357u9 c7357u9 = new C7357u9(new FileInputStream(file), C0334Ea1.d);
                if (!c6627qK.k) {
                    this.h++;
                    c7357u9 = new C5672lK(c7357u9, c6627qK, this);
                }
                arrayList.add(c7357u9);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC0199Ch1.d((U21) it.next());
                }
                try {
                    c6627qK.W(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
        return new C6245oK(this.j, this.a, this.i, arrayList, jArr);
    }
}
