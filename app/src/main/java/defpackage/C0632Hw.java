package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632Hw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0632Hw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(C6850rV c6850rV) {
        switch (this.a) {
            case 0:
                C0710Iw c0710Iw = (C0710Iw) this.b;
                synchronized (c0710Iw) {
                    c0710Iw.d = true;
                }
                ((C0710Iw) this.b).g(c6850rV);
                return;
            default:
                FL0 fl0 = FL0.g;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("resultType", "error");
                writableMapCreateMap.putString("appName", (String) this.b);
                int iX = AbstractC8235ym.x(c6850rV.a);
                if (iX == 0) {
                    writableMapCreateMap.putString("code", "unknown");
                } else if (iX == 1) {
                    writableMapCreateMap.putString("code", "config_update_stream_error");
                } else if (iX == 2) {
                    writableMapCreateMap.putString("code", "config_update_message_invalid");
                } else if (iX == 3) {
                    writableMapCreateMap.putString("code", "config_update_not_fetched");
                } else if (iX != 4) {
                    writableMapCreateMap.putString("code", "internal");
                } else {
                    writableMapCreateMap.putString("code", "config_update_unavailable");
                }
                writableMapCreateMap.putString("message", c6850rV.getMessage());
                writableMapCreateMap.putString("nativeErrorMessage", c6850rV.getMessage());
                fl0.b(new EL0(writableMapCreateMap));
                return;
        }
    }

    public final void b(C0494Gc c0494Gc) {
        switch (this.a) {
            case 0:
                break;
            default:
                FL0 fl0 = FL0.g;
                ArrayList arrayList = new ArrayList(c0494Gc.a);
                HashMap map = new HashMap();
                map.put("appName", (String) this.b);
                map.put("resultType", "success");
                map.put("updatedKeys", arrayList);
                fl0.b(new EL0(Arguments.makeNativeMap(map)));
                break;
        }
    }

    private final void c(C0494Gc c0494Gc) {
    }
}
