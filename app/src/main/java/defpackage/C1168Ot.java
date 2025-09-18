package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: Ot, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168Ot {
    public static final C5601ky f = new C5601ky(StringUtils.COMMA, 1);
    public final C0779Jt a;
    public final C0857Kt b;
    public final C0934Lt c;
    public final C1012Mt d;
    public final int e;

    public C1168Ot(C0779Jt c0779Jt, C0857Kt c0857Kt, C0934Lt c0934Lt, C1012Mt c1012Mt, int i) {
        this.a = c0779Jt;
        this.b = c0857Kt;
        this.c = c0934Lt;
        this.d = c1012Mt;
        this.e = i;
    }

    public final C3538eD a(C3538eD c3538eD) {
        C6591q8 c6591q8 = new C6591q8();
        C0779Jt c0779Jt = this.a;
        ArrayList arrayList = new ArrayList();
        int i = c0779Jt.a;
        if (i != -2147483647) {
            arrayList.add("br=" + i);
        }
        int i2 = c0779Jt.b;
        if (i2 != -2147483647) {
            arrayList.add("tb=" + i2);
        }
        long j = c0779Jt.c;
        if (j != -9223372036854775807L) {
            arrayList.add("d=" + j);
        }
        String str = (String) c0779Jt.d;
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("ot=" + str);
        }
        arrayList.addAll((P70) c0779Jt.e);
        if (!arrayList.isEmpty()) {
            c6591q8.d("CMCD-Object", arrayList);
        }
        C0857Kt c0857Kt = this.b;
        ArrayList arrayList2 = new ArrayList();
        long j2 = c0857Kt.a;
        if (j2 != -9223372036854775807L) {
            arrayList2.add("bl=" + j2);
        }
        long j3 = c0857Kt.b;
        if (j3 != -2147483647L) {
            arrayList2.add("mtp=" + j3);
        }
        long j4 = c0857Kt.c;
        if (j4 != -9223372036854775807L) {
            arrayList2.add("dl=" + j4);
        }
        if (c0857Kt.d) {
            arrayList2.add("su");
        }
        String str2 = c0857Kt.e;
        if (!TextUtils.isEmpty(str2)) {
            int i3 = AbstractC0277Dh1.a;
            Locale locale = Locale.US;
            arrayList2.add("nor=\"" + str2 + "\"");
        }
        String str3 = c0857Kt.f;
        if (!TextUtils.isEmpty(str3)) {
            int i4 = AbstractC0277Dh1.a;
            Locale locale2 = Locale.US;
            arrayList2.add("nrr=\"" + str3 + "\"");
        }
        arrayList2.addAll(c0857Kt.g);
        if (!arrayList2.isEmpty()) {
            c6591q8.d("CMCD-Request", arrayList2);
        }
        C0934Lt c0934Lt = this.c;
        ArrayList arrayList3 = new ArrayList();
        String str4 = c0934Lt.a;
        if (!TextUtils.isEmpty(str4)) {
            int i5 = AbstractC0277Dh1.a;
            Locale locale3 = Locale.US;
            arrayList3.add("cid=\"" + str4 + "\"");
        }
        String str5 = c0934Lt.b;
        if (!TextUtils.isEmpty(str5)) {
            int i6 = AbstractC0277Dh1.a;
            Locale locale4 = Locale.US;
            arrayList3.add("sid=\"" + str5 + "\"");
        }
        String str6 = c0934Lt.c;
        if (!TextUtils.isEmpty(str6)) {
            arrayList3.add("sf=" + str6);
        }
        String str7 = c0934Lt.d;
        if (!TextUtils.isEmpty(str7)) {
            arrayList3.add("st=" + str7);
        }
        float f2 = c0934Lt.e;
        if (f2 != -3.4028235E38f && f2 != 1.0f) {
            Object[] objArr = {"pr", Float.valueOf(f2)};
            int i7 = AbstractC0277Dh1.a;
            arrayList3.add(String.format(Locale.US, "%s=%.2f", objArr));
        }
        arrayList3.addAll(c0934Lt.f);
        if (!arrayList3.isEmpty()) {
            c6591q8.d("CMCD-Session", arrayList3);
        }
        C1012Mt c1012Mt = this.d;
        ArrayList arrayList4 = new ArrayList();
        int i8 = c1012Mt.a;
        if (i8 != -2147483647) {
            arrayList4.add("rtp=" + i8);
        }
        if (c1012Mt.b) {
            arrayList4.add("bs");
        }
        arrayList4.addAll(c1012Mt.c);
        if (!arrayList4.isEmpty()) {
            c6591q8.d("CMCD-Status", arrayList4);
        }
        int i9 = this.e;
        C5601ky c5601ky = f;
        if (i9 != 0) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it = c6591q8.a().values().iterator();
            while (it.hasNext()) {
                arrayList5.addAll((Collection) it.next());
            }
            Collections.sort(arrayList5);
            Uri.Builder builderBuildUpon = c3538eD.a.buildUpon();
            c5601ky.getClass();
            Iterator it2 = arrayList5.iterator();
            StringBuilder sb = new StringBuilder();
            c5601ky.a(sb, it2);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("CMCD", sb.toString());
            C3348dD c3348dDA = c3538eD.a();
            c3348dDA.a = builderAppendQueryParameter.build();
            return c3348dDA.a();
        }
        VY vyA = C5500kQ0.a();
        Set<String> setH = c6591q8.a;
        if (setH == null) {
            setH = c6591q8.h();
            c6591q8.a = setH;
        }
        for (String str8 : setH) {
            List listC = c6591q8.c(str8);
            Collections.sort(listC);
            c5601ky.getClass();
            Iterator it3 = listC.iterator();
            StringBuilder sb2 = new StringBuilder();
            c5601ky.a(sb2, it3);
            vyA.Y(str8, sb2.toString());
        }
        C5500kQ0 c5500kQ0P = vyA.p();
        HashMap map = new HashMap(c3538eD.e);
        map.putAll(c5500kQ0P);
        return new C3538eD(c3538eD.a, c3538eD.b, c3538eD.c, c3538eD.d, map, c3538eD.f, c3538eD.g, c3538eD.h, c3538eD.i);
    }
}
