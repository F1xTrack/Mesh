package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength$UnitType;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* renamed from: zU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11931zU0 {

    /* renamed from: a */
    public final double f46847a;

    /* renamed from: b */
    public final SVGLength$UnitType f46848b;

    public C11931zU0() {
        this.f46847a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f46848b = SVGLength$UnitType.UNKNOWN;
    }

    /* renamed from: a */
    public static ArrayList m26442a(Dynamic dynamic) {
        int i = AbstractC11804yU0.f46274a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C11931zU0(dynamic.asDouble()));
            return arrayList;
        }
        int i2 = 0;
        if (i == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(StringUtils.COMMA, " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i2 < length) {
                arrayList2.add(new C11931zU0(strArrSplit[i2]));
                i2++;
            }
            return arrayList2;
        }
        if (i != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i2 < size) {
            arrayList3.add(m26443b(readableArrayAsArray.getDynamic(i2)));
            i2++;
        }
        return arrayList3;
    }

    /* renamed from: b */
    public static C11931zU0 m26443b(Dynamic dynamic) {
        int i = AbstractC11804yU0.f46274a[dynamic.getType().ordinal()];
        return i != 1 ? i != 2 ? new C11931zU0() : new C11931zU0(dynamic.asString()) : new C11931zU0(dynamic.asDouble());
    }

    /* renamed from: c */
    public static String m26444c(Dynamic dynamic) {
        int i = AbstractC11804yU0.f46274a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public C11931zU0(double d) {
        this.f46847a = d;
        this.f46848b = SVGLength$UnitType.NUMBER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11931zU0(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11931zU0.<init>(java.lang.String):void");
    }
}
