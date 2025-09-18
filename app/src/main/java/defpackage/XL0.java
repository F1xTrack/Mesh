package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class XL0 extends C6935rx0 {
    public final ExecutorService d;

    public XL0(C6363ox0 c6363ox0) {
        super(c6363ox0);
        this.d = c6363ox0.a.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    @Override // defpackage.C6935rx0, defpackage.AbstractC8355zO1
    /* renamed from: h */
    public final void c(C6745qx0 c6745qx0, ES1 es1) {
        Map mapEmptyMap;
        ReadableMap readableMap;
        c6745qx0.f = SystemClock.elapsedRealtime();
        RD0 rd0 = c6745qx0.b;
        Uri uri = ((C7647vg) rd0).a.b;
        C6589q70 c6589q70 = ((C7647vg) rd0).a;
        if (!(c6589q70 instanceof WL0) || (readableMap = ((WL0) c6589q70).q) == null) {
            mapEmptyMap = 0;
        } else {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            mapEmptyMap = new HashMap();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                mapEmptyMap.put(strNextKey, readableMap.getString(strNextKey));
            }
        }
        if (mapEmptyMap == 0) {
            mapEmptyMap = Collections.emptyMap();
        }
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.r(new C2193al(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null));
        c7375uF.G(uri.toString());
        O90.f(mapEmptyMap, "<this>");
        String[] strArr = new String[mapEmptyMap.size() * 2];
        int i = 0;
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC7538v51.Y(str).toString();
            String string2 = AbstractC7538v51.Y(str2).toString();
            K12.a(string);
            K12.b(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        J20 j20 = new J20();
        AbstractC0314Du.n(j20.a, strArr);
        c7375uF.c = j20;
        c7375uF.A("GET", null);
        i(c6745qx0, es1, c7375uF.o());
    }
}
