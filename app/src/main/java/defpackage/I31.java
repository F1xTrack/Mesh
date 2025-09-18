package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I31 {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final C6666qX[] j;
    public final int k;
    public final String l;
    public final String m;
    public final ArrayList n;
    public final long[] o;
    public final long p;

    public I31(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6666qX[] c6666qXArr, ArrayList arrayList, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.a = i;
        this.b = str3;
        this.c = j;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = c6666qXArr;
        this.n = arrayList;
        this.o = jArr;
        this.p = j2;
        this.k = arrayList.size();
    }

    public final Uri a(int i, int i2) {
        C6666qX[] c6666qXArr = this.j;
        YN1.f(c6666qXArr != null);
        ArrayList arrayList = this.n;
        YN1.f(arrayList != null);
        YN1.f(i2 < arrayList.size());
        String string = Integer.toString(c6666qXArr[i].i);
        String string2 = ((Long) arrayList.get(i2)).toString();
        return AbstractC2051a02.i(this.l, this.m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
    }

    public final I31 b(C6666qX[] c6666qXArr) {
        long[] jArr = this.o;
        return new I31(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, c6666qXArr, this.n, jArr, this.p);
    }

    public final long c(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }
}
