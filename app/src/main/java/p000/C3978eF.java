package p000;

import android.os.Trace;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* renamed from: eF */
/* loaded from: classes.dex */
public final class C3978eF {

    /* renamed from: a */
    public static volatile boolean f26611a;

    public C3978eF(Class cls) {
    }

    /* renamed from: a */
    public static final void m17883a() {
        if (f26611a) {
            return;
        }
        f26611a = true;
        MT1.m5371b("ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.m11076j("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        Trace.endSection();
    }
}
