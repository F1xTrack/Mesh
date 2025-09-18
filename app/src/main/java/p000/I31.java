package p000;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I31 {

    /* renamed from: a */
    public final int f4674a;

    /* renamed from: b */
    public final String f4675b;

    /* renamed from: c */
    public final long f4676c;

    /* renamed from: d */
    public final String f4677d;

    /* renamed from: e */
    public final int f4678e;

    /* renamed from: f */
    public final int f4679f;

    /* renamed from: g */
    public final int f4680g;

    /* renamed from: h */
    public final int f4681h;

    /* renamed from: i */
    public final String f4682i;

    /* renamed from: j */
    public final C6686qX[] f4683j;

    /* renamed from: k */
    public final int f4684k;

    /* renamed from: l */
    public final String f4685l;

    /* renamed from: m */
    public final String f4686m;

    /* renamed from: n */
    public final ArrayList f4687n;

    /* renamed from: o */
    public final long[] f4688o;

    /* renamed from: p */
    public final long f4689p;

    public I31(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6686qX[] c6686qXArr, ArrayList arrayList, long[] jArr, long j2) {
        this.f4685l = str;
        this.f4686m = str2;
        this.f4674a = i;
        this.f4675b = str3;
        this.f4676c = j;
        this.f4677d = str4;
        this.f4678e = i2;
        this.f4679f = i3;
        this.f4680g = i4;
        this.f4681h = i5;
        this.f4682i = str5;
        this.f4683j = c6686qXArr;
        this.f4687n = arrayList;
        this.f4688o = jArr;
        this.f4689p = j2;
        this.f4684k = arrayList.size();
    }

    /* renamed from: a */
    public final Uri m3739a(int i, int i2) {
        C6686qX[] c6686qXArr = this.f4683j;
        YN1.m9281f(c6686qXArr != null);
        ArrayList arrayList = this.f4687n;
        YN1.m9281f(arrayList != null);
        YN1.m9281f(i2 < arrayList.size());
        String string = Integer.toString(c6686qXArr[i].f40970i);
        String string2 = ((Long) arrayList.get(i2)).toString();
        return AbstractC8668a02.m9660i(this.f4685l, this.f4686m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
    }

    /* renamed from: b */
    public final I31 m3740b(C6686qX[] c6686qXArr) {
        long[] jArr = this.f4688o;
        return new I31(this.f4685l, this.f4686m, this.f4674a, this.f4675b, this.f4676c, this.f4677d, this.f4678e, this.f4679f, this.f4680g, this.f4681h, this.f4682i, c6686qXArr, this.f4687n, jArr, this.f4689p);
    }

    /* renamed from: c */
    public final long m3741c(int i) {
        if (i == this.f4684k - 1) {
            return this.f4689p;
        }
        long[] jArr = this.f4688o;
        return jArr[i + 1] - jArr[i];
    }
}
