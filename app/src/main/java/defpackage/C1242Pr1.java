package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: Pr1 */
/* loaded from: classes.dex */
public final class C1242Pr1 implements InterfaceC6180o {
    public final String a;
    public final Context b;
    public final String c;
    public final C5798m d;
    public final InterfaceC0476Fw e;
    public final X11 f;
    public final HashMap g;
    public final ArrayList h;
    public final HashMap i = new HashMap();

    public C1242Pr1(Context context, InputStream inputStream, HashMap map, ArrayList arrayList) throws IOException {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        String packageName = context.getPackageName();
        this.c = packageName;
        if (inputStream != null) {
            this.e = new C5826m71(inputStream, packageName);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        } else {
            this.e = new C2192ak1(context, packageName);
        }
        InterfaceC0476Fw interfaceC0476Fw = this.e;
        this.f = new X11(interfaceC0476Fw);
        this.d = AbstractC6756r02.c(interfaceC0476Fw.getString("/region", null), this.e.getString("/agcgw/url", null));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(AbstractC6756r02.a((String) entry.getKey()), entry.getValue());
        }
        this.g = map2;
        this.h = arrayList;
        this.a = String.valueOf(("{packageName='" + this.c + "', routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(map2).toString().hashCode() + '}').hashCode());
    }

    @Override // defpackage.InterfaceC6180o
    public final C5798m a() {
        C5798m c5798m = this.d;
        return c5798m == null ? C5798m.b : c5798m;
    }

    @Override // defpackage.InterfaceC6180o
    public final Context getContext() {
        return this.b;
    }

    @Override // defpackage.InterfaceC6180o
    public final String getIdentifier() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6180o
    public final String getString(String str) {
        if (str == null) {
            return null;
        }
        String strA = AbstractC6756r02.a(str);
        String str2 = (String) this.g.get(strA);
        if (str2 != null) {
            return str2;
        }
        HashMap map = AbstractC8016xc0.a;
        String strA2 = null;
        if (map.containsKey(strA)) {
            HashMap map2 = this.i;
            if (map2.containsKey(strA)) {
                strA2 = (String) map2.get(strA);
            } else {
                C4233hr1 c4233hr1 = (C4233hr1) map.get(strA);
                if (c4233hr1 != null) {
                    strA2 = c4233hr1.a(this);
                    map2.put(strA, strA2);
                }
            }
        }
        if (strA2 != null) {
            return strA2;
        }
        String string = this.e.getString(strA, null);
        return X11.b(string) ? this.f.o(string) : string;
    }
}
