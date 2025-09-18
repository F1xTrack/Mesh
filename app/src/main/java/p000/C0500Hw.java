package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Hw */
/* loaded from: classes.dex */
public final class C0500Hw {

    /* renamed from: a */
    public final /* synthetic */ int f4606a;

    /* renamed from: b */
    public final /* synthetic */ Object f4607b;

    public /* synthetic */ C0500Hw(int i, Object obj) {
        this.f4606a = i;
        this.f4607b = obj;
    }

    /* renamed from: a */
    public final void m3651a(C6747rV c6747rV) {
        switch (this.f4606a) {
            case 0:
                C0563Iw c0563Iw = (C0563Iw) this.f4607b;
                synchronized (c0563Iw) {
                    c0563Iw.f5213d = true;
                }
                ((C0563Iw) this.f4607b).m4080g(c6747rV);
                return;
            default:
                FL0 fl0 = FL0.f3159g;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("resultType", "error");
                writableMapCreateMap.putString("appName", (String) this.f4607b);
                int iM26247x = AbstractC7222ym.m26247x(c6747rV.f41686a);
                if (iM26247x == 0) {
                    writableMapCreateMap.putString("code", "unknown");
                } else if (iM26247x == 1) {
                    writableMapCreateMap.putString("code", "config_update_stream_error");
                } else if (iM26247x == 2) {
                    writableMapCreateMap.putString("code", "config_update_message_invalid");
                } else if (iM26247x == 3) {
                    writableMapCreateMap.putString("code", "config_update_not_fetched");
                } else if (iM26247x != 4) {
                    writableMapCreateMap.putString("code", "internal");
                } else {
                    writableMapCreateMap.putString("code", "config_update_unavailable");
                }
                writableMapCreateMap.putString("message", c6747rV.getMessage());
                writableMapCreateMap.putString("nativeErrorMessage", c6747rV.getMessage());
                fl0.m2580b(new EL0(writableMapCreateMap));
                return;
        }
    }

    /* renamed from: b */
    public final void m3652b(C0417Gc c0417Gc) {
        switch (this.f4606a) {
            case 0:
                break;
            default:
                FL0 fl0 = FL0.f3159g;
                ArrayList arrayList = new ArrayList(c0417Gc.f3816a);
                HashMap map = new HashMap();
                map.put("appName", (String) this.f4607b);
                map.put("resultType", "success");
                map.put("updatedKeys", arrayList);
                fl0.m2580b(new EL0(Arguments.makeNativeMap(map)));
                break;
        }
    }

    /* renamed from: c */
    private final void m3650c(C0417Gc c0417Gc) {
    }
}
