package p000;

import android.os.Trace;
import com.facebook.react.bridge.ReadableArray;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Lqu0;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: qu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10835qu0 extends AbstractC11598ws0 {
    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        OY1.m6083a("[ExpoModulesCore] " + (C10835qu0.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "NativeModulesProxy";
            c11979zs0.f47056b = new C10801qd0(12, this);
            C1225TT c1225tt = C1225TT.f11389y;
            IP0 ip0 = BP0.f799a;
            ((LinkedHashMap) c11979zs0.f47060f).put("callMethod", new C6599p9("callMethod", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, c1225tt)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1225TT.f11390z)), new C0887O5(new C8420Vh0(ip0.mo3846b(ReadableArray.class), false, C1225TT.f11361A))}, new C6920tz(1, this)));
            return c11979zs0.m26561b();
        } finally {
            Trace.endSection();
        }
    }
}
