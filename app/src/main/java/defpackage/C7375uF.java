package defpackage;

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
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
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
public final class C7375uF implements E50, PurchasesResponseListener, U51 {
    public static int f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ C7375uF(K4 k4, U0 u0, L4 l4, L4 l42, U0 u02) {
        this.a = k4;
        this.b = u0;
        this.c = l4;
        this.d = l42;
        this.e = u02;
    }

    public static C7375uF w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C7375uF c7375uF = new C7375uF();
        c7375uF.d = new ArrayDeque();
        c7375uF.a = sharedPreferences;
        c7375uF.b = "topic_operation_queue";
        c7375uF.c = StringUtils.COMMA;
        c7375uF.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) c7375uF.d)) {
            try {
                ((ArrayDeque) c7375uF.d).clear();
                String string = ((SharedPreferences) c7375uF.a).getString((String) c7375uF.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c7375uF.c)) {
                    String[] strArrSplit = string.split((String) c7375uF.c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c7375uF.d).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return c7375uF;
    }

    public void A(String str, AbstractC7221tR0 abstractC7221tR0) {
        O90.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC7221tR0 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC8235ym.k("method ", str, " must have a request body.").toString());
            }
        } else if (!P12.a(str)) {
            throw new IllegalArgumentException(AbstractC8235ym.k("method ", str, " must not have a request body.").toString());
        }
        this.b = str;
        this.d = abstractC7221tR0;
    }

    public String B() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public void C(AbstractC7221tR0 abstractC7221tR0) {
        O90.f(abstractC7221tR0, "body");
        A("POST", abstractC7221tR0);
    }

    public boolean D(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.d)) {
            zRemove = ((ArrayDeque) this.d).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new RunnableC1577Tz0(24, this));
            }
        }
        return zRemove;
    }

    public void E(int i) {
        C5722la1 c5722la1 = (C5722la1) this.a;
        int i2 = c5722la1.d;
        int i3 = c5722la1.e;
        C5722la1 c5722la12 = new C5722la1(i);
        this.a = c5722la12;
        c5722la12.d(i3);
        C5722la1 c5722la13 = (C5722la1) this.a;
        c5722la13.getClass();
        c5722la13.g = i2 >= 12 ? 1 : 0;
        c5722la13.d = i2;
    }

    public void F(Integer num) {
        if (((LinkedHashMap) this.e).isEmpty()) {
            this.e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        Object objCast = Object.class.cast(num);
        O90.c(objCast);
        linkedHashMap.put(Object.class, objCast);
    }

    public void G(String str) {
        O90.f(str, "url");
        if (D51.o(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (D51.o(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            O90.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        O90.f(str, "<this>");
        C40 c40 = new C40();
        c40.f(null, str);
        this.a = c40.c();
    }

    public void H(URL url) {
        String string = url.toString();
        O90.e(string, "url.toString()");
        C40 c40 = new C40();
        c40.f(null, string);
        this.a = c40.c();
    }

    @Override // defpackage.E50
    public E50 a(int i, int i2, int i3) {
        if (i == 2) {
            if (i2 >= 0) {
                ((NumberFormat) this.b).setMinimumFractionDigits(i2);
            }
            if (i3 >= 0) {
                ((NumberFormat) this.b).setMaximumFractionDigits(i3);
            }
            if (AbstractC8125yB0.w((NumberFormat) this.b)) {
                AbstractC8125yB0.d((NumberFormat) this.b).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // defpackage.E50
    public AttributedCharacterIterator b(double d) {
        try {
            try {
                if (!AbstractC6982sB0.y((Format) this.a) || ((MeasureUnit) this.e) == null) {
                    return ((Format) this.a).formatToCharacterIterator(Double.valueOf(d));
                }
                Format format = (Format) this.a;
                AbstractC8125yB0.l();
                return format.formatToCharacterIterator(AbstractC8125yB0.e(Double.valueOf(d), (MeasureUnit) this.e));
            } catch (NumberFormatException unused) {
                return NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d));
            } catch (Exception unused2) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
            }
        } catch (RuntimeException unused3) {
            return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
        }
    }

    @Override // defpackage.U51
    public int c(long j) {
        long[] jArr = (long[]) this.b;
        int iB = AbstractC0277Dh1.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public boolean d(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains((String) this.c)) {
            return false;
        }
        synchronized (((ArrayDeque) this.d)) {
            zAdd = ((ArrayDeque) this.d).add(str);
            if (zAdd) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new RunnableC1577Tz0(24, this));
            }
        }
        return zAdd;
    }

    @Override // defpackage.E50
    public String e(double d) {
        try {
            try {
                if (!AbstractC6982sB0.y((Format) this.a) || ((MeasureUnit) this.e) == null) {
                    return ((Format) this.a).format(Double.valueOf(d));
                }
                Format format = (Format) this.a;
                AbstractC8125yB0.l();
                return format.format(AbstractC8125yB0.e(Double.valueOf(d), (MeasureUnit) this.e));
            } catch (RuntimeException unused) {
                return NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d);
            }
        } catch (NumberFormatException unused2) {
            return NumberFormat.getInstance(ULocale.getDefault()).format(d);
        }
    }

    @Override // defpackage.U51
    public long f(int i) {
        return ((long[]) this.b)[i];
    }

    @Override // defpackage.E50
    public String g(Y40 y40) {
        return NumberingSystem.getInstance(L10.i(y40.g())).getName();
    }

    @Override // defpackage.U51
    public List h(long j) {
        C5731ld1 c5731ld1 = (C5731ld1) this.a;
        ArrayList arrayList = new ArrayList();
        c5731ld1.g(j, c5731ld1.h, arrayList);
        TreeMap treeMap = new TreeMap();
        c5731ld1.i(j, false, c5731ld1.h, treeMap);
        HashMap map = (HashMap) this.d;
        c5731ld1.h(j, (Map) this.c, map, c5731ld1.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.e).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C6113nd1 c6113nd1 = (C6113nd1) map.get(pair.first);
                c6113nd1.getClass();
                arrayList2.add(new C7363uB(null, null, null, bitmapDecodeByteArray, c6113nd1.c, 0, c6113nd1.e, c6113nd1.b, 0, Integer.MIN_VALUE, -3.4028235E38f, c6113nd1.f, c6113nd1.g, false, -16777216, c6113nd1.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C6113nd1 c6113nd12 = (C6113nd1) map.get(entry.getKey());
            c6113nd12.getClass();
            C7172tB c7172tB = (C7172tB) entry.getValue();
            CharSequence charSequence = c7172tB.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (MH mh : (MH[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MH.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(mh), spannableStringBuilder.getSpanEnd(mh), (CharSequence) "");
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
            c7172tB.e = c6113nd12.c;
            c7172tB.f = c6113nd12.d;
            c7172tB.g = c6113nd12.e;
            c7172tB.h = c6113nd12.b;
            c7172tB.l = c6113nd12.f;
            c7172tB.k = c6113nd12.i;
            c7172tB.j = c6113nd12.h;
            c7172tB.p = c6113nd12.j;
            arrayList2.add(c7172tB.a());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    @Override // defpackage.E50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.E50 i(defpackage.B50 r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r6.b
            android.icu.text.NumberFormat r2 = (android.icu.text.NumberFormat) r2
            boolean r2 = defpackage.AbstractC8125yB0.w(r2)
            if (r2 == 0) goto L66
            java.lang.Object r2 = r6.b
            android.icu.text.NumberFormat r2 = (android.icu.text.NumberFormat) r2
            android.icu.text.DecimalFormat r2 = defpackage.AbstractC8125yB0.d(r2)
            android.icu.text.DecimalFormatSymbols r3 = defpackage.AbstractC7935xB0.c(r2)
            int r7 = r7.ordinal()
            if (r7 == r1) goto L32
            r4 = 2
            if (r7 == r4) goto L25
            r4 = 3
            if (r7 == r4) goto L32
            goto L66
        L25:
            defpackage.AbstractC7935xB0.r(r2)
            defpackage.AbstractC7935xB0.v(r2)
            defpackage.AbstractC7935xB0.x(r2)
            defpackage.AbstractC7935xB0.z(r2)
            goto L66
        L32:
            java.lang.String r7 = defpackage.AbstractC7935xB0.q(r2)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L4c
            java.lang.String r7 = new java.lang.String
            char r4 = defpackage.AbstractC7935xB0.a(r3)
            char[] r5 = new char[r1]
            r5[r0] = r4
            r7.<init>(r5)
            defpackage.AbstractC7935xB0.t(r2, r7)
        L4c:
            java.lang.String r7 = defpackage.AbstractC7935xB0.g(r2)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L66
            java.lang.String r7 = new java.lang.String
            char r3 = defpackage.AbstractC7935xB0.a(r3)
            char[] r1 = new char[r1]
            r1[r0] = r3
            r7.<init>(r1)
            defpackage.AbstractC7935xB0.m(r2, r7)
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7375uF.i(B50):E50");
    }

    @Override // defpackage.U51
    public int j() {
        return ((long[]) this.b).length;
    }

    public void k(String str, String str2) {
        O90.f(str, "name");
        O90.f(str2, "value");
        ((J20) this.c).b(str, str2);
    }

    public C0500Ge l() {
        String strI = ((Size) this.a) == null ? " resolution" : "";
        if (((CM) this.b) == null) {
            strI = strI.concat(" dynamicRange");
        }
        if (((Range) this.c) == null) {
            strI = AbstractC8235ym.i(strI, " expectedFrameRateRange");
        }
        if (((Boolean) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " zslDisabled");
        }
        if (strI.isEmpty()) {
            return new C0500Ge((Size) this.a, (CM) this.b, (Range) this.c, (C3456dn) this.d, ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    @Override // defpackage.E50
    public String m(AttributedCharacterIterator.Attribute attribute, double d) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d, ConfigValue.DOUBLE_DEFAULT_VALUE) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d) ? "nan" : Double.isInfinite(d) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? NotificationConstants.GROUP : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // defpackage.E50
    public E50 n(String str, EnumC8107y50 enumC8107y50) {
        if (((C50) this.d) == C50.c) {
            Currency currency = Currency.getInstance(str);
            ((NumberFormat) this.b).setCurrency(currency);
            if (enumC8107y50 != EnumC8107y50.b) {
                C1142Ok0 c1142Ok0 = (C1142Ok0) this.c;
                c1142Ok0.h();
                str = currency.getName(c1142Ok0.a, enumC8107y50.ordinal() != 3 ? 0 : 1, (boolean[]) null);
            }
            if (AbstractC8125yB0.w((NumberFormat) this.b)) {
                DecimalFormat decimalFormatD = AbstractC8125yB0.d((NumberFormat) this.b);
                DecimalFormatSymbols decimalFormatSymbols = decimalFormatD.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormatD.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    public C6649qR0 o() {
        Map mapUnmodifiableMap;
        D40 d40 = (D40) this.a;
        if (d40 == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.b;
        K20 k20G = ((J20) this.c).g();
        AbstractC7221tR0 abstractC7221tR0 = (AbstractC7221tR0) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        byte[] bArr = AbstractC0199Ch1.a;
        O90.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = NN.a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            O90.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C6649qR0(d40, str, k20G, abstractC7221tR0, mapUnmodifiableMap);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        O90.f(billingResult, "billingResult");
        O90.f(list, "purchases");
        ((InterfaceC3013q) this.a).a().execute(new C5741lh(this, billingResult, list, 6));
    }

    @Override // defpackage.E50
    public E50 p(int i, int i2, int i3) throws C0254Da {
        if (AbstractC8125yB0.w((NumberFormat) this.b) && i == 1) {
            DecimalFormat decimalFormatD = AbstractC8125yB0.d((NumberFormat) this.b);
            if (i2 >= 0) {
                decimalFormatD.setMinimumSignificantDigits(i2);
            }
            if (i3 >= 0) {
                if (i3 < decimalFormatD.getMinimumSignificantDigits()) {
                    throw new C0254Da("maximumSignificantDigits should be at least equal to minimumSignificantDigits", 10);
                }
                decimalFormatD.setMaximumSignificantDigits(i3);
            }
            decimalFormatD.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // defpackage.E50
    public E50 q(int i) {
        if (i != -1) {
            ((NumberFormat) this.b).setMinimumIntegerDigits(i);
        }
        return this;
    }

    public void r(C2193al c2193al) {
        O90.f(c2193al, "cacheControl");
        String string = c2193al.toString();
        if (string.length() == 0) {
            ((J20) this.c).i("Cache-Control");
        } else {
            y("Cache-Control", string);
        }
    }

    @Override // defpackage.E50
    public E50 s(String str, D50 d50) throws C0254Da {
        if (((C50) this.d) == C50.d) {
            Iterator it = MeasureUnit.getAvailable().iterator();
            while (it.hasNext()) {
                MeasureUnit measureUnitF = AbstractC8125yB0.f(it.next());
                if (!measureUnitF.getSubtype().equals(str)) {
                    if (measureUnitF.getSubtype().equals(measureUnitF.getType() + "-" + str)) {
                    }
                }
                this.e = measureUnitF;
                C1142Ok0 c1142Ok0 = (C1142Ok0) this.c;
                c1142Ok0.h();
                ULocale uLocale = c1142Ok0.a;
                int iOrdinal = d50.ordinal();
                this.a = MeasureFormat.getInstance(uLocale, iOrdinal != 1 ? iOrdinal != 2 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW, (NumberFormat) this.b);
            }
            throw new C0254Da(AbstractC8235ym.v("Unknown unit: ", str), 10);
        }
        return this;
    }

    @Override // defpackage.E50
    public E50 t(Y40 y40, String str, C50 c50, EnumC8297z50 enumC8297z50, A50 a50, EnumC7917x50 enumC7917x50) throws C0254Da {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(str) == null) {
                    throw new C0254Da("Invalid numbering system: ".concat(str), 10);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                y40.f("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new C0254Da("Invalid numbering system: ".concat(str), 10);
            }
        }
        if (a50 == A50.c && (c50 == C50.a || c50 == C50.d)) {
            CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(L10.i(y40.g()), enumC7917x50 == EnumC7917x50.a ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG);
            this.b = compactDecimalFormat;
            this.a = compactDecimalFormat;
            this.c = (C1142Ok0) y40;
            this.d = c50;
            compactDecimalFormat.setRoundingMode(4);
        } else {
            int iOrdinal = c50.ordinal();
            A50 a502 = A50.b;
            int i = 2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i = (a50 == A50.a || a50 == a502) ? 3 : 0;
                } else if (enumC8297z50 == EnumC8297z50.b) {
                    i = 7;
                } else {
                    if (enumC8297z50 != EnumC8297z50.a) {
                        throw new C0254Da("Unrecognized formatting style requested.", 10);
                    }
                    i = 1;
                }
            }
            NumberFormat numberFormat = NumberFormat.getInstance(L10.i(y40.g()), i);
            if (a50 == a502) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            this.b = numberFormat;
            this.a = numberFormat;
            this.c = (C1142Ok0) y40;
            this.d = c50;
            numberFormat.setRoundingMode(4);
        }
        return this;
    }

    @Override // defpackage.E50
    public E50 u(boolean z) {
        ((NumberFormat) this.b).setGroupingUsed(z);
        return this;
    }

    public void v() {
        G70 g70;
        DV1.a();
        C0593Hj c0593Hj = (C0593Hj) this.c;
        c0593Hj.getClass();
        DV1.a();
        C0260Dc c0260Dc = (C0260Dc) c0593Hj.g;
        Objects.requireNonNull(c0260Dc);
        MU0 mu0 = (MU0) c0593Hj.c;
        Objects.requireNonNull(mu0);
        MU0 mu02 = (MU0) c0593Hj.d;
        MU0 mu03 = (MU0) c0593Hj.e;
        G70 g702 = c0260Dc.c;
        Objects.requireNonNull(g702);
        g702.a();
        G70 g703 = c0260Dc.c;
        Objects.requireNonNull(g703);
        AbstractC1500Sz1.l(g703.e).d(new RunnableC1936Yp(mu0, 0), QR1.h());
        G70 g704 = c0260Dc.e;
        if (g704 != null) {
            g704.a();
            AbstractC1500Sz1.l(c0260Dc.e.e).d(new RunnableC1936Yp(mu03, 1), QR1.h());
        }
        if (c0260Dc.h.size() > 1 && (g70 = c0260Dc.d) != null) {
            g70.a();
            AbstractC1500Sz1.l(c0260Dc.d.e).d(new RunnableC1936Yp(mu02, 2), QR1.h());
        }
        ((ND0) this.d).getClass();
    }

    public LinkedHashSet x() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.b).values());
        }
        return linkedHashSet;
    }

    public void y(String str, String str2) {
        O90.f(str, "name");
        O90.f(str2, "value");
        J20 j20 = (J20) this.c;
        j20.getClass();
        K12.a(str);
        K12.b(str2, str);
        j20.i(str);
        j20.d(str, str2);
    }

    public void z(C6520pm c6520pm) {
        synchronized (this.a) {
            try {
                c6520pm.getClass();
                for (String str : new LinkedHashSet(c6520pm.f)) {
                    AbstractC0759Jm0.f("CameraRepository");
                    ((LinkedHashMap) this.b).put(str, c6520pm.a(str));
                }
            } catch (C1621Uo e) {
                throw new C6592q80(e);
            }
        }
    }

    public C7375uF(C5731ld1 c5731ld1, HashMap map, HashMap map2, HashMap map3) {
        this.a = c5731ld1;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c5731ld1.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public C7375uF(int i, boolean z) {
        switch (i) {
            case 9:
                this.e = new LinkedHashMap();
                this.b = "GET";
                this.c = new J20();
                break;
            default:
                this.a = new Object();
                this.b = new LinkedHashMap();
                this.c = new HashSet();
                break;
        }
    }
}
