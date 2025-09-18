package p000;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class XL0 extends C10969rx0 {

    /* renamed from: d */
    public final ExecutorService f13676d;

    public XL0(C10585ox0 c10585ox0) {
        super(c10585ox0);
        this.f13676d = c10585ox0.f39371a.m24421t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    @Override // p000.C10969rx0, p000.AbstractC11920zO1
    /* renamed from: h */
    public final void mo2921c(C10841qx0 c10841qx0, ES1 es1) {
        Map mapEmptyMap;
        ReadableMap readableMap;
        c10841qx0.f41264f = SystemClock.elapsedRealtime();
        RD0 rd0 = c10841qx0.f15523b;
        Uri uri = ((C7027vg) rd0).f44473a.f40609b;
        C10737q70 c10737q70 = ((C7027vg) rd0).f44473a;
        if (!(c10737q70 instanceof WL0) || (readableMap = ((WL0) c10737q70).f13141q) == null) {
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
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25142r(new C1684al(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null));
        c6937uF.m25136G(uri.toString());
        O90.m5968f(mapEmptyMap, "<this>");
        String[] strArr = new String[mapEmptyMap.size() * 2];
        int i = 0;
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC11374v51.m25350Y(str).toString();
            String string2 = AbstractC11374v51.m25350Y(str2).toString();
            K12.m4520a(string);
            K12.m4521b(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        J20 j20 = new J20();
        AbstractC0246Du.m1921n(j20.f5287a, strArr);
        c6937uF.f43618c = j20;
        c6937uF.m25130A("GET", null);
        m24558i(c10841qx0, es1, c6937uF.m25141o());
    }
}
