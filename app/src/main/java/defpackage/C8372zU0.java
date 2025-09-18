package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength$UnitType;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* renamed from: zU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8372zU0 {
    public final double a;
    public final SVGLength$UnitType b;

    public C8372zU0() {
        this.a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.b = SVGLength$UnitType.UNKNOWN;
    }

    public static ArrayList a(Dynamic dynamic) {
        int i = AbstractC8182yU0.a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C8372zU0(dynamic.asDouble()));
            return arrayList;
        }
        int i2 = 0;
        if (i == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(StringUtils.COMMA, " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i2 < length) {
                arrayList2.add(new C8372zU0(strArrSplit[i2]));
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
            arrayList3.add(b(readableArrayAsArray.getDynamic(i2)));
            i2++;
        }
        return arrayList3;
    }

    public static C8372zU0 b(Dynamic dynamic) {
        int i = AbstractC8182yU0.a[dynamic.getType().ordinal()];
        return i != 1 ? i != 2 ? new C8372zU0() : new C8372zU0(dynamic.asString()) : new C8372zU0(dynamic.asDouble());
    }

    public static String c(Dynamic dynamic) {
        int i = AbstractC8182yU0.a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public C8372zU0(double d) {
        this.a = d;
        this.b = SVGLength$UnitType.NUMBER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8372zU0(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8372zU0.<init>(java.lang.String):void");
    }
}
