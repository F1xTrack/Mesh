package p000;

import java.io.File;

/* renamed from: nK */
/* loaded from: classes.dex */
public final class C6482nK {

    /* renamed from: a */
    public final String f38271a;

    /* renamed from: b */
    public final long[] f38272b;

    /* renamed from: c */
    public final File[] f38273c;

    /* renamed from: d */
    public final File[] f38274d;

    /* renamed from: e */
    public boolean f38275e;

    /* renamed from: f */
    public C1338VG f38276f;

    /* renamed from: g */
    public final /* synthetic */ C6736rK f38277g;

    public C6482nK(C6736rK c6736rK, String str) {
        this.f38277g = c6736rK;
        this.f38271a = str;
        int i = c6736rK.f41520g;
        this.f38272b = new long[i];
        this.f38273c = new File[i];
        this.f38274d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c6736rK.f41520g; i2++) {
            sb.append(i2);
            File[] fileArr = this.f38273c;
            String string = sb.toString();
            File file = c6736rK.f41514a;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.f38274d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final String m23124a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f38272b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
