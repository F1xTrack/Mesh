package com.facebook.hermes.intl;

import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p000.AbstractC10471o22;
import p000.AbstractC11234u10;
import p000.AbstractC7858Km0;
import p000.AbstractC9080dA1;
import p000.C0226Da;
import p000.C7314Aa0;
import p000.C7366Ba0;
import p000.C9196e41;
import p000.CJ1;
import p000.EnumC10093l50;
import p000.EnumC10349n50;
import p000.EnumC10477o50;
import p000.EnumC10605p50;
import p000.EnumC10733q50;
import p000.EnumC10861r50;
import p000.EnumC10989s50;
import p000.EnumC11117t50;
import p000.EnumC11245u50;
import p000.EnumC11373v50;
import p000.EnumC9837j50;
import p000.EnumC9965k50;
import p000.InterfaceC0965PK;
import p000.InterfaceC11500w50;
import p000.N90;
import p000.QQ0;
import p000.Y40;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class DateTimeFormat {

    /* renamed from: a */
    public final InterfaceC11500w50 f17803a;

    /* renamed from: b */
    public final Y40 f17804b;

    /* renamed from: c */
    public final Y40 f17805c;

    /* renamed from: d */
    public final boolean f17806d;

    /* renamed from: e */
    public final String f17807e;

    /* renamed from: f */
    public final boolean f17808f;

    /* renamed from: g */
    public final String f17809g;

    /* renamed from: h */
    public final Object f17810h;

    /* renamed from: i */
    public final EnumC10477o50 f17811i;

    /* renamed from: j */
    public final EnumC11245u50 f17812j;

    /* renamed from: k */
    public final EnumC10093l50 f17813k;

    /* renamed from: l */
    public final EnumC11373v50 f17814l;

    /* renamed from: m */
    public final EnumC10733q50 f17815m;

    /* renamed from: n */
    public final EnumC9965k50 f17816n;

    /* renamed from: o */
    public final EnumC10349n50 f17817o;

    /* renamed from: p */
    public final EnumC10605p50 f17818p;

    /* renamed from: q */
    public final EnumC10861r50 f17819q;

    /* renamed from: r */
    public final EnumC11117t50 f17820r;

    /* renamed from: s */
    public final EnumC9837j50 f17821s;

    /* renamed from: t */
    public final EnumC10989s50 f17822t;

    /* renamed from: u */
    public final String f17823u;

    @InterfaceC0965PK
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws C0226Da {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String strMo6696f0;
        this.f17804b = null;
        this.f17805c = null;
        this.f17823u = null;
        if (Build.VERSION.SDK_INT >= 24) {
            C9196e41 c9196e41 = new C9196e41(25, false);
            c9196e41.f26532b = null;
            this.f17803a = c9196e41;
        } else {
            QQ0 qq0 = new QQ0();
            qq0.f9619a = null;
            this.f17803a = qq0;
        }
        List listAsList = Arrays.asList("ca", "nu", "hc");
        if (!(map instanceof HashMap)) {
            throw new C0226Da("Invalid options object !", 10);
        }
        String[] strArr = {"weekday", "year", "month", LocalNotification.Repeat.Type.DAY};
        boolean z = true;
        for (int i2 = 0; i2 < 4; i2++) {
            if (!(AbstractC9080dA1.m17501a(strArr[i2], map) instanceof C7366Ba0)) {
                z = false;
            }
        }
        String str6 = "second";
        String[] strArr2 = {LocalNotification.Repeat.Type.HOUR, LocalNotification.Repeat.Type.MINUTE, "second"};
        for (int i3 = 0; i3 < 3; i3++) {
            if (!(AbstractC9080dA1.m17501a(strArr2[i3], map) instanceof C7366Ba0)) {
                z = false;
            }
        }
        if (((AbstractC9080dA1.m17501a("dateStyle", map) instanceof C7366Ba0) && (AbstractC9080dA1.m17501a("timeStyle", map) instanceof C7366Ba0)) ? z : false) {
            String[] strArr3 = {"year", "month", LocalNotification.Repeat.Type.DAY};
            str = "dateStyle";
            str2 = "timeStyle";
            int i4 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                ((HashMap) map).put(strArr3[i4], "numeric");
                i4++;
                str6 = str6;
            }
        } else {
            str = "dateStyle";
            str2 = "timeStyle";
        }
        String str7 = str6;
        HashMap map2 = new HashMap();
        String[] strArr4 = AbstractC7858Km0.f6280b;
        String str8 = LocalNotification.Repeat.Type.MINUTE;
        map2.put("localeMatcher", CJ1.m1142b(map, "localeMatcher", 2, strArr4, "best fit"));
        C7366Ba0 c7366Ba0 = AbstractC9080dA1.f25853a;
        Object objM1142b = CJ1.m1142b(map, "calendar", 2, c7366Ba0, c7366Ba0);
        if (objM1142b instanceof C7366Ba0) {
            str3 = "year";
            str4 = "month";
            str5 = "numeric";
        } else {
            str4 = "month";
            str3 = "year";
            str5 = "numeric";
            if (!AbstractC10471o22.m23323c((String) objM1142b, 0, r13.length() - 1, 3, 8)) {
                throw new C0226Da("Invalid calendar option !", 10);
            }
        }
        map2.put("ca", objM1142b);
        Object objM1142b2 = CJ1.m1142b(map, "numberingSystem", 2, c7366Ba0, c7366Ba0);
        if (!(objM1142b2 instanceof C7366Ba0)) {
            String str9 = (String) objM1142b2;
            if (!AbstractC10471o22.m23323c(str9, 0, str9.length() - 1, 3, 8)) {
                throw new C0226Da("Invalid numbering system !", 10);
            }
        }
        map2.put("nu", objM1142b2);
        Object objM1142b3 = CJ1.m1142b(map, "hour12", 1, c7366Ba0, c7366Ba0);
        boolean z2 = objM1142b3 instanceof C7366Ba0;
        map2.put("hc", z2 ? CJ1.m1142b(map, "hourCycle", 2, new String[]{"h11", "h12", "h23", "h24"}, c7366Ba0) : AbstractC9080dA1.f25854b);
        HashMap mapM5578a = N90.m5578a(list, map2, listAsList);
        Y40 y40 = (Y40) mapM5578a.get(CommonUrlParts.LOCALE);
        this.f17804b = y40;
        this.f17805c = y40.mo5823d();
        Object objM17501a = AbstractC9080dA1.m17501a("ca", mapM5578a);
        boolean z3 = objM17501a instanceof C7314Aa0;
        InterfaceC11500w50 interfaceC11500w50 = this.f17803a;
        if (z3) {
            this.f17806d = true;
            this.f17807e = interfaceC11500w50.mo6698h(this.f17804b);
        } else {
            this.f17806d = false;
            this.f17807e = (String) objM17501a;
        }
        Object objM17501a2 = AbstractC9080dA1.m17501a("nu", mapM5578a);
        if (objM17501a2 instanceof C7314Aa0) {
            i = 0;
            this.f17808f = true;
            this.f17809g = interfaceC11500w50.mo6697g(this.f17804b);
        } else {
            i = 0;
            this.f17808f = false;
            this.f17809g = (String) objM17501a2;
        }
        Object objM17501a3 = AbstractC9080dA1.m17501a("hc", mapM5578a);
        Object objM17501a4 = AbstractC9080dA1.m17501a("timeZone", map);
        if (!(objM17501a4 instanceof C7366Ba0)) {
            String string = objM17501a4.toString();
            String[] availableIDs = TimeZone.getAvailableIDs();
            int length = availableIDs.length;
            while (i < length) {
                String str10 = availableIDs[i];
                if (m10899a(str10).equals(m10899a(string))) {
                    strMo6696f0 = str10;
                } else {
                    i++;
                    str7 = str7;
                    str8 = str8;
                    str = str;
                    str2 = str2;
                }
            }
            throw new C0226Da("Invalid timezone name!", 10);
        }
        strMo6696f0 = interfaceC11500w50.mo6696f0(this.f17804b);
        this.f17823u = strMo6696f0;
        this.f17812j = (EnumC11245u50) CJ1.m1145e(EnumC11245u50.class, CJ1.m1142b(map, "weekday", 2, new String[]{"long", "short", "narrow"}, c7366Ba0));
        this.f17813k = (EnumC10093l50) CJ1.m1145e(EnumC10093l50.class, CJ1.m1142b(map, "era", 2, new String[]{"long", "short", "narrow"}, c7366Ba0));
        String str11 = str5;
        this.f17814l = (EnumC11373v50) CJ1.m1145e(EnumC11373v50.class, CJ1.m1142b(map, str3, 2, new String[]{str11, "2-digit"}, c7366Ba0));
        this.f17815m = (EnumC10733q50) CJ1.m1145e(EnumC10733q50.class, CJ1.m1142b(map, str4, 2, new String[]{str11, "2-digit", "long", "short", "narrow"}, c7366Ba0));
        this.f17816n = (EnumC9965k50) CJ1.m1145e(EnumC9965k50.class, CJ1.m1142b(map, LocalNotification.Repeat.Type.DAY, 2, new String[]{str11, "2-digit"}, c7366Ba0));
        Object objM1142b4 = CJ1.m1142b(map, LocalNotification.Repeat.Type.HOUR, 2, new String[]{str11, "2-digit"}, c7366Ba0);
        this.f17817o = (EnumC10349n50) CJ1.m1145e(EnumC10349n50.class, objM1142b4);
        this.f17818p = (EnumC10605p50) CJ1.m1145e(EnumC10605p50.class, CJ1.m1142b(map, str8, 2, new String[]{str11, "2-digit"}, c7366Ba0));
        this.f17819q = (EnumC10861r50) CJ1.m1145e(EnumC10861r50.class, CJ1.m1142b(map, str7, 2, new String[]{str11, "2-digit"}, c7366Ba0));
        this.f17820r = (EnumC11117t50) CJ1.m1145e(EnumC11117t50.class, CJ1.m1142b(map, "timeZoneName", 2, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, c7366Ba0));
        this.f17821s = (EnumC9837j50) CJ1.m1145e(EnumC9837j50.class, CJ1.m1142b(map, str, 2, new String[]{"full", "long", "medium", "short"}, c7366Ba0));
        Object objM1142b5 = CJ1.m1142b(map, str2, 2, new String[]{"full", "long", "medium", "short"}, c7366Ba0);
        this.f17822t = (EnumC10989s50) CJ1.m1145e(EnumC10989s50.class, objM1142b5);
        if ((objM1142b4 instanceof C7366Ba0) && (objM1142b5 instanceof C7366Ba0)) {
            this.f17811i = EnumC10477o50.f38794e;
        } else {
            EnumC10477o50 enumC10477o50Mo6701l = interfaceC11500w50.mo6701l(this.f17804b);
            EnumC10477o50 enumC10477o50 = objM17501a3 instanceof C7314Aa0 ? enumC10477o50Mo6701l : (EnumC10477o50) CJ1.m1145e(EnumC10477o50.class, objM17501a3);
            if (!z2) {
                boolean zBooleanValue = ((Boolean) objM1142b3).booleanValue();
                EnumC10477o50 enumC10477o502 = EnumC10477o50.f38792c;
                EnumC10477o50 enumC10477o503 = EnumC10477o50.f38790a;
                enumC10477o50 = zBooleanValue ? (enumC10477o50Mo6701l == enumC10477o503 || enumC10477o50Mo6701l == enumC10477o502) ? enumC10477o503 : EnumC10477o50.f38791b : (enumC10477o50Mo6701l == enumC10477o503 || enumC10477o50Mo6701l == enumC10477o502) ? enumC10477o502 : EnumC10477o50.f38793d;
            }
            this.f17811i = enumC10477o50;
        }
        this.f17810h = objM1142b3;
        this.f17803a.mo6702s0(this.f17804b, this.f17806d ? "" : this.f17807e, this.f17808f ? "" : this.f17809g, this.f17812j, this.f17813k, this.f17814l, this.f17815m, this.f17816n, this.f17817o, this.f17818p, this.f17819q, this.f17820r, this.f17811i, this.f17823u, this.f17821s, this.f17822t, objM1142b3);
    }

    /* renamed from: a */
    public static String m10899a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt + ' '));
            }
        }
        return sb.toString();
    }

    @InterfaceC0965PK
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws C0226Da {
        String str = (String) CJ1.m1142b(map, "localeMatcher", 2, AbstractC7858Km0.f6280b, "best fit");
        String[] strArr = new String[list.size()];
        return (Build.VERSION.SDK_INT < 24 || !str.equals("best fit")) ? Arrays.asList(AbstractC11234u10.m25077g((String[]) list.toArray(strArr))) : Arrays.asList(AbstractC11234u10.m25074d((String[]) list.toArray(strArr)));
    }

    @InterfaceC0965PK
    public String format(double d) throws C0226Da {
        return this.f17803a.mo6695e(d);
    }

    @InterfaceC0965PK
    public List<Map<String, String>> formatToParts(double d) throws C0226Da {
        ArrayList arrayList = new ArrayList();
        InterfaceC11500w50 interfaceC11500w50 = this.f17803a;
        AttributedCharacterIterator attributedCharacterIteratorMo6694b = interfaceC11500w50.mo6694b(d);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorMo6694b.first(); cFirst != 65535; cFirst = attributedCharacterIteratorMo6694b.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorMo6694b.getIndex() + 1 == attributedCharacterIteratorMo6694b.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorMo6694b.getAttributes().keySet().iterator();
                String strMo6700i0 = it.hasNext() ? interfaceC11500w50.mo6700i0(it.next(), sb.toString()) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strMo6700i0);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @InterfaceC0965PK
    public Map<String, Object> resolvedOptions() throws C0226Da {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CommonUrlParts.LOCALE, this.f17805c.mo5821b());
        linkedHashMap.put("numberingSystem", this.f17809g);
        linkedHashMap.put("calendar", this.f17807e);
        linkedHashMap.put("timeZone", this.f17823u);
        EnumC10477o50 enumC10477o50 = this.f17811i;
        if (enumC10477o50 != EnumC10477o50.f38794e) {
            linkedHashMap.put("hourCycle", enumC10477o50.toString());
            EnumC10477o50 enumC10477o502 = this.f17811i;
            if (enumC10477o502 == EnumC10477o50.f38790a || enumC10477o502 == EnumC10477o50.f38791b) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        EnumC11245u50 enumC11245u50 = this.f17812j;
        if (enumC11245u50 != EnumC11245u50.f43502a) {
            linkedHashMap.put("weekday", enumC11245u50.toString());
        }
        EnumC10093l50 enumC10093l50 = this.f17813k;
        if (enumC10093l50 != EnumC10093l50.f36885a) {
            linkedHashMap.put("era", enumC10093l50.toString());
        }
        EnumC11373v50 enumC11373v50 = this.f17814l;
        if (enumC11373v50 != EnumC11373v50.f44143a) {
            linkedHashMap.put("year", enumC11373v50.toString());
        }
        EnumC10733q50 enumC10733q50 = this.f17815m;
        if (enumC10733q50 != EnumC10733q50.f40594a) {
            linkedHashMap.put("month", enumC10733q50.toString());
        }
        EnumC9965k50 enumC9965k50 = this.f17816n;
        if (enumC9965k50 != EnumC9965k50.f36289a) {
            linkedHashMap.put(LocalNotification.Repeat.Type.DAY, enumC9965k50.toString());
        }
        EnumC10349n50 enumC10349n50 = this.f17817o;
        if (enumC10349n50 != EnumC10349n50.f38095a) {
            linkedHashMap.put(LocalNotification.Repeat.Type.HOUR, enumC10349n50.toString());
        }
        EnumC10605p50 enumC10605p50 = this.f17818p;
        if (enumC10605p50 != EnumC10605p50.f39829a) {
            linkedHashMap.put(LocalNotification.Repeat.Type.MINUTE, enumC10605p50.toString());
        }
        EnumC10861r50 enumC10861r50 = this.f17819q;
        if (enumC10861r50 != EnumC10861r50.f41333a) {
            linkedHashMap.put("second", enumC10861r50.toString());
        }
        EnumC11117t50 enumC11117t50 = this.f17820r;
        if (enumC11117t50 != EnumC11117t50.f42828a) {
            linkedHashMap.put("timeZoneName", enumC11117t50.toString());
        }
        EnumC9837j50 enumC9837j50 = this.f17821s;
        if (enumC9837j50 != EnumC9837j50.f34909a) {
            linkedHashMap.put("dateStyle", enumC9837j50.toString());
        }
        EnumC10989s50 enumC10989s50 = this.f17822t;
        if (enumC10989s50 != EnumC10989s50.f42252a) {
            linkedHashMap.put("timeStyle", enumC10989s50.toString());
        }
        return linkedHashMap;
    }
}
