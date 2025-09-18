package p000;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: Pr1 */
/* loaded from: classes.dex */
public final class C8129Pr1 implements InterfaceC6524o {

    /* renamed from: a */
    public final String f9309a;

    /* renamed from: b */
    public final Context f9310b;

    /* renamed from: c */
    public final String f9311c;

    /* renamed from: d */
    public final C6398m f9312d;

    /* renamed from: e */
    public final InterfaceC0374Fw f9313e;

    /* renamed from: f */
    public final X11 f9314f;

    /* renamed from: g */
    public final HashMap f9315g;

    /* renamed from: h */
    public final ArrayList f9316h;

    /* renamed from: i */
    public final HashMap f9317i = new HashMap();

    public C8129Pr1(Context context, InputStream inputStream, HashMap map, ArrayList arrayList) throws IOException {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9310b = context;
        String packageName = context.getPackageName();
        this.f9311c = packageName;
        if (inputStream != null) {
            this.f9313e = new C10226m71(inputStream, packageName);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        } else {
            this.f9313e = new C8763ak1(context, packageName);
        }
        InterfaceC0374Fw interfaceC0374Fw = this.f9313e;
        this.f9314f = new X11(interfaceC0374Fw);
        this.f9312d = AbstractC10849r02.m24145c(interfaceC0374Fw.getString("/region", null), this.f9313e.getString("/agcgw/url", null));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(AbstractC10849r02.m24143a((String) entry.getKey()), entry.getValue());
        }
        this.f9315g = map2;
        this.f9316h = arrayList;
        this.f9309a = String.valueOf(("{packageName='" + this.f9311c + "', routePolicy=" + this.f9312d + ", reader=" + this.f9313e.toString().hashCode() + ", customConfigMap=" + new JSONObject(map2).toString().hashCode() + '}').hashCode());
    }

    @Override // p000.InterfaceC6524o
    /* renamed from: a */
    public final C6398m mo6177a() {
        C6398m c6398m = this.f9312d;
        return c6398m == null ? C6398m.f37371b : c6398m;
    }

    @Override // p000.InterfaceC6524o
    public final Context getContext() {
        return this.f9310b;
    }

    @Override // p000.InterfaceC6524o
    public final String getIdentifier() {
        return this.f9309a;
    }

    @Override // p000.InterfaceC6524o
    public final String getString(String str) {
        if (str == null) {
            return null;
        }
        String strM24143a = AbstractC10849r02.m24143a(str);
        String str2 = (String) this.f9315g.get(strM24143a);
        if (str2 != null) {
            return str2;
        }
        HashMap map = AbstractC11693xc0.f45710a;
        String strM18883a = null;
        if (map.containsKey(strM24143a)) {
            HashMap map2 = this.f9317i;
            if (map2.containsKey(strM24143a)) {
                strM18883a = (String) map2.get(strM24143a);
            } else {
                C9678hr1 c9678hr1 = (C9678hr1) map.get(strM24143a);
                if (c9678hr1 != null) {
                    strM18883a = c9678hr1.m18883a(this);
                    map2.put(strM24143a, strM18883a);
                }
            }
        }
        if (strM18883a != null) {
            return strM18883a;
        }
        String string = this.f9313e.getString(strM24143a, null);
        return X11.m8910b(string) ? this.f9314f.m8920o(string) : string;
    }
}
