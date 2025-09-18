package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Trace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXW;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-font_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class XW extends AbstractC7874ws0 {
    public final String c = "";

    public static final List d(XW xw) throws IOException, C7143t2 {
        String str;
        Context contextC = xw.b().c();
        if (contextC == null) {
            throw new C7143t2(9);
        }
        AssetManager assets = contextC.getAssets();
        C2512cQ0 c2512cQ0 = new C2512cQ0("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                O90.c(str2);
                C1151On0 c1151On0A = C2512cQ0.a(c2512cQ0, str2);
                if (c1151On0A != null) {
                    if (c1151On0A.c == null) {
                        c1151On0A.c = new C1073Nn0(c1151On0A);
                    }
                    C1073Nn0 c1073Nn0 = c1151On0A.c;
                    O90.c(c1073Nn0);
                    str = (String) c1073Nn0.get(1);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!AbstractC7538v51.C((String) next)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList == null ? MN.a : arrayList;
    }

    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (XW.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoFontLoader";
            c8444zs0.b = new C6685qd0(14, new Pair[]{new Pair("customNativeFonts", d(this))});
            TT tt = TT.h;
            IP0 ip0 = BP0.a;
            O5[] o5Arr = {new O5(new C1679Vh0(ip0.b(String.class), false, tt)), new O5(new C1679Vh0(ip0.b(String.class), false, TT.i))};
            C8277z c8277z = new C8277z(16, this);
            ((LinkedHashMap) c8444zs0.f).put("loadAsync", C1518Tf1.class.equals(Integer.TYPE) ? new C0590Hi("loadAsync", o5Arr, c8277z, false, 3) : C1518Tf1.class.equals(Boolean.TYPE) ? new C0590Hi("loadAsync", o5Arr, c8277z, false, 0) : C1518Tf1.class.equals(Double.TYPE) ? new C0590Hi("loadAsync", o5Arr, c8277z, false, 1) : C1518Tf1.class.equals(Float.TYPE) ? new C0590Hi("loadAsync", o5Arr, c8277z, false, 2) : C1518Tf1.class.equals(String.class) ? new C0590Hi("loadAsync", o5Arr, c8277z, false, 4) : new C6403p9("loadAsync", o5Arr, c8277z));
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
