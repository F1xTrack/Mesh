package p000;

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

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"LXW;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-font_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: XW */
/* loaded from: classes2.dex */
public final class C1480XW extends AbstractC11598ws0 {

    /* renamed from: c */
    public final String f13814c = "";

    /* renamed from: d */
    public static final List m9060d(C1480XW c1480xw) throws IOException, C6861t2 {
        String str;
        Context contextM987c = c1480xw.m25721b().m987c();
        if (contextM987c == null) {
            throw new C6861t2(9);
        }
        AssetManager assets = contextM987c.getAssets();
        C8978cQ0 c8978cQ0 = new C8978cQ0("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                O90.m5965c(str2);
                C8068On0 c8068On0M10696a = C8978cQ0.m10696a(c8978cQ0, str2);
                if (c8068On0M10696a != null) {
                    if (c8068On0M10696a.f8623c == null) {
                        c8068On0M10696a.f8623c = new C8016Nn0(c8068On0M10696a);
                    }
                    C8016Nn0 c8016Nn0 = c8068On0M10696a.f8623c;
                    O90.m5965c(c8016Nn0);
                    str = (String) c8016Nn0.get(1);
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
                if (!AbstractC11374v51.m25328C((String) next)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList == null ? C0779MN.f7117a : arrayList;
    }

    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        OY1.m6083a("[ExpoModulesCore] " + (C1480XW.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "ExpoFontLoader";
            c11979zs0.f47056b = new C10801qd0(14, new Pair[]{new Pair("customNativeFonts", m9060d(this))});
            C1225TT c1225tt = C1225TT.f11372h;
            IP0 ip0 = BP0.f799a;
            C0887O5[] c0887o5Arr = {new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, c1225tt)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1225TT.f11373i))};
            C7236z c7236z = new C7236z(16, this);
            ((LinkedHashMap) c11979zs0.f47060f).put("loadAsync", C8313Tf1.class.equals(Integer.TYPE) ? new C0486Hi("loadAsync", c0887o5Arr, c7236z, false, 3) : C8313Tf1.class.equals(Boolean.TYPE) ? new C0486Hi("loadAsync", c0887o5Arr, c7236z, false, 0) : C8313Tf1.class.equals(Double.TYPE) ? new C0486Hi("loadAsync", c0887o5Arr, c7236z, false, 1) : C8313Tf1.class.equals(Float.TYPE) ? new C0486Hi("loadAsync", c0887o5Arr, c7236z, false, 2) : C8313Tf1.class.equals(String.class) ? new C0486Hi("loadAsync", c0887o5Arr, c7236z, false, 4) : new C6599p9("loadAsync", c0887o5Arr, c7236z));
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
