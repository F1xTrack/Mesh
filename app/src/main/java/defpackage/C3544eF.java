package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* renamed from: eF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3544eF {
    public static volatile boolean a;

    public C3544eF(Class cls) {
    }

    public static final void a() {
        if (a) {
            return;
        }
        a = true;
        MT1.b("ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.j("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        Trace.endSection();
    }
}
