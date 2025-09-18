package p000;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: uF */
/* loaded from: classes.dex */
public final class C6937uF implements E50, PurchasesResponseListener, U51 {

    /* renamed from: f */
    public static int f43615f;

    /* renamed from: a */
    public Object f43616a;

    /* renamed from: b */
    public Object f43617b;

    /* renamed from: c */
    public Object f43618c;

    /* renamed from: d */
    public Object f43619d;

    /* renamed from: e */
    public Object f43620e;

    public /* synthetic */ C6937uF(C0635K4 c0635k4, AbstractC1259U0 abstractC1259U0, C0698L4 c0698l4, C0698L4 c0698l42, AbstractC1259U0 abstractC1259U02) {
        this.f43616a = c0635k4;
        this.f43617b = abstractC1259U0;
        this.f43618c = c0698l4;
        this.f43619d = c0698l42;
        this.f43620e = abstractC1259U02;
    }

    /* renamed from: w */
    public static C6937uF m25129w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C6937uF c6937uF = new C6937uF();
        c6937uF.f43619d = new ArrayDeque();
        c6937uF.f43616a = sharedPreferences;
        c6937uF.f43617b = "topic_operation_queue";
        c6937uF.f43618c = StringUtils.COMMA;
        c6937uF.f43620e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) c6937uF.f43619d)) {
            try {
                ((ArrayDeque) c6937uF.f43619d).clear();
                String string = ((SharedPreferences) c6937uF.f43616a).getString((String) c6937uF.f43617b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c6937uF.f43618c)) {
                    String[] strArrSplit = string.split((String) c6937uF.f43618c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c6937uF.f43619d).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return c6937uF;
    }

    /* renamed from: A */
    public void m25130A(String str, AbstractC11161tR0 abstractC11161tR0) {
        O90.m5968f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC11161tR0 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC7222ym.m26234k("method ", str, " must have a request body.").toString());
            }
        } else if (!P12.m6204a(str)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("method ", str, " must not have a request body.").toString());
        }
        this.f43617b = str;
        this.f43619d = abstractC11161tR0;
    }

    /* renamed from: B */
    public String m25131B() {
        String str;
        synchronized (((ArrayDeque) this.f43619d)) {
            str = (String) ((ArrayDeque) this.f43619d).peek();
        }
        return str;
    }

    /* renamed from: C */
    public void m25132C(AbstractC11161tR0 abstractC11161tR0) {
        O90.m5968f(abstractC11161tR0, "body");
        m25130A("POST", abstractC11161tR0);
    }

    /* renamed from: D */
    public boolean m25133D(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f43619d)) {
            zRemove = ((ArrayDeque) this.f43619d).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f43620e).execute(new RunnableC8352Tz0(24, this));
            }
        }
        return zRemove;
    }

    /* renamed from: E */
    public void m25134E(int i) {
        C10156la1 c10156la1 = (C10156la1) this.f43616a;
        int i2 = c10156la1.f37171d;
        int i3 = c10156la1.f37172e;
        C10156la1 c10156la12 = new C10156la1(i);
        this.f43616a = c10156la12;
        c10156la12.m22513d(i3);
        C10156la1 c10156la13 = (C10156la1) this.f43616a;
        c10156la13.getClass();
        c10156la13.f37174g = i2 >= 12 ? 1 : 0;
        c10156la13.f37171d = i2;
    }

    /* renamed from: F */
    public void m25135F(Integer num) {
        if (((LinkedHashMap) this.f43620e).isEmpty()) {
            this.f43620e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43620e;
        Object objCast = Object.class.cast(num);
        O90.m5965c(objCast);
        linkedHashMap.put(Object.class, objCast);
    }

    /* renamed from: G */
    public void m25136G(String str) {
        O90.m5968f(str, "url");
        if (D51.m1556o(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (D51.m1556o(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        O90.m5968f(str, "<this>");
        C40 c40 = new C40();
        c40.m973f(null, str);
        this.f43616a = c40.m970c();
    }

    /* renamed from: H */
    public void m25137H(URL url) {
        String string = url.toString();
        O90.m5967e(string, "url.toString()");
        C40 c40 = new C40();
        c40.m973f(null, string);
        this.f43616a = c40.m970c();
    }

    @Override // p000.E50
    /* renamed from: a */
    public E50 mo2015a(int i, int i2, int i3) {
        if (i == 2) {
            if (i2 >= 0) {
                ((NumberFormat) this.f43617b).setMinimumFractionDigits(i2);
            }
            if (i3 >= 0) {
                ((NumberFormat) this.f43617b).setMaximumFractionDigits(i3);
            }
            if (AbstractC11766yB0.m26087w((NumberFormat) this.f43617b)) {
                AbstractC11766yB0.m26068d((NumberFormat) this.f43617b).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // p000.E50
    /* renamed from: b */
    public AttributedCharacterIterator mo2016b(double d) {
        try {
            try {
                if (!AbstractC11001sB0.m24679y((Format) this.f43616a) || ((MeasureUnit) this.f43620e) == null) {
                    return ((Format) this.f43616a).formatToCharacterIterator(Double.valueOf(d));
                }
                Format format = (Format) this.f43616a;
                AbstractC11766yB0.m26076l();
                return format.formatToCharacterIterator(AbstractC11766yB0.m26069e(Double.valueOf(d), (MeasureUnit) this.f43620e));
            } catch (NumberFormatException unused) {
                return NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d));
            } catch (Exception unused2) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
            }
        } catch (RuntimeException unused3) {
            return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
        }
    }

    @Override // p000.U51
    /* renamed from: c */
    public int mo5855c(long j) {
        long[] jArr = (long[]) this.f43617b;
        int iM1814b = AbstractC7485Dh1.m1814b(jArr, j, false);
        if (iM1814b < jArr.length) {
            return iM1814b;
        }
        return -1;
    }

    /* renamed from: d */
    public boolean m25138d(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains((String) this.f43618c)) {
            return false;
        }
        synchronized (((ArrayDeque) this.f43619d)) {
            zAdd = ((ArrayDeque) this.f43619d).add(str);
            if (zAdd) {
                ((ScheduledThreadPoolExecutor) this.f43620e).execute(new RunnableC8352Tz0(24, this));
            }
        }
        return zAdd;
    }

    @Override // p000.E50
    /* renamed from: e */
    public String mo2017e(double d) {
        try {
            try {
                if (!AbstractC11001sB0.m24679y((Format) this.f43616a) || ((MeasureUnit) this.f43620e) == null) {
                    return ((Format) this.f43616a).format(Double.valueOf(d));
                }
                Format format = (Format) this.f43616a;
                AbstractC11766yB0.m26076l();
                return format.format(AbstractC11766yB0.m26069e(Double.valueOf(d), (MeasureUnit) this.f43620e));
            } catch (RuntimeException unused) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d);
            }
        } catch (NumberFormatException unused2) {
            return NumberFormat.getInstance(ULocale.getDefault()).format(d);
        }
    }

    @Override // p000.U51
    /* renamed from: f */
    public long mo5856f(int i) {
        return ((long[]) this.f43617b)[i];
    }

    @Override // p000.E50
    /* renamed from: g */
    public String mo2018g(Y40 y40) {
        return NumberingSystem.getInstance(L10.m4845i(y40.mo5826g())).getName();
    }

    @Override // p000.U51
    /* renamed from: h */
    public List mo5857h(long j) {
        C10162ld1 c10162ld1 = (C10162ld1) this.f43616a;
        ArrayList arrayList = new ArrayList();
        c10162ld1.m22521g(j, c10162ld1.f37202h, arrayList);
        TreeMap treeMap = new TreeMap();
        c10162ld1.m22523i(j, false, c10162ld1.f37202h, treeMap);
        HashMap map = (HashMap) this.f43619d;
        c10162ld1.m22522h(j, (Map) this.f43618c, map, c10162ld1.f37202h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f43620e).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C10418nd1 c10418nd1 = (C10418nd1) map.get(pair.first);
                c10418nd1.getClass();
                arrayList2.add(new C6933uB(null, null, null, bitmapDecodeByteArray, c10418nd1.f38419c, 0, c10418nd1.f38421e, c10418nd1.f38418b, 0, Integer.MIN_VALUE, -3.4028235E38f, c10418nd1.f38422f, c10418nd1.f38423g, false, -16777216, c10418nd1.f38426j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C10418nd1 c10418nd12 = (C10418nd1) map.get(entry.getKey());
            c10418nd12.getClass();
            C6870tB c6870tB = (C6870tB) entry.getValue();
            CharSequence charSequence = c6870tB.f42901a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C0773MH c0773mh : (C0773MH[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0773MH.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c0773mh), spannableStringBuilder.getSpanEnd(c0773mh), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c6870tB.f42905e = c10418nd12.f38419c;
            c6870tB.f42906f = c10418nd12.f38420d;
            c6870tB.f42907g = c10418nd12.f38421e;
            c6870tB.f42908h = c10418nd12.f38418b;
            c6870tB.f42912l = c10418nd12.f38422f;
            c6870tB.f42911k = c10418nd12.f38425i;
            c6870tB.f42910j = c10418nd12.f38424h;
            c6870tB.f42916p = c10418nd12.f38426j;
            arrayList2.add(c6870tB.m24850a());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    @Override // p000.E50
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.E50 mo2019i(p000.B50 r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r6.f43617b
            android.icu.text.NumberFormat r2 = (android.icu.text.NumberFormat) r2
            boolean r2 = p000.AbstractC11766yB0.m26087w(r2)
            if (r2 == 0) goto L66
            java.lang.Object r2 = r6.f43617b
            android.icu.text.NumberFormat r2 = (android.icu.text.NumberFormat) r2
            android.icu.text.DecimalFormat r2 = p000.AbstractC11766yB0.m26068d(r2)
            android.icu.text.DecimalFormatSymbols r3 = p000.AbstractC11639xB0.m25784c(r2)
            int r7 = r7.ordinal()
            if (r7 == r1) goto L32
            r4 = 2
            if (r7 == r4) goto L25
            r4 = 3
            if (r7 == r4) goto L32
            goto L66
        L25:
            p000.AbstractC11639xB0.m25799r(r2)
            p000.AbstractC11639xB0.m25803v(r2)
            p000.AbstractC11639xB0.m25805x(r2)
            p000.AbstractC11639xB0.m25807z(r2)
            goto L66
        L32:
            java.lang.String r7 = p000.AbstractC11639xB0.m25798q(r2)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L4c
            java.lang.String r7 = new java.lang.String
            char r4 = p000.AbstractC11639xB0.m25782a(r3)
            char[] r5 = new char[r1]
            r5[r0] = r4
            r7.<init>(r5)
            p000.AbstractC11639xB0.m25801t(r2, r7)
        L4c:
            java.lang.String r7 = p000.AbstractC11639xB0.m25788g(r2)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L66
            java.lang.String r7 = new java.lang.String
            char r3 = p000.AbstractC11639xB0.m25782a(r3)
            char[] r1 = new char[r1]
            r1[r0] = r3
            r7.<init>(r1)
            p000.AbstractC11639xB0.m25794m(r2, r7)
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6937uF.mo2019i(B50):E50");
    }

    @Override // p000.U51
    /* renamed from: j */
    public int mo5858j() {
        return ((long[]) this.f43617b).length;
    }

    /* renamed from: k */
    public void m25139k(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "value");
        ((J20) this.f43618c).m4135b(str, str2);
    }

    /* renamed from: l */
    public C0419Ge m25140l() {
        String strM26232i = ((Size) this.f43616a) == null ? " resolution" : "";
        if (((C0149CM) this.f43617b) == null) {
            strM26232i = strM26232i.concat(" dynamicRange");
        }
        if (((Range) this.f43618c) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " expectedFrameRateRange");
        }
        if (((Boolean) this.f43620e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " zslDisabled");
        }
        if (strM26232i.isEmpty()) {
            return new C0419Ge((Size) this.f43616a, (C0149CM) this.f43617b, (Range) this.f43618c, (C3950dn) this.f43619d, ((Boolean) this.f43620e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    @Override // p000.E50
    /* renamed from: m */
    public String mo2020m(AttributedCharacterIterator.Attribute attribute, double d) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d, ConfigValue.DOUBLE_DEFAULT_VALUE) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d) ? "nan" : Double.isInfinite(d) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? NotificationConstants.GROUP : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // p000.E50
    /* renamed from: n */
    public E50 mo2021n(String str, EnumC11754y50 enumC11754y50) {
        if (((C50) this.f43619d) == C50.f1188c) {
            Currency currency = Currency.getInstance(str);
            ((NumberFormat) this.f43617b).setCurrency(currency);
            if (enumC11754y50 != EnumC11754y50.f46085b) {
                C8062Ok0 c8062Ok0 = (C8062Ok0) this.f43618c;
                c8062Ok0.m6128h();
                str = currency.getName(c8062Ok0.f8591a, enumC11754y50.ordinal() != 3 ? 0 : 1, (boolean[]) null);
            }
            if (AbstractC11766yB0.m26087w((NumberFormat) this.f43617b)) {
                DecimalFormat decimalFormatM26068d = AbstractC11766yB0.m26068d((NumberFormat) this.f43617b);
                DecimalFormatSymbols decimalFormatSymbols = decimalFormatM26068d.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormatM26068d.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    /* renamed from: o */
    public C10777qR0 m25141o() {
        Map mapUnmodifiableMap;
        D40 d40 = (D40) this.f43616a;
        if (d40 == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f43617b;
        K20 k20M4140g = ((J20) this.f43618c).m4140g();
        AbstractC11161tR0 abstractC11161tR0 = (AbstractC11161tR0) this.f43619d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43620e;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        O90.m5968f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C0842NN.f7735a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            O90.m5967e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C10777qR0(d40, str, k20M4140g, abstractC11161tR0, mapUnmodifiableMap);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        O90.m5968f(billingResult, "billingResult");
        O90.m5968f(list, "purchases");
        ((InterfaceC3531q) this.f43616a).mo3440a().execute(new C6379lh(this, billingResult, list, 6));
    }

    @Override // p000.E50
    /* renamed from: p */
    public E50 mo2022p(int i, int i2, int i3) throws C0226Da {
        if (AbstractC11766yB0.m26087w((NumberFormat) this.f43617b) && i == 1) {
            DecimalFormat decimalFormatM26068d = AbstractC11766yB0.m26068d((NumberFormat) this.f43617b);
            if (i2 >= 0) {
                decimalFormatM26068d.setMinimumSignificantDigits(i2);
            }
            if (i3 >= 0) {
                if (i3 < decimalFormatM26068d.getMinimumSignificantDigits()) {
                    throw new C0226Da("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 10);
                }
                decimalFormatM26068d.setMaximumSignificantDigits(i3);
            }
            decimalFormatM26068d.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // p000.E50
    /* renamed from: q */
    public E50 mo2023q(int i) {
        if (i != -1) {
            ((NumberFormat) this.f43617b).setMinimumIntegerDigits(i);
        }
        return this;
    }

    /* renamed from: r */
    public void m25142r(C1684al c1684al) {
        O90.m5968f(c1684al, "cacheControl");
        String string = c1684al.toString();
        if (string.length() == 0) {
            ((J20) this.f43618c).m4142i("Cache-Control");
        } else {
            m25145y("Cache-Control", string);
        }
    }

    @Override // p000.E50
    /* renamed from: s */
    public E50 mo2024s(String str, D50 d50) throws C0226Da {
        if (((C50) this.f43619d) == C50.f1189d) {
            Iterator it = MeasureUnit.getAvailable().iterator();
            while (it.hasNext()) {
                MeasureUnit measureUnitM26070f = AbstractC11766yB0.m26070f(it.next());
                if (!measureUnitM26070f.getSubtype().equals(str)) {
                    if (measureUnitM26070f.getSubtype().equals(measureUnitM26070f.getType() + "-" + str)) {
                    }
                }
                this.f43620e = measureUnitM26070f;
                C8062Ok0 c8062Ok0 = (C8062Ok0) this.f43618c;
                c8062Ok0.m6128h();
                ULocale uLocale = c8062Ok0.f8591a;
                int iOrdinal = d50.ordinal();
                this.f43616a = MeasureFormat.getInstance(uLocale, iOrdinal != 1 ? iOrdinal != 2 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW, (NumberFormat) this.f43617b);
            }
            throw new C0226Da(AbstractC7222ym.m26245v("Unknown unit: ", str), 10);
        }
        return this;
    }

    @Override // p000.E50
    /* renamed from: t */
    public E50 mo2025t(Y40 y40, String str, C50 c50, EnumC11881z50 enumC11881z50, A50 a50, EnumC11627x50 enumC11627x50) throws C0226Da {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(str) == null) {
                    throw new C0226Da("Invalid numbering system: ".concat(str), 10);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                y40.mo5825f("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new C0226Da("Invalid numbering system: ".concat(str), 10);
            }
        }
        if (a50 == A50.f70c && (c50 == C50.f1186a || c50 == C50.f1189d)) {
            CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(L10.m4845i(y40.mo5826g()), enumC11627x50 == EnumC11627x50.f45364a ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG);
            this.f43617b = compactDecimalFormat;
            this.f43616a = compactDecimalFormat;
            this.f43618c = (C8062Ok0) y40;
            this.f43619d = c50;
            compactDecimalFormat.setRoundingMode(4);
        } else {
            int iOrdinal = c50.ordinal();
            A50 a502 = A50.f69b;
            int i = 2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i = (a50 == A50.f68a || a50 == a502) ? 3 : 0;
                } else if (enumC11881z50 == EnumC11881z50.f46631b) {
                    i = 7;
                } else {
                    if (enumC11881z50 != EnumC11881z50.f46630a) {
                        throw new C0226Da("Unrecognized formatting style requested.", 10);
                    }
                    i = 1;
                }
            }
            NumberFormat numberFormat = NumberFormat.getInstance(L10.m4845i(y40.mo5826g()), i);
            if (a50 == a502) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            this.f43617b = numberFormat;
            this.f43616a = numberFormat;
            this.f43618c = (C8062Ok0) y40;
            this.f43619d = c50;
            numberFormat.setRoundingMode(4);
        }
        return this;
    }

    @Override // p000.E50
    /* renamed from: u */
    public E50 mo2026u(boolean z) {
        ((NumberFormat) this.f43617b).setGroupingUsed(z);
        return this;
    }

    /* renamed from: v */
    public void m25143v() {
        G70 g70;
        DV1.m1716a();
        C0487Hj c0487Hj = (C0487Hj) this.f43618c;
        c0487Hj.getClass();
        DV1.m1716a();
        C0228Dc c0228Dc = (C0228Dc) c0487Hj.f4450g;
        Objects.requireNonNull(c0228Dc);
        MU0 mu0 = (MU0) c0487Hj.f4446c;
        Objects.requireNonNull(mu0);
        MU0 mu02 = (MU0) c0487Hj.f4447d;
        MU0 mu03 = (MU0) c0487Hj.f4448e;
        G70 g702 = c0228Dc.f2062c;
        Objects.requireNonNull(g702);
        g702.mo6573a();
        G70 g703 = c0228Dc.f2062c;
        Objects.requireNonNull(g703);
        AbstractC8301Sz1.m7489l(g703.f29023e).mo2494d(new RunnableC1562Yp(mu0, 0), QR1.m6710h());
        G70 g704 = c0228Dc.f2064e;
        if (g704 != null) {
            g704.mo6573a();
            AbstractC8301Sz1.m7489l(c0228Dc.f2064e.f29023e).mo2494d(new RunnableC1562Yp(mu03, 1), QR1.m6710h());
        }
        if (c0228Dc.f2067h.size() > 1 && (g70 = c0228Dc.f2063d) != null) {
            g70.mo6573a();
            AbstractC8301Sz1.m7489l(c0228Dc.f2063d.f29023e).mo2494d(new RunnableC1562Yp(mu02, 2), QR1.m6710h());
        }
        ((ND0) this.f43619d).getClass();
    }

    /* renamed from: x */
    public LinkedHashSet m25144x() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f43616a) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f43617b).values());
        }
        return linkedHashSet;
    }

    /* renamed from: y */
    public void m25145y(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "value");
        J20 j20 = (J20) this.f43618c;
        j20.getClass();
        K12.m4520a(str);
        K12.m4521b(str2, str);
        j20.m4142i(str);
        j20.m4137d(str, str2);
    }

    /* renamed from: z */
    public void m25146z(C6638pm c6638pm) {
        synchronized (this.f43616a) {
            try {
                c6638pm.getClass();
                for (String str : new LinkedHashSet(c6638pm.f40382f)) {
                    AbstractC7806Jm0.m4412f("CameraRepository");
                    ((LinkedHashMap) this.f43617b).put(str, c6638pm.m23875a(str));
                }
            } catch (C1309Uo e) {
                throw new C10739q80(e);
            }
        }
    }

    public C6937uF(C10162ld1 c10162ld1, HashMap map, HashMap map2, HashMap map3) {
        this.f43616a = c10162ld1;
        this.f43619d = map2;
        this.f43620e = map3;
        this.f43618c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c10162ld1.m22519d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f43617b = jArr;
    }

    public C6937uF(int i, boolean z) {
        switch (i) {
            case 9:
                this.f43620e = new LinkedHashMap();
                this.f43617b = "GET";
                this.f43618c = new J20();
                break;
            default:
                this.f43616a = new Object();
                this.f43617b = new LinkedHashMap();
                this.f43618c = new HashSet();
                break;
        }
    }
}
