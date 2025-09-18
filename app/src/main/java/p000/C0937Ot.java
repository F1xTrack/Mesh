package p000;

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

/* renamed from: Ot */
/* loaded from: classes.dex */
public final class C0937Ot {

    /* renamed from: f */
    public static final C6333ky f8654f = new C6333ky(StringUtils.COMMA, 1);

    /* renamed from: a */
    public final C0623Jt f8655a;

    /* renamed from: b */
    public final C0686Kt f8656b;

    /* renamed from: c */
    public final C0748Lt f8657c;

    /* renamed from: d */
    public final C0811Mt f8658d;

    /* renamed from: e */
    public final int f8659e;

    public C0937Ot(C0623Jt c0623Jt, C0686Kt c0686Kt, C0748Lt c0748Lt, C0811Mt c0811Mt, int i) {
        this.f8655a = c0623Jt;
        this.f8656b = c0686Kt;
        this.f8657c = c0748Lt;
        this.f8658d = c0811Mt;
        this.f8659e = i;
    }

    /* renamed from: a */
    public final C3976eD m6179a(C3976eD c3976eD) {
        C6661q8 c6661q8 = new C6661q8();
        C0623Jt c0623Jt = this.f8655a;
        ArrayList arrayList = new ArrayList();
        int i = c0623Jt.f5769a;
        if (i != -2147483647) {
            arrayList.add("br=" + i);
        }
        int i2 = c0623Jt.f5770b;
        if (i2 != -2147483647) {
            arrayList.add("tb=" + i2);
        }
        long j = c0623Jt.f5771c;
        if (j != -9223372036854775807L) {
            arrayList.add("d=" + j);
        }
        String str = (String) c0623Jt.f5772d;
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("ot=" + str);
        }
        arrayList.addAll((P70) c0623Jt.f5773e);
        if (!arrayList.isEmpty()) {
            c6661q8.m5491d("CMCD-Object", arrayList);
        }
        C0686Kt c0686Kt = this.f8656b;
        ArrayList arrayList2 = new ArrayList();
        long j2 = c0686Kt.f6375a;
        if (j2 != -9223372036854775807L) {
            arrayList2.add("bl=" + j2);
        }
        long j3 = c0686Kt.f6376b;
        if (j3 != -2147483647L) {
            arrayList2.add("mtp=" + j3);
        }
        long j4 = c0686Kt.f6377c;
        if (j4 != -9223372036854775807L) {
            arrayList2.add("dl=" + j4);
        }
        if (c0686Kt.f6378d) {
            arrayList2.add("su");
        }
        String str2 = c0686Kt.f6379e;
        if (!TextUtils.isEmpty(str2)) {
            int i3 = AbstractC7485Dh1.f2166a;
            Locale locale = Locale.US;
            arrayList2.add("nor=\"" + str2 + "\"");
        }
        String str3 = c0686Kt.f6380f;
        if (!TextUtils.isEmpty(str3)) {
            int i4 = AbstractC7485Dh1.f2166a;
            Locale locale2 = Locale.US;
            arrayList2.add("nrr=\"" + str3 + "\"");
        }
        arrayList2.addAll(c0686Kt.f6381g);
        if (!arrayList2.isEmpty()) {
            c6661q8.m5491d("CMCD-Request", arrayList2);
        }
        C0748Lt c0748Lt = this.f8657c;
        ArrayList arrayList3 = new ArrayList();
        String str4 = c0748Lt.f6916a;
        if (!TextUtils.isEmpty(str4)) {
            int i5 = AbstractC7485Dh1.f2166a;
            Locale locale3 = Locale.US;
            arrayList3.add("cid=\"" + str4 + "\"");
        }
        String str5 = c0748Lt.f6917b;
        if (!TextUtils.isEmpty(str5)) {
            int i6 = AbstractC7485Dh1.f2166a;
            Locale locale4 = Locale.US;
            arrayList3.add("sid=\"" + str5 + "\"");
        }
        String str6 = c0748Lt.f6918c;
        if (!TextUtils.isEmpty(str6)) {
            arrayList3.add("sf=" + str6);
        }
        String str7 = c0748Lt.f6919d;
        if (!TextUtils.isEmpty(str7)) {
            arrayList3.add("st=" + str7);
        }
        float f = c0748Lt.f6920e;
        if (f != -3.4028235E38f && f != 1.0f) {
            Object[] objArr = {"pr", Float.valueOf(f)};
            int i7 = AbstractC7485Dh1.f2166a;
            arrayList3.add(String.format(Locale.US, "%s=%.2f", objArr));
        }
        arrayList3.addAll(c0748Lt.f6921f);
        if (!arrayList3.isEmpty()) {
            c6661q8.m5491d("CMCD-Session", arrayList3);
        }
        C0811Mt c0811Mt = this.f8658d;
        ArrayList arrayList4 = new ArrayList();
        int i8 = c0811Mt.f7378a;
        if (i8 != -2147483647) {
            arrayList4.add("rtp=" + i8);
        }
        if (c0811Mt.f7379b) {
            arrayList4.add("bs");
        }
        arrayList4.addAll(c0811Mt.f7380c);
        if (!arrayList4.isEmpty()) {
            c6661q8.m5491d("CMCD-Status", arrayList4);
        }
        int i9 = this.f8659e;
        C6333ky c6333ky = f8654f;
        if (i9 != 0) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it = c6661q8.mo4619a().values().iterator();
            while (it.hasNext()) {
                arrayList5.addAll((Collection) it.next());
            }
            Collections.sort(arrayList5);
            Uri.Builder builderBuildUpon = c3976eD.f26595a.buildUpon();
            c6333ky.getClass();
            Iterator it2 = arrayList5.iterator();
            StringBuilder sb = new StringBuilder();
            c6333ky.m22321a(sb, it2);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("CMCD", sb.toString());
            C3914dD c3914dDM17879a = c3976eD.m17879a();
            c3914dDM17879a.f25870a = builderAppendQueryParameter.build();
            return c3914dDM17879a.m17503a();
        }
        C1356VY c1356vyM22205a = C10007kQ0.m22205a();
        Set<String> setMo25067h = c6661q8.f7447a;
        if (setMo25067h == null) {
            setMo25067h = c6661q8.mo25067h();
            c6661q8.f7447a = setMo25067h;
        }
        for (String str8 : setMo25067h) {
            List listMo5490c = c6661q8.mo5490c(str8);
            Collections.sort(listMo5490c);
            c6333ky.getClass();
            Iterator it3 = listMo5490c.iterator();
            StringBuilder sb2 = new StringBuilder();
            c6333ky.m22321a(sb2, it3);
            c1356vyM22205a.m8486Y(str8, sb2.toString());
        }
        C10007kQ0 c10007kQ0M8503p = c1356vyM22205a.m8503p();
        HashMap map = new HashMap(c3976eD.f26599e);
        map.putAll(c10007kQ0M8503p);
        return new C3976eD(c3976eD.f26595a, c3976eD.f26596b, c3976eD.f26597c, c3976eD.f26598d, map, c3976eD.f26600f, c3976eD.f26601g, c3976eD.f26602h, c3976eD.f26603i);
    }
}
