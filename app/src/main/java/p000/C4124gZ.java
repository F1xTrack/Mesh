package p000;

import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Locale;

/* renamed from: gZ */
/* loaded from: classes.dex */
public final class C4124gZ extends C10169lh0 {

    /* renamed from: A */
    public ReadableMap f27834A;

    /* renamed from: B */
    public final AbstractC0881O f27835B;

    /* renamed from: C */
    public final Object f27836C;

    /* renamed from: E */
    public String f27838E;

    /* renamed from: z */
    public Uri f27841z;

    /* renamed from: D */
    public float f27837D = Float.NaN;

    /* renamed from: F */
    public float f27839F = Float.NaN;

    /* renamed from: G */
    public int f27840G = 0;

    public C4124gZ(AbstractC0881O abstractC0881O, Object obj) {
        this.f27835B = abstractC0881O;
        this.f27836C = obj;
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: c */
    public final boolean mo1653c() {
        return true;
    }

    @InterfaceC9871jM0(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f27834A = readableMap;
    }

    @Override // p000.C10169lh0
    public final void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f27839F = (float) dynamic.asDouble();
        } else {
            AbstractC3929dS.m17683p("ReactNative");
            this.f27839F = Float.NaN;
        }
    }

    @InterfaceC9871jM0(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f27838E = str;
    }

    @InterfaceC9871jM0(name = "src")
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
                S91 s91 = this.f2652d;
                UN1.m7999c(s91);
                if (!string.isEmpty()) {
                    uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(s91.getResources().getIdentifier(string.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", s91.getPackageName()))).build();
                }
            } else {
                uriBuild = uri;
            }
        }
        if (uriBuild != this.f27841z) {
            mo2191t();
        }
        this.f27841z = uriBuild;
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "tintColor")
    public void setTintColor(int i) {
        this.f27840G = i;
    }

    @Override // p000.C10169lh0
    public final void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f27837D = (float) dynamic.asDouble();
        } else {
            AbstractC3929dS.m17683p("ReactNative");
            this.f27837D = Float.NaN;
        }
    }
}
