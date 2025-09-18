package defpackage;

import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import java.util.Locale;

/* renamed from: gZ */
/* loaded from: classes.dex */
public final class C3986gZ extends C5742lh0 {
    public ReadableMap A;
    public final O B;
    public final Object C;
    public String E;
    public Uri z;
    public float D = Float.NaN;
    public float F = Float.NaN;
    public int G = 0;

    public C3986gZ(O o, Object obj) {
        this.B = o;
        this.C = obj;
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final boolean c() {
        return true;
    }

    @InterfaceC5297jM0(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.A = readableMap;
    }

    @Override // defpackage.C5742lh0
    public final void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.F = (float) dynamic.asDouble();
        } else {
            AbstractC3393dS.p("ReactNative");
            this.F = Float.NaN;
        }
    }

    @InterfaceC5297jM0(name = "resizeMode")
    public void setResizeMode(String str) {
        this.E = str;
    }

    @InterfaceC5297jM0(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri uri;
        Uri uriBuild = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString("uri");
        if (string != null) {
            try {
                uri = Uri.parse(string);
            } catch (Exception unused) {
            }
            try {
                if (uri.getScheme() == null) {
                    uri = null;
                }
            } catch (Exception unused2) {
            }
            if (uri == null) {
                S91 s91 = this.d;
                UN1.c(s91);
                if (!string.isEmpty()) {
                    uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(s91.getResources().getIdentifier(string.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", s91.getPackageName()))).build();
                }
            } else {
                uriBuild = uri;
            }
        }
        if (uriBuild != this.z) {
            t();
        }
        this.z = uriBuild;
    }

    @InterfaceC5297jM0(customType = RemoteMessageAttributes.COLOR, name = "tintColor")
    public void setTintColor(int i) {
        this.G = i;
    }

    @Override // defpackage.C5742lh0
    public final void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.D = (float) dynamic.asDouble();
        } else {
            AbstractC3393dS.p("ReactNative");
            this.D = Float.NaN;
        }
    }
}
