package defpackage;

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

/* loaded from: classes2.dex */
public final class Q5 extends AbstractC0818Kg {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q5(boolean z, int i) {
        super(z, 1);
        this.c = i;
    }

    public static Color h(double[] dArr) {
        O90.f(dArr, "<this>");
        Double dValueOf = 3 < dArr.length ? Double.valueOf(dArr[3]) : null;
        Color colorValueOf = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) (dValueOf != null ? dValueOf.doubleValue() : 1.0d));
        O90.e(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    public static Color i(String str) {
        List list = (List) AbstractC0860Ku.a.get(str);
        if (list != null) {
            Color colorValueOf = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            O90.e(colorValueOf, "valueOf(...)");
            return colorValueOf;
        }
        Color colorValueOf2 = Color.valueOf(Color.parseColor(str));
        O90.e(colorValueOf2, "valueOf(...)");
        return colorValueOf2;
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        switch (this.c) {
            case 0:
                return new ExpectedType(EnumC2044Zz.u);
            case 1:
                return new ExpectedType(new SingleType(EnumC2044Zz.d, null), new SingleType(EnumC2044Zz.h, null), new SingleType(EnumC2044Zz.o, new ExpectedType[]{new ExpectedType(EnumC2044Zz.c)}));
            case 2:
                return new ExpectedType(new SingleType(EnumC2044Zz.d, null), new SingleType(EnumC2044Zz.h, null));
            case 3:
                return new ExpectedType(EnumC2044Zz.h);
            case 4:
                return new ExpectedType(EnumC2044Zz.h);
            case 5:
                return new ExpectedType(EnumC2044Zz.h);
            case 6:
                return new ExpectedType(EnumC2044Zz.l);
            case 7:
                return new ExpectedType(EnumC2044Zz.h);
            default:
                return new ExpectedType(EnumC2044Zz.h);
        }
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public boolean c() {
        switch (this.c) {
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
                return super.c();
        }
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object e(Object obj) throws UnexpectedException {
        switch (this.c) {
            case 0:
                O90.f(obj, "value");
                return obj;
            case 1:
                O90.f(obj, "value");
                if (obj instanceof Integer) {
                    Color colorValueOf = Color.valueOf(((Number) obj).intValue());
                    O90.e(colorValueOf, "valueOf(...)");
                    return colorValueOf;
                }
                if (obj instanceof String) {
                    return i((String) obj);
                }
                if (obj instanceof double[]) {
                    return h((double[]) obj);
                }
                throw new UnexpectedException("Unknown argument type: " + BP0.a.b(obj.getClass()));
            case 2:
                O90.f(obj, "value");
                if (obj instanceof String) {
                    LocalDate localDate = LocalDate.parse((CharSequence) obj, DateTimeFormatter.ISO_DATE_TIME);
                    O90.e(localDate, "parse(...)");
                    return localDate;
                }
                if (obj instanceof Long) {
                    LocalDate localDate2 = Instant.ofEpochMilli(((Number) obj).longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
                    O90.e(localDate2, "toLocalDate(...)");
                    return localDate2;
                }
                throw new UnexpectedException("Unknown argument type: " + BP0.a.b(obj.getClass()));
            case 3:
                O90.f(obj, "value");
                return new File((String) obj);
            case 4:
                O90.f(obj, "value");
                URI uriCreate = URI.create((String) obj);
                O90.e(uriCreate, "create(...)");
                return uriCreate;
            case 5:
                O90.f(obj, "value");
                Path path = Paths.get((String) obj, new String[0]);
                O90.e(path, "get(...)");
                return path;
            case 6:
                O90.f(obj, "value");
                ((ReadableMap) obj).toHashMap();
                return new C1538Tm0(0);
            case 7:
                O90.f(obj, "value");
                return new URL((String) obj);
            default:
                O90.f(obj, "value");
                Uri uri = Uri.parse((String) obj);
                O90.e(uri, "parse(...)");
                return uri;
        }
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object f(Dynamic dynamic) throws UnexpectedException {
        switch (this.c) {
            case 0:
                O90.f(dynamic, "value");
                int i = P5.a[dynamic.getType().ordinal()];
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
                O90.f(dynamic, "value");
                int i2 = AbstractC0782Ju.a[dynamic.getType().ordinal()];
                if (i2 == 1) {
                    Color colorValueOf = Color.valueOf((int) dynamic.asDouble());
                    O90.e(colorValueOf, "valueOf(...)");
                    return colorValueOf;
                }
                if (i2 == 2) {
                    return i(dynamic.asString());
                }
                if (i2 != 3) {
                    throw new UnexpectedException("Unknown argument type: " + dynamic.getType());
                }
                ArrayList<Object> arrayList = dynamic.asArray().toArrayList();
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
                for (Object obj : arrayList) {
                    O90.d(obj, "null cannot be cast to non-null type kotlin.Double");
                    arrayList2.add((Double) obj);
                }
                double[] dArr = new double[arrayList2.size()];
                Iterator it = arrayList2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    dArr[i3] = ((Number) it.next()).doubleValue();
                    i3++;
                }
                return h(dArr);
            case 2:
                O90.f(dynamic, "value");
                int i4 = AbstractC6415pD.a[dynamic.getType().ordinal()];
                if (i4 == 1) {
                    LocalDate localDate = LocalDate.parse(dynamic.asString(), DateTimeFormatter.ISO_DATE_TIME);
                    O90.e(localDate, "parse(...)");
                    return localDate;
                }
                if (i4 == 2) {
                    LocalDate localDate2 = Instant.ofEpochMilli((long) dynamic.asDouble()).atZone(ZoneId.systemDefault()).toLocalDate();
                    O90.e(localDate2, "toLocalDate(...)");
                    return localDate2;
                }
                throw new UnexpectedException("Unknown argument type: " + dynamic.getType());
            case 3:
                O90.f(dynamic, "value");
                return new File(dynamic.asString());
            case 4:
                O90.f(dynamic, "value");
                URI uriCreate = URI.create(dynamic.asString());
                O90.e(uriCreate, "create(...)");
                return uriCreate;
            case 5:
                O90.f(dynamic, "value");
                Path path = Paths.get(dynamic.asString(), new String[0]);
                O90.e(path, "get(...)");
                return path;
            case 6:
                O90.f(dynamic, "value");
                dynamic.asMap().toHashMap();
                return new C1538Tm0(0);
            case 7:
                O90.f(dynamic, "value");
                return new URL(dynamic.asString());
            default:
                O90.f(dynamic, "value");
                Uri uri = Uri.parse(dynamic.asString());
                O90.e(uri, "parse(...)");
                return uri;
        }
    }
}
