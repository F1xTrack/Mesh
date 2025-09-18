package p000;

import android.graphics.Color;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Q5 */
/* loaded from: classes2.dex */
public final class C1013Q5 extends AbstractC0673Kg {

    /* renamed from: c */
    public final /* synthetic */ int f9470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1013Q5(boolean z, int i) {
        super(z, 1);
        this.f9470c = i;
    }

    /* renamed from: h */
    public static Color m6570h(double[] dArr) {
        O90.m5968f(dArr, "<this>");
        Double dValueOf = 3 < dArr.length ? Double.valueOf(dArr[3]) : null;
        Color colorValueOf = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) (dValueOf != null ? dValueOf.doubleValue() : 1.0d));
        O90.m5967e(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    /* renamed from: i */
    public static Color m6571i(String str) {
        List list = (List) AbstractC0687Ku.f6382a.get(str);
        if (list != null) {
            Color colorValueOf = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            O90.m5967e(colorValueOf, "valueOf(...)");
            return colorValueOf;
        }
        Color colorValueOf2 = Color.valueOf(Color.parseColor(str));
        O90.m5967e(colorValueOf2, "valueOf(...)");
        return colorValueOf2;
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        switch (this.f9470c) {
            case 0:
                return new ExpectedType(EnumC1635Zz.f15263u);
            case 1:
                return new ExpectedType(new SingleType(EnumC1635Zz.f15246d, null), new SingleType(EnumC1635Zz.f15250h, null), new SingleType(EnumC1635Zz.f15257o, new ExpectedType[]{new ExpectedType(EnumC1635Zz.f15245c)}));
            case 2:
                return new ExpectedType(new SingleType(EnumC1635Zz.f15246d, null), new SingleType(EnumC1635Zz.f15250h, null));
            case 3:
                return new ExpectedType(EnumC1635Zz.f15250h);
            case 4:
                return new ExpectedType(EnumC1635Zz.f15250h);
            case 5:
                return new ExpectedType(EnumC1635Zz.f15250h);
            case 6:
                return new ExpectedType(EnumC1635Zz.f15254l);
            case 7:
                return new ExpectedType(EnumC1635Zz.f15250h);
            default:
                return new ExpectedType(EnumC1635Zz.f15250h);
        }
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: c */
    public boolean mo3314c() {
        switch (this.f9470c) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                return false;
            default:
                return super.mo3314c();
        }
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: e */
    public final Object mo3315e(Object obj) throws UnexpectedException {
        switch (this.f9470c) {
            case 0:
                O90.m5968f(obj, "value");
                return obj;
            case 1:
                O90.m5968f(obj, "value");
                if (obj instanceof Integer) {
                    Color colorValueOf = Color.valueOf(((Number) obj).intValue());
                    O90.m5967e(colorValueOf, "valueOf(...)");
                    return colorValueOf;
                }
                if (obj instanceof String) {
                    return m6571i((String) obj);
                }
                if (obj instanceof double[]) {
                    return m6570h((double[]) obj);
                }
                throw new UnexpectedException("Unknown argument type: " + BP0.f799a.mo3846b(obj.getClass()));
            case 2:
                O90.m5968f(obj, "value");
                if (obj instanceof String) {
                    LocalDate localDate = LocalDate.parse((CharSequence) obj, DateTimeFormatter.ISO_DATE_TIME);
                    O90.m5967e(localDate, "parse(...)");
                    return localDate;
                }
                if (obj instanceof Long) {
                    LocalDate localDate2 = Instant.ofEpochMilli(((Number) obj).longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
                    O90.m5967e(localDate2, "toLocalDate(...)");
                    return localDate2;
                }
                throw new UnexpectedException("Unknown argument type: " + BP0.f799a.mo3846b(obj.getClass()));
            case 3:
                O90.m5968f(obj, "value");
                return new File((String) obj);
            case 4:
                O90.m5968f(obj, "value");
                URI uriCreate = URI.create((String) obj);
                O90.m5967e(uriCreate, "create(...)");
                return uriCreate;
            case 5:
                O90.m5968f(obj, "value");
                Path path = Paths.get((String) obj, new String[0]);
                O90.m5967e(path, "get(...)");
                return path;
            case 6:
                O90.m5968f(obj, "value");
                ((ReadableMap) obj).toHashMap();
                return new C8326Tm0(0);
            case 7:
                O90.m5968f(obj, "value");
                return new URL((String) obj);
            default:
                O90.m5968f(obj, "value");
                Uri uri = Uri.parse((String) obj);
                O90.m5967e(uri, "parse(...)");
                return uri;
        }
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: f */
    public final Object mo3316f(Dynamic dynamic) throws UnexpectedException {
        switch (this.f9470c) {
            case 0:
                O90.m5968f(dynamic, "value");
                int i = AbstractC0950P5.f8847a[dynamic.getType().ordinal()];
                if (i == 1) {
                    return Boolean.valueOf(dynamic.asBoolean());
                }
                if (i == 2) {
                    return Double.valueOf(dynamic.asDouble());
                }
                if (i == 3) {
                    return dynamic.asString();
                }
                if (i == 4) {
                    return dynamic.asMap().toHashMap();
                }
                if (i == 5) {
                    return dynamic.asArray().toArrayList();
                }
                throw new IllegalStateException(("Unknown dynamic type: " + dynamic.getType()).toString());
            case 1:
                O90.m5968f(dynamic, "value");
                int i2 = AbstractC0624Ju.f5796a[dynamic.getType().ordinal()];
                if (i2 == 1) {
                    Color colorValueOf = Color.valueOf((int) dynamic.asDouble());
                    O90.m5967e(colorValueOf, "valueOf(...)");
                    return colorValueOf;
                }
                if (i2 == 2) {
                    return m6571i(dynamic.asString());
                }
                if (i2 != 3) {
                    throw new UnexpectedException("Unknown argument type: " + dynamic.getType());
                }
                ArrayList<Object> arrayList = dynamic.asArray().toArrayList();
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
                for (Object obj : arrayList) {
                    O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Double");
                    arrayList2.add((Double) obj);
                }
                double[] dArr = new double[arrayList2.size()];
                Iterator it = arrayList2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    dArr[i3] = ((Number) it.next()).doubleValue();
                    i3++;
                }
                return m6570h(dArr);
            case 2:
                O90.m5968f(dynamic, "value");
                int i4 = AbstractC6603pD.f39911a[dynamic.getType().ordinal()];
                if (i4 == 1) {
                    LocalDate localDate = LocalDate.parse(dynamic.asString(), DateTimeFormatter.ISO_DATE_TIME);
                    O90.m5967e(localDate, "parse(...)");
                    return localDate;
                }
                if (i4 == 2) {
                    LocalDate localDate2 = Instant.ofEpochMilli((long) dynamic.asDouble()).atZone(ZoneId.systemDefault()).toLocalDate();
                    O90.m5967e(localDate2, "toLocalDate(...)");
                    return localDate2;
                }
                throw new UnexpectedException("Unknown argument type: " + dynamic.getType());
            case 3:
                O90.m5968f(dynamic, "value");
                return new File(dynamic.asString());
            case 4:
                O90.m5968f(dynamic, "value");
                URI uriCreate = URI.create(dynamic.asString());
                O90.m5967e(uriCreate, "create(...)");
                return uriCreate;
            case 5:
                O90.m5968f(dynamic, "value");
                Path path = Paths.get(dynamic.asString(), new String[0]);
                O90.m5967e(path, "get(...)");
                return path;
            case 6:
                O90.m5968f(dynamic, "value");
                dynamic.asMap().toHashMap();
                return new C8326Tm0(0);
            case 7:
                O90.m5968f(dynamic, "value");
                return new URL(dynamic.asString());
            default:
                O90.m5968f(dynamic, "value");
                Uri uri = Uri.parse(dynamic.asString());
                O90.m5967e(uri, "parse(...)");
                return uri;
        }
    }
}
