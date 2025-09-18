package defpackage;

import java.io.File;

/* renamed from: nK */
/* loaded from: classes.dex */
public final class C6054nK {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public VG f;
    public final /* synthetic */ C6817rK g;

    public C6054nK(C6817rK c6817rK, String str) {
        this.g = c6817rK;
        this.a = str;
        int i = c6817rK.g;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c6817rK.g; i2++) {
            sb.append(i2);
            File[] fileArr = this.c;
            String string = sb.toString();
            File file = c6817rK.a;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
