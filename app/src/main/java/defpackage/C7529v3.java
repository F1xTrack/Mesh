package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: v3 */
/* loaded from: classes.dex */
public final class C7529v3 implements InterfaceC0046Ai1 {
    public final C1562Tu0 a = new C1562Tu0(14);
    public final AdvancedExtenderImpl b;
    public String c;
    public final int d;

    public C7529v3(int i) {
        try {
            if (i == 1) {
                this.b = new BokehAdvancedExtenderImpl();
            } else if (i == 2) {
                this.b = new HdrAdvancedExtenderImpl();
            } else if (i == 3) {
                this.b = new NightAdvancedExtenderImpl();
            } else if (i == 4) {
                this.b = new BeautyAdvancedExtenderImpl();
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                }
                this.b = new AutoAdvancedExtenderImpl();
            }
            this.d = i;
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    public static List j(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) ((List) map.get(num)).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List a() {
        AbstractC3377dM1.h(this.c, "VendorExtender#init() must be called first");
        return j(this.b.getSupportedCaptureOutputResolutions(this.c));
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List b() {
        AbstractC3377dM1.h(this.c, "VendorExtender#init() must be called first");
        return j(this.b.getSupportedPreviewOutputResolutions(this.c));
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean c() {
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            return this.b.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List d() {
        List listEmptyList = Collections.emptyList();
        if (MR.d().compareTo(C1591Ue.h) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.b.getAvailableCaptureResultKeys());
        } catch (Exception unused) {
            AbstractC0759Jm0.c("AdvancedVendorExtender");
            return listEmptyList;
        }
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final void e(InterfaceC6907ro interfaceC6907ro) {
        InterfaceC6907ro interfaceC6907ro2 = interfaceC6907ro;
        this.c = interfaceC6907ro2.e();
        this.b.init(this.c, T02.a(interfaceC6907ro2));
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final Size[] f() {
        AbstractC3377dM1.h(this.c, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final AbstractC3987gZ0 g(Context context) {
        AbstractC3377dM1.h(this.c, "VendorExtender#init() must be called first");
        return new a(this.b.createSessionProcessor(), k(), this, context, this.d);
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean h(LinkedHashMap linkedHashMap, String str) {
        if (this.a.s0(str)) {
            return false;
        }
        return this.b.isExtensionAvailable(str, linkedHashMap);
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean i() {
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            return this.b.isPostviewAvailable();
        }
        return false;
    }

    public final List k() {
        List listEmptyList = Collections.emptyList();
        if (MR.d().compareTo(C1591Ue.h) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.b.getAvailableCaptureRequestKeys());
        } catch (Exception unused) {
            AbstractC0759Jm0.c("AdvancedVendorExtender");
            return listEmptyList;
        }
    }

    public final Map l(Size size) {
        C1591Ue c1591Ue = C1591Ue.i;
        return (C3664et.d(c1591Ue) && MR.h(c1591Ue)) ? Collections.unmodifiableMap(this.b.getSupportedPostviewResolutions(size)) : Collections.emptyMap();
    }
}
